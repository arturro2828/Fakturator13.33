

package sourceCode;
import java.sql.*;
import java.util.Date;
import windows.FakFrame;

public class Database  {
    
    Connection connection = null;
    Statement statement = null;
  
    FakFrame frame = new FakFrame();
    
    
    
    public void connect()
  {
    
   
    try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:test.db");
      connection.setAutoCommit(false);
      System.out.println("Opened database successfully");
      
      statement = connection.createStatement();
      String customerdb = "CREATE TABLE IF NOT EXISTS CUSTOMER (ID INT PRIMARY KEY NOT NULL, CUSTOMER TEXT NOT NULL,  ADDRESS TEXT NOT NULL, TAX INT NOT NULL)";
     // String productdb = "CREATE TABLE IF NOT EXISTS PRODUCT (ID INT PRIMARY KEY NOT NULL, INVOICE_ID INT CONSTRAINT invoice_fk REFERENCES invoice (id),PRODUCT TEXT NOT NULL, QUANTITY INT NOT NULL, PRICE INT NOT NULL)";
      String invoicedb ="CREATE TABLE IF NOT EXISTS INVOICE (ID INT PRIMARY KEY NOT NULL, CUSTOMERID INT CONSTRAINT customer_fk REFERENCES customer (id),"+
      "INVOICENO TEXT,"+
      "INVOICEADDRESS TEXT,"+
      "INVOICEDATE DATETIME,"+
      "DELIVERYADDRESS TEXT,"+
      "CUSTOMERNO TEXT,"+
      "SUPPLIER TEXT,"+
      "TERMSOFPAYMENT INT,"+
      "DUEDATE DATETIME,"+
      "TERMSOFDELIVERY TEXT,"+
      "TAX DECIMAL,"+
      "VALUE DECIMAL,"+
      "TOTAL DECIMAL,"+
      "SIGNATURE TEXT,"+
      "GROSS DECIMAL,"+
      "NO INT,"+
      "PRODUCT TEXT,"+
      "PRICEPERUNIT DECIMAL,"+
      "CURRENCY DECIMAL,"+
      "QUANTITY INT,"+
      "UNIT INT,"+
      "VAT INT)";
     
    statement.execute(customerdb);
    // statement.execute(productdb);
    statement.execute(invoicedb);
     
    PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO CUSTOMER VALUES (?,?,?,?);"); 
     preparedStatement1.setInt(1,1);
     preparedStatement1.setString(2,"moland");
     preparedStatement1.setString(3,"zagorska");
     preparedStatement1.setString(4,"23%");
     preparedStatement1.execute(); 
      
    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO INVOICE VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
    preparedStatement.setInt(1,12323);
    preparedStatement.setInt(2,232323);
    preparedStatement.setString(3,"4r4r4r4r");
    preparedStatement.setString(4,"rrrrr");
    preparedStatement.setString(5,"r4r4r4r");
    preparedStatement.setString(6,"4rt5t5t");
    preparedStatement.setString(7,"4r4r44rg");
    preparedStatement.setString(8,"A&P International");
    preparedStatement.setInt(9,55); 
    preparedStatement.setString(10,"545");
    preparedStatement.setString(11,"454r4f");
    preparedStatement.setFloat(12,4);
    preparedStatement.setFloat(13,5);
    preparedStatement.setFloat(14,6);
    preparedStatement.setString(15,"siggtgtnature");
    preparedStatement.setFloat(16,7);
    preparedStatement.setInt(17,8);
    preparedStatement.setString(18,"gtg");
    preparedStatement.setFloat(19,9);
    preparedStatement.setFloat(20,10);
    preparedStatement.setInt(21,11);
    preparedStatement.setInt(22,12);
    preparedStatement.setInt(23,13);

    preparedStatement.execute();
  
    ResultSet result = statement.executeQuery("SELECT * FROM INVOICE");
    while (result.next()) {
        
    int ID = result.getInt("ID");
    result.getInt ("customerId");
    result.getString ("invoiceNo"); 
    result.getString ("InvoiceAddress");             
    result.getString ("invoiceDate");
    result.getString ("deliveryAddress");
    result.getString ("customerNo");
    String supplier = result.getString ("supplier");
    result.getInt ("termsOfPayment");
    result.getString ("dueDate");
    result.getString ("termsOfDelivery"); 
    result.getFloat ("tax");
    result.getFloat ("value");
    result.getFloat ("total");
    result.getString ("signature");
    result.getFloat ("gross");
    result.getInt ("no");
    result.getString ("product");
    result.getFloat ("pricePerUnit");
    result.getFloat ("currency");
    result.getInt ("quantity");
    result.getInt ("unit");
    result.getInt ("vat");
    
  frame.supplierText.setValue(supplier);
   }
    String customerdb1 = "INSERT INTO CUSTOMER values (111,'art','zagorska',23)";
      statement.executeUpdate(customerdb1);
 
      Date date = new Date();
      
      ResultSet rs = statement.executeQuery( "SELECT * FROM CUSTOMER;" );
      int id = rs.getInt("id");
      String name = rs.getString("customer");
      int address = rs.getInt("address");
      int tax = rs.getInt("tax");
      

        
    frame.invoiceDateText.setValue(date);
    frame.setVisible(true); 
    
     
       
   
      
     
    } catch ( ClassNotFoundException | SQLException exception ) {
      System.err.println( exception.getClass().getName() + ": " + exception.getMessage() );
      System.exit(0);
    }
    
    System.out.println("Table created successfully");
    
  }

    
}

