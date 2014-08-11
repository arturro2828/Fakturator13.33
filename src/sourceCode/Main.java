package sourceCode;



import model.Customer;
import model.Product;
import model.Invoicing; 
import java.util.List;
import windows.FakFrame;


public class Main {

    
    public static void main(String[] args)  {
        
     
   //Customer customer = new Customer();
     FakFrame frame = new FakFrame();
     
     Customer  customer1 = new Customer ();
     Product product1 = new Product();
     Invoicing invoicing = new Invoicing();
     Database database = new Database();
     database.connect();  
     
     Date date = new Date();
     date.Date();
     database.insertCustomer("Krauze", "Warszawa", "Warszawa");
     database.insertCustomer("Sołowow","Kielce", "Kopenhaga");
     database.insertProduct("Dąb", 12);
     database.insertProduct("Brzoza", 12.8f);
     
     List<Customer> customer = database.selectCustomer();
     List<Product> product = database.selectProduct();  
   
    // frame.setVisible(true);
  frame.issueToText.setValue(customer);
     frame.shipToText.setValue(customer.get(0));
    
  // frame.invoiceDateText.setValue(date.day);
  frame.setVisible(true); 
     ///pomocnnicze wyswietlanie
     System.out.println("Customers List: ");
     for(Customer c: customer)
     System.out.println(c);
     
     System.out.println("Products List: ");
     for(Product p: product)
     System.out.println(p);
  
     database.closeConnection();
        
    }
    
}
