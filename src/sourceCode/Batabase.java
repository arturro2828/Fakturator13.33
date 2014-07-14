

package sourceCode;
import sourceCode.Invoice;
import java.sql.*;

public class Batabase {
    
  public void connect(){
    Connection connection = null;
    Statement statement = null;
   
    try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:test.db");
      connection.setAutoCommit(false);
      System.out.println("Opened database successfully");
      
      statement = connection.createStatement();
      String customer = "CREATE TABLE IF NOT EXISTS CUSTOMER (ID INT PRIMARY KEY NOT NULL, CUSTOMER TEXT NOT NULL,  ADDRESS TEXT NOT NULL,  TAX_ID TEXT NOT NULL)";
      String product = "CREATE TABLE IF NOT EXISTS PRODUCT (ID INT PRIMARY KEY NOT NULL, INVOICE_ID INT CONSTRAINT invoice_fk REFERENCES invoice (id),PRODUCT TEXT NOT NULL, QUANTITY INT NOT NULL, PRICE INT NOT NULL)";
      String invoice = "CREATE TABLE IF NOT EXISTS INVOICE (ID INT PRIMARY KEY NOT NULL, CUSTOMER_ID INT CONSTRAINT customer_fk REFERENCES customer (id),"+
      "INVOICE_NO TEXT,"+
      "INVOICE_ADDRESS TEXT,"+
      "INVOICE_DATE DATETIME,"+
      "DELIVERY_ADRESS TEXT,"+
      "CUSTOMER_NO TEXT,"+
      "SUPPLIER TEXT"+
      "TERMS_OF_PAYMENT INT,"+
      "DATE_OF_PAYMENT DATETIME,"+
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
     
      statement.execute(customer);
      statement.execute(product);
      statement.execute(invoice);
      
      
    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO invoice VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
    preparedStatement.setInt(1,23);
    preparedStatement.setInt(2,23);
    preparedStatement.setString(3,"a");
    preparedStatement.setString(4,"a");
    preparedStatement.setString(1,"a");
    preparedStatement.setString(1,"a");
    preparedStatement.setString(1,"a");
    preparedStatement.setString(1,"a");
    preparedStatement.setInt(1,23);
    preparedStatement.setInt(1,23);
    preparedStatement.setString(1,"a");
    preparedStatement.setString(1,"a");
    preparedStatement.setFloat(1,23);
    preparedStatement.setFloat(1,23);
    preparedStatement.setFloat(1,23);
    preparedStatement.setString(1,"a");
    preparedStatement.setFloat(1,23);
    preparedStatement.setInt(1,23);
    preparedStatement.setString(1,"a");
    preparedStatement.setFloat(1,23);
    preparedStatement.setFloat(1,23);
    preparedStatement.setInt(1,23);
    preparedStatement.setInt(1,23);
    preparedStatement.setInt(1,23);
    
  
    
    
    
    preparedStatement.execute();
    ResultSet result = statement.executeQuery("SELECT * FROM invoice");
    while (result.next()) {
    result.getInt("ID");
    result.getInt ("customerId");
    result.getString ("invoiceNr");       
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
   }
     
    } catch ( Exception exception ) {
      System.err.println( exception.getClass().getName() + ": " + exception.getMessage() );
      System.exit(0);
    }
    
    System.out.println("Table created successfully");
  }

    
}

