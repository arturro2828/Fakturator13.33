package sourceCode;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.InvoiceProduct;
import model.Product;
import model.Invoicing;
import windows.FakFrame;

public class Database {

 Connection connection = null;
 Statement statement = null;

 static private Database database = null;

 static public Database getDatabase() {
  if (Database.database == null) {
   Database.database = new Database();
  }

  return Database.database;
 }

 public void connect() {

  try {
   Class.forName("org.sqlite.JDBC");
   connection = DriverManager.getConnection("jdbc:sqlite:test.db");
   connection.setAutoCommit(false);
   System.out.println("Opened database successfully");
   statement = connection.createStatement();

   //-------------------------------------------------------------------------------------------------------
   statement.execute("DROP TABLE IF EXISTS customer;");
   statement.execute("DROP TABLE IF EXISTS product;");
   statement.execute("DROP TABLE IF EXISTS invoicing;");
   //-------------------------------------------------------------------------------------------------------

   String createCustomer = "CREATE TABLE IF NOT EXISTS customer (id_customer INTEGER PRIMARY KEY AUTOINCREMENT, customerName TEXT, companyAddress TEXT, deliveryAddress TEXT);";
   String createProduct = "CREATE TABLE IF NOT EXISTS product (id_product INTEGER PRIMARY KEY AUTOINCREMENT,productName TEXT, price FLOAT);";
   String createInvoicing = "CREATE TABLE IF NOT EXISTS invoicing ("
           + "id_invoicing INTEGER PRIMARY KEY AUTOINCREMENT, "
           + "invoiceNo TEXT, "
           + "date_sell TEXT, "
           + "date_payment TEXT, "
           + "customerId INTEGER, "
           + "netto REAL, "
           + "brutto REAL, "
           + "tax_rate REAL, "
           + "FOREIGN KEY (customerId) REFERENCES customer(id_customer));";

   String createPivot = "CREATE TABLE IF NOT EXISTS invoice_product (id INTEGER PRIMARY KEY AUTOINCREMENT, productId INTEGER, invoiceId INTEGER,"
           + "FOREIGN KEY (productId) REFERENCES product(id_product)"
           + "FOREIGN KEY (invoiceId) REFERENCES invoicing(id_invoicing));";

   statement.execute(createCustomer);
   statement.execute(createProduct);
   statement.execute(createInvoicing);
   statement.execute(createPivot);

   List<Customer> customers = this.selectCustomer();
   if (customers.isEmpty()) {
    this.insertCustomer("Krauze", "Warszawa", "Warszawa");
    this.insertCustomer("Sołowow", "Kielce", "Kopenhaga");
    this.insertCustomer("Solorz-Żak", "Warszawa", "Hawaii");
    this.insertCustomer("Czarnecki", "Londyn", "Pruszków");
   }

   List<Product> products = this.selectProduct();
   if (products.isEmpty()) {
    this.insertProduct("Dąb", 65);
    this.insertProduct("Brzoza", 55);
    this.insertProduct("Jesion", 63);
    this.insertProduct("Czereśnia", 70);
   }

  } catch (ClassNotFoundException | SQLException exception) {
   System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
   System.exit(0);
  }

  System.out.println("Table created successfully");
 }

 public boolean insertInvoicing(String invoiceNo, int idCustomer, LinkedList<Integer> productsListID, String dateSell, String datePayment, Double netto, Double brutto, Double taxRate) {
  try {
   PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO invoicing VALUES (NULL, ?,?,?,?,?,?,?);");
   preparedStatement.setString(1, invoiceNo);
   preparedStatement.setString(2, dateSell);
   preparedStatement.setString(3, datePayment);
   preparedStatement.setInt(4, idCustomer);
   preparedStatement.setDouble(4, netto);
   preparedStatement.setDouble(5, brutto);
   preparedStatement.setDouble(6, taxRate);
   preparedStatement.execute();

   Invoicing invoice = null;
   invoice = this.getInvoiceByName(invoiceNo);

   for (Integer element : productsListID) {
    preparedStatement = connection.prepareStatement("INSERT INTO invoice_product VALUES (NULL, ?,?);");
    preparedStatement.setInt(1, element);
    preparedStatement.setInt(2, invoice.getId());
   }
  } catch (SQLException e) {
   System.err.println("Invoicing ERROR");
   return false;
  }
  return true;
 }

 public Invoicing getInvoiceByName(String name) throws SQLException {

  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM invoicing WHERE invoiceNo = ?;");
  preparedStatement.setString(1, name);
  preparedStatement.executeQuery();
  ResultSet rs = preparedStatement.executeQuery();

  Customer customer = null;
  Invoicing invoice = new Invoicing();
  while (rs.next()) {
   invoice.setId(rs.getInt("id_invoicing"));
   invoice.setInvoiceNo(rs.getString("invoiceNo"));
   invoice.setDateSell(rs.getString("date_sell"));
   invoice.setDatePayment(rs.getString("date_payment"));
   invoice.setNetto(rs.getFloat("netto"));
   invoice.setBrutto(rs.getFloat("brutto"));
   invoice.setTaxRate(rs.getFloat("tax_rate"));
   customer = this.getCustomerById(rs.getInt("customerId"));
   invoice.setCustomer(customer);
  }
  return invoice;
 }






 public boolean insertCustomer(String customerName, String companyAddress, String deliveryAddress) {
  try {
   PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer VALUES (NULL, ?,?,?);");
   preparedStatement.setString(1, customerName);
   preparedStatement.setString(2, companyAddress);
   preparedStatement.setString(3, deliveryAddress);
   preparedStatement.execute();
  } catch (SQLException e) {
   System.err.println("insertCustomer ERROR");
   return false;
  }
  return true;
 }

 public boolean insertProduct(String productName, float price) {
  try {
   PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO product VALUES (NULL, ?,?);");
   preparedStatement.setString(1, productName);
   preparedStatement.setFloat(2, price);
   preparedStatement.execute();
  } catch (SQLException e) {
   System.err.println("insertProduct ERROR");
   return false;
  }
  return true;
 }

 public List<Customer> selectCustomer() {
  List<Customer> customer = new LinkedList<Customer>();
  try {
   ResultSet rs = statement.executeQuery("SELECT * FROM customer;");
   int ID;
   String customerName, companyAddress, deliveryAddress;
   while (rs.next()) {
    ID = rs.getInt("id_customer");
    customerName = rs.getString("customerName");
    companyAddress = rs.getString("companyAddress");
    deliveryAddress = rs.getString("deliveryAddress");
    customer.add(new Customer(ID, customerName, companyAddress, deliveryAddress));
   }
  } catch (SQLException e) {
   e.printStackTrace();
   return null;
  }
  return customer;

 }

 public List<Product> selectProduct() {
  List<Product> product = new LinkedList<Product>();
  try {
   ResultSet rs = statement.executeQuery("SELECT * FROM product;");
   int ID;
   String productName;
   float price;
   while (rs.next()) {
    ID = rs.getInt("id_product");
    productName = rs.getString("productName");
    price = rs.getFloat("price");
    product.add(new Product(ID, productName, price));
   }
  } catch (SQLException e) {
   e.printStackTrace();
   return null;
  }
  return product;
 }

  public List<Invoicing> selectInvoice() {
  List<Invoicing> invoices = new LinkedList<>();
  try {
   ResultSet rs = statement.executeQuery("SELECT * FROM product;");
   int ID;
   String productName;
   float price;
   while (rs.next()) {
    ID = rs.getInt("id_product");
    productName = rs.getString("productName");
    price = rs.getFloat("price");
    //invoices.add(new Product(ID, productName, price));
   }
  } catch (SQLException e) {
   e.printStackTrace();
   return null;
  }
  return invoices;
 }

 public Customer getCustomerById(int ID) throws SQLException {

  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer WHERE id_customer = ?;");
  preparedStatement.setInt(1, ID);
  preparedStatement.executeQuery();
  ResultSet rs = preparedStatement.executeQuery();

  Customer customer = new Customer();
  while (rs.next()) {
   customer.setID(rs.getInt("id_customer"));
   customer.setCustomerName(rs.getString("customerName"));
   customer.setCompanyAddress(rs.getString("companyAddress"));
   customer.setDeliveryAddress(rs.getString("deliveryAddress"));

  }
  return customer;
 }

 public Product getProductById(int ID) throws SQLException {

  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product WHERE id_product = ?;");
  preparedStatement.setInt(1, ID);
  preparedStatement.executeQuery();
  ResultSet rs = preparedStatement.executeQuery();

  Product product = new Product();
  while (rs.next()) {
   product.setID(rs.getInt("id_product"));
   product.setProductName(rs.getString("productName"));
   product.setPrice(rs.getFloat("price"));

  }
  return product;
 }

 public Product getProductByName(String name) throws SQLException {

  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product WHERE productName = ?;");
  preparedStatement.setString(1, name);
  preparedStatement.executeQuery();
  ResultSet rs = preparedStatement.executeQuery();

  Product product = new Product();
  while (rs.next()) {
   product.setID(rs.getInt("id_product"));
   product.setProductName(rs.getString("productName"));
   product.setPrice(rs.getFloat("price"));

  }
  return product;
 }

 public void closeConnection() {
  try {
   connection.close();
  } catch (SQLException e) {
   System.err.println("Connection ERROR");
   e.printStackTrace();
  }
 }

}
