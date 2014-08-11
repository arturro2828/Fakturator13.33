

package sourceCode;

import java.awt.event.ActionListener;
import java.sql.*;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import windows.FakFrame;
import windows.SelectItem;
import java.util.List;
import model.Customer;
import model.Product;
import model.Invoicing;

public class Database  {
    
    Connection connection = null;
    Statement statement = null;
    
    
    public void connect()
  {
    
   
    try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:test.db");
      connection.setAutoCommit(false);
      System.out.println("Opened database successfully");
      statement = connection.createStatement();
      //nie dzialaja id_customer INTEGER CONSTRAINT customer_fk REFERENCES customer (id)
           
      String createCustomer = "CREATE TABLE IF NOT EXISTS customer (id_customer INTEGER PRIMARY KEY AUTOINCREMENT,  customerName varchar(255), companyAddress varchar(255), deliveryAddress varchar(255))";
      String createProduct = "CREATE TABLE IF NOT EXISTS product (id_product INTEGER PRIMARY KEY AUTOINCREMENT,productName varchar(255), price FLOAT)";
      String createInvoicing = "CREATE TABLE IF NOT EXISTS invoicing (id_invoicing INTEGER PRIMARY KEY AUTOINCREMENT, id_customer int, id_product int)";
     
      statement.execute(createCustomer );
      statement.execute(createProduct);
      statement.execute(createInvoicing);
    
   
     
    } catch ( ClassNotFoundException | SQLException exception ) {
      System.err.println( exception.getClass().getName() + ": " + exception.getMessage() );
      System.exit(0);
    }
    
    System.out.println("Table created successfully");
   
  
  }

   public boolean insertCustomer(String customerName, String companyAddress, String deliveryAddress) {
        try {
    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer VALUES (NULL, ?,?,?);"); 
    preparedStatement.setString(1,customerName);
    preparedStatement.setString(2,companyAddress);
    preparedStatement.setString(3,deliveryAddress);
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
    preparedStatement.setString(1,productName);
    preparedStatement.setFloat(2,price);
    preparedStatement.execute();             
        } catch (SQLException e) {
            System.err.println("insertProduct ERROR");
            return false;
        }
        return true;
    } 
   public boolean insertInvoicing(int idCustomer, int idProduct) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO invoicing VALUES (NULL, ?,?);"); 
            preparedStatement.setInt(1, idCustomer);
            preparedStatement.setInt(2, idProduct);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("Invoicing ERROR");
            return false;
        }
        return true;
    }
        
      
   public List<Customer> selectCustomer() {
        List<Customer> customer = new LinkedList<Customer>();
        try {
            ResultSet rs = statement.executeQuery( "SELECT * FROM customer" );
            int ID;
            String customerName,companyAddress,deliveryAddress;
            while(rs.next()) {
                ID = rs.getInt("id_customer");
                customerName = rs.getString("customerName");
                companyAddress = rs.getString("companyAddress");
                deliveryAddress = rs.getString("deliveryAddress");  
                customer.add(new Customer(ID, customerName,companyAddress, deliveryAddress));  
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
            ResultSet rs = statement.executeQuery("SELECT * FROM product");
            int ID;
            String productName;    
            float price;  
            while(rs.next()) {
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
 
   public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Connection ERROR");
            e.printStackTrace();
        }}
}

