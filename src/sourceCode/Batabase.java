

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
      String invoice = "CREATE TABLE IF NOT EXISTS INVOICE (ID INT PRIMARY KEY NOT NULL, KLIENT_ID INT CONSTRAINT klient_fk REFERENCES klient (id),"+
      "INVOICE_NR TEXT NOT NULL,"+
      "INVOICE_ADDRESS TEXT NOT NULL,"+
      "INVOICE_DATE DATETIME NOT NULL,"+
      "DELIVERY_ADRESS TEXT NOT NULL,"+
      "CUSTOMER_NUMBER TEXT NOT NULL,"+
      "SUPPLIER TEXT NOT NULL,"+
      "TERMS_OF_PAYMENT INT NOT NULL,"+
      "DATE_OF_PAYMENT DATETIME NOT NULL,"+
      "TERMS_OF_DELIVERY TEXT NOT NULL,"+
      "TAX DECIMAL NOT NULL,"+
      "VALUE DECIMAL NOT NULL,"+
      "TOTAL DECIMAL NOT NULL,"+
      "SIGNATURE TEXT NOT NULL,"+
      "GROSS DECIMAL NOT NULL,"+
      "NO INT NOT NULL,"+
      "PRODUCT TEXT NOT NULL,"+
      "PRICE_PER_UNIT DECIMAL NOT NULL,"+
      "CURRENCY DECIMAL NOT NULL,"+
      "QUANTITY INT NOT NULL,"+
      "UNIT INT NOT NULL,"+
      "VAT INT NOT NULL)";
     
      statement.execute(customer);
      statement.execute(product);
      statement.execute(invoice);
      
      
    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO invoice VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
    //preparedStatement.setString(1, Invoice.);
    preparedStatement.execute();
    ResultSet result = statement.executeQuery("SELECT * FROM invoice");
    while (result.next()) {
    result.getInt("id");
    result.getString("name");
   }
     
    } catch ( Exception exception ) {
      System.err.println( exception.getClass().getName() + ": " + exception.getMessage() );
      System.exit(0);
    }
    
    System.out.println("Table created successfully");
  }

    
}

