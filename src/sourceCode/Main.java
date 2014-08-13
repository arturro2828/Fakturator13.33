package sourceCode;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import model.Customer;
import model.Product;
import model.Invoicing; 
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import windows.FakFrame;
import windows.SelectItem;


public class Main {
    
    static private  FakFrame window =null;
    static public FakFrame getWindow() {
    if (Main.window == null) {
      Main.window = new FakFrame();
     }

     return Main.window;
    }
   
   
    public static void main(String[] args)  {
        
     
  
     
     FakFrame frame = Main.getWindow();
     final Customer  customer = new Customer ();
     Product product = new Product();
     Invoicing invoicing = new Invoicing();
     Database database = new Database();
     database.connect();  
     
     Date date = new Date();
     date.Date();
     
     database.insertCustomer("Krauze", "Warszawa", "Warszawa");
     database.insertCustomer("Sołowow","Kielce", "Kopenhaga");
     database.insertCustomer("Solorz-Żak","Warszawa", "Hawaii");
     database.insertCustomer("Czarnecki","Londyn", "Pruszków");
     database.insertProduct("Dąb", 800);
     database.insertProduct("Brzoza", 12000.8f);
     
     List<Customer> customers = database.selectCustomer();
     List<Product> products = database.selectProduct();  
   
  
    
    
  //frame.issueToText.setValue(customers);
  // frame.shipToText.setValue(customers.get(0).getCompanyAddress());
    
 
  
     ///pomocnnicze wyswietlanie
     System.out.println("Customers List: ");
     for(Customer c: customers)
     System.out.println(c);
     
     System.out.println("Products List: ");
     for(Product p: products)
     System.out.println(p);
  
     
     
         frame.CustomerNoText.removeAllItems();
         for(Customer c: customers){
         frame.CustomerNoText.addItem(new SelectItem(c.getID(),c.getCustomerName()));
     }
     
          
   for (ActionListener listener : frame.CustomerNoText.getActionListeners()) {
   frame.CustomerNoText.removeActionListener(listener);
  }
  frame.CustomerNoText.addActionListener(new java.awt.event.ActionListener() {
   @Override
   public void actionPerformed(java.awt.event.ActionEvent evt) {
   
   FakFrame frame = Main.getWindow();  
    Database database = new Database();
   Object selectedCustomer = frame.CustomerNoText.getSelectedItem();
   int customerID = ((SelectItem) selectedCustomer).getId();
  
       try {
           Customer customer = database.getCustomerById(customerID);
       } catch (SQLException ex) {
           
       }
    
   frame.issueToText.setValue(customer.getID());
   frame.shipToText.setValue(customer.getCompanyAddress());
  // frame.setVisible(true); 
    
    }
  }); 
  
    }
    
  }
       
