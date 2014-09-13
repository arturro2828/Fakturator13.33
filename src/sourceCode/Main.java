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
     Database database = Database.getDatabase();
     database.connect();


     Date date = new Date();
     date.Date();


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
    Database database = Database.getDatabase();
   Object selectedCustomer = frame.CustomerNoText.getSelectedItem();
   int customerID = ((SelectItem) selectedCustomer).getId();

       try {
           Customer customer = database.getCustomerById(customerID);
           frame.issueToText.setValue(customer.getCustomerName()+" - "+ customer.getCompanyAddress());
           frame.shipToText.setValue(customer.getCustomerName()+" - "+ customer.getDeliveryAddress());
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
   Database database = Database.getDatabase();
   Object selectedProduct = frame.choosingProduct.getSelectedItem();
   int productID = ((SelectItem) selectedProduct).getId();

     try {
           Product product = database.getProductById(productID);
           int n = 1;
           
           // jakas petla
           frame.listaProduktow.getModel().getValueAt(0, 0);
           
           
           frame.listaProduktow.setValueAt(n, 0, 0);
           frame.listaProduktow.setValueAt(product.getProductName(), 0, 1);
           frame.listaProduktow.setValueAt(product.getPrice(), 0, 2);
           frame.listaProduktow.setValueAt("PLN", 0, 4);
           
       } catch (SQLException ex) {

       }

    }
  });

  



    }

  }

