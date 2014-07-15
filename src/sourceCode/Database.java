

package sourceCode;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;

public class Database {
    
  public void connect()
  {
    Connection connection = null;
    Statement statement = null;
   
    try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:test.db");
      connection.setAutoCommit(false);
      System.out.println("Opened database successfully");
      
      statement = connection.createStatement();
      String customerdb = "CREATE TABLE IF NOT EXISTS CUSTOMER (ID INT PRIMARY KEY NOT NULL, CUSTOMER TEXT NOT NULL,  ADDRESS TEXT NOT NULL,  TAX_ID TEXT NOT NULL)";
      String productdb = "CREATE TABLE IF NOT EXISTS PRODUCT (ID INT PRIMARY KEY NOT NULL, INVOICE_ID INT CONSTRAINT invoice_fk REFERENCES invoice (id),PRODUCT TEXT NOT NULL, QUANTITY INT NOT NULL, PRICE INT NOT NULL)";
      String invoicedb = "CREATE TABLE IF NOT EXISTS INVOICE (ID INT PRIMARY KEY NOT NULL, CUSTOMER_ID INT CONSTRAINT customer_fk REFERENCES customer (id),"+
      "INVOICE_NO TEXT,"+
      "INVOICE_ADDRESS TEXT,"+
      "INVOICE_DATE DATETIME,"+
      "DELIVERY_ADRESS TEXT,"+
      "CUSTOMER_NO TEXT,"+
      "SUPPLIER TEXT"+
      "TERMS_OF_PAYMENT INT,"+
      "DUE_DATE DATETIME,"+
      "TERMS_OF_DELIVERY TEXT,"+
      "TAX DECIMAL,"+
      "VALUE DECIMAL,"+
      "TOTAL DECIMAL,"+
      "SIGNATURE TEXT,"+
      "GROSS DECIMAL,"+
      "NO INT,"+
      "PRODUCT TEXT,"+
      "PRICE_PER_UNIT DECIMAL,"+
      "CURRENCY DECIMAL,"+
      "QUANTITY INT,"+
      "UNIT INT,"+
      "VAT INT)";
     
     statement.execute(customerdb);
     statement.execute(productdb);
     statement.execute(invoicedb);
      
      
    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO INVOICE VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
    preparedStatement.setInt(1,1);
    preparedStatement.setInt(2,2);
    preparedStatement.setString(3,"invoiceNo");
    preparedStatement.setString(4,"address");
    preparedStatement.setString(5,"invoiceDate");
    preparedStatement.setString(6,"deliveryAddress");
    preparedStatement.setString(7,"customerNumber");
    preparedStatement.setString(8,"supplier");
    preparedStatement.setInt(9,3); 
    preparedStatement.setString(10,"dueDate");
    preparedStatement.setString(11,"termsOfDelivery");
    preparedStatement.setFloat(12,4);
    preparedStatement.setFloat(13,5);
    preparedStatement.setFloat(14,6);
    preparedStatement.setString(15,"signature");
    preparedStatement.setFloat(16,7);
    preparedStatement.setInt(17,8);
    preparedStatement.setString(18,"product");
    preparedStatement.setFloat(19,9);
    preparedStatement.setFloat(20,10);
    preparedStatement.setInt(21,11);
    preparedStatement.setInt(22,12);
    preparedStatement.setInt(23,13);

    preparedStatement.execute();
    
    ResultSet result = statement.executeQuery("SELECT * FROM INVOICE");
    while (result.next()) {
    result.getInt("ID");
    result.getInt ("customerId");
    result.getString ("invoiceNo");       
    result.getString ("address");              
    result.getString ("invoiceDate"); 
    result.getString ("deliveryAddress");
    result.getString ("customerNumber");
    result.getString ("supplier");
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
  System.out.println( "ID = " + 1 );
   }
         
     
    } catch ( Exception exception ) {
      System.err.println( exception.getClass().getName() + ": " + exception.getMessage() );
      System.exit(0);
    }
    
    System.out.println("Table created successfully");
    
  }

    
}

