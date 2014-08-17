package sourceCode;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import model.Customer;
import model.Product;
import model.Invoicing; 
import java.util.List;
import windows.FakFrame;
import windows.SelectItem;


public class Main {
    
    static private  FakFrame window = null;
    static public FakFrame getWindow() {
    if (Main.window == null) {
      Main.window = new FakFrame();
     }

     return Main.window;
    }
   
   
    public static void main(String[] args)  {
     
     FakFrame frame = Main.getWindow(); 
     Invoicing invoicing = new Invoicing();
     Database database = new Database();
     database.connect();  
    
     
     Date date = new Date();
     date.Date();
     
     database.insertCustomer("Krauze", "Warszawa", "Warszawa");
     database.insertCustomer("Sołowow","Kielce", "Kopenhaga");
     database.insertCustomer("Solorz-Żak","Warszawa", "Hawaii");
     database.insertCustomer("Czarnecki","Londyn", "Pruszków");
     database.insertProduct("Dąb", 65);
     database.insertProduct("Brzoza", 55);
     database.insertProduct("Jesion", 63);
     database.insertProduct("Czereśnia", 70);
     
     
     List<Customer> customers = database.selectCustomer();
     List<Product> products = database.selectProduct();  

  
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
     database.connect();  
   Object selectedCustomer = frame.CustomerNoText.getSelectedItem();
   int customerID = ((SelectItem) selectedCustomer).getId();
  
       try {
           Customer customer = database.getCustomerById(customerID);
           frame.issueToText.setValue(customer.getCustomerName()+" - "+ customer.getCompanyAddress());
           frame.shipToText.setValue(customer.getCustomerName()+" - "+ customer.getDeliveryAddress());        
           frame.supplierText.setValue("A&P International");
       } catch (SQLException ex) {
           
       }
         
    }
  }); 
          
 
  
  frame.choosingProduct.removeAllItems();
         for(Product p: products){
         frame.choosingProduct.addItem(new SelectItem(p.getID(),p.getProductName()));
     }
     
         
   for (ActionListener listener : frame.choosingProduct.getActionListeners()) {
   frame.choosingProduct.removeActionListener(listener);
  }
  frame.choosingProduct.addActionListener(new java.awt.event.ActionListener() {
   @Override
   public void actionPerformed(java.awt.event.ActionEvent evt) {
   
   FakFrame frame = Main.getWindow();  
    Database database = new Database();
     database.connect();  
   Object selectedProduct = frame.choosingProduct.getSelectedItem();
   int productID = ((SelectItem) selectedProduct).getId();
  
     try {
           Product product = database.getProductById(productID);
           frame.listaProduktow.setValueAt(product.getProductName(), 0, 1);
           frame.listaProduktow.setValueAt(product.getPrice(), 0, 2);
       } catch (SQLException ex) {
           
       }
         
    }
  }); 
  
 
  
    }
    
  }
       
