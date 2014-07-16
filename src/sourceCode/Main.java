package sourceCode;
import java.sql.ResultSet;
import windows.FakFrame;

public class Main {

    
    public static void main(String[] args) {
        
      // Invoice invoice = new Invoice();
       
       // Database database = new Database();
       // database.connect();
        
        new Database().connect();
     
        
        FakFrame frame = new FakFrame();
        frame.setVisible(true);
        
       
      System.out.println("Dane faktury: ");
      
      //System.out.println(database. );
        
    }
    
}
