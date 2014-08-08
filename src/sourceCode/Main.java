package sourceCode;



import model.Customer;
import model.Product;
import java.util.List;
import windows.FakFrame;


public class Main {

    
    public static void main(String[] args)  {
        
     
   //Customer customer = new Customer();
     FakFrame frame = new FakFrame();
     Customer  customer1 = new Customer ();
     Product product1 = new Product();
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
     
     
     frame.issueToText.setValue(customer.set(0, customer1));
     frame.shipToText.setValue(customer1.companyAddress);
  // frame.invoiceDateText.setValue(date.day);
   // frame.setVisible(true); 
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
