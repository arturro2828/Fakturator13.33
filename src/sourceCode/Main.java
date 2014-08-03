package sourceCode;
//import java.util.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import windows.FakFrame;
import model.Customer;
import model.Invoicing;
import java.util.List;


public class Main {

    
    public static void main(String[] args)  {
        
     // Invoice invoice = new Invoice();
      Database database = new Database();
     database.connect();  
      FakFrame frame = new FakFrame();
   
      
        database.insertCustomer("Warszawa", "Warszawa");
        database.insertCustomer("Kielce", "Kopenhaga");
        List<Customer> customer = database.selectCustomer();
     frame.issueToText.setValue(database.selectCustomer());
     frame.shipToText.setValue(customer);
      for(Customer c: customer)
            System.out.println(c);
      frame.setVisible(true); 
             
        
    }
    
}
