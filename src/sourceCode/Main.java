package sourceCode;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import model.Customer;
import model.Product;
import model.Invoicing;
import java.util.List;
import javax.swing.table.DefaultTableModel;
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

     DefaultTableModel model = (DefaultTableModel) frame.listaProduktow.getModel();
     model.setRowCount(0);
     model.setRowCount(4);

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
           frame.issueToText.setValue(customer.getCompanyAddress());
           frame.shipToText.setValue(customer.getDeliveryAddress());
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

           Integer columCount;
           Integer rowCount;

           Integer row = 0;
           Integer column = 0;

           Boolean emptyRow = true;
           Boolean extendTable = false;

           Object value;

           columCount = frame.listaProduktow.getModel().getColumnCount();
           rowCount = frame.listaProduktow.getModel().getRowCount();

           while (true) {
            value = frame.listaProduktow.getModel().getValueAt(row, column);
            if (value != null) {
             emptyRow = false;
            }

            if (column < columCount-1) {
             column++;
            } else {
             if (emptyRow) { //koniec wiersza
              break;
             }
             if (row < rowCount-1) { //przejscie do kolejnego wiersza
              emptyRow = true;
              column = 0;
              row++;
             } else { //cala tabela przeszukana
              extendTable = true;
              break;
             }
            }
           }

           if (extendTable) {
            DefaultTableModel model = (DefaultTableModel) frame.listaProduktow.getModel();
            model.setRowCount(row+2);
            row++;
           }

           frame.listaProduktow.setValueAt(row+1, row, 0);
           frame.listaProduktow.setValueAt(product.getProductName(), row, 1);
           frame.listaProduktow.setValueAt(product.getPrice(), row, 2);
           frame.listaProduktow.setValueAt(1, row, 3);
           frame.listaProduktow.setValueAt(23.0, row, 4);
           frame.listaProduktow.setValueAt(product.getPrice(), row, 5);


       } catch (SQLException ex) {

       }

    }
  });





    }

  }

