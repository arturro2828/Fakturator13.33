
package sourceCode;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import windows.SelectItem;
import windows.FakFrame;
import model.Customer;
import model.Invoicing;

public class Date{
    FakFrame frame = Main.getWindow();
    
    public void Date(){
         
  
  GregorianCalendar calendar = new GregorianCalendar();
  int month = calendar.get(Calendar.MONTH)+1;
  int day = calendar.get(Calendar.DAY_OF_MONTH);
  int year = calendar.get(Calendar.YEAR);
  frame.invoiceDateText.setValue(day+"-"+month+"-"+year );
  
  
  
  frame.TermsOfPaymentText.removeAllItems();
  frame.TermsOfPaymentText.addItem(new SelectItem(0,"Choose number of days"));
  frame.TermsOfPaymentText.addItem(new SelectItem(1,"1 day"));
  frame.TermsOfPaymentText.addItem(new SelectItem(5,"5 days"));
  frame.TermsOfPaymentText.addItem(new SelectItem(10,"10 days"));
  frame.TermsOfPaymentText.addItem(new SelectItem(30,"30 days"));
  
          
   for (ActionListener listener : frame.TermsOfPaymentText.getActionListeners()) {
   frame.TermsOfPaymentText.removeActionListener(listener);
  }
  frame.TermsOfPaymentText.addActionListener(new java.awt.event.ActionListener() {
   @Override
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    
       
  Object selectedDate = frame.TermsOfPaymentText.getSelectedItem();
  int daysAdded = ((SelectItem) selectedDate).getId();
  
  GregorianCalendar calendar = new GregorianCalendar();
  int month = calendar.get(Calendar.MONTH)+1;
  int day = calendar.get(Calendar.DAY_OF_MONTH);
  int year = calendar.get(Calendar.YEAR);
  
  if (day + daysAdded >= 31) {month = month+1; day =(day +daysAdded-31);} else {day = day + daysAdded;}
  frame.DueDateText.setValue( day+"-"+month+"-"+year); 
  
    
   }
  });  
      Invoicing invoicing = new Invoicing(); 
  frame.invoiceNoText.setValue(year+""+month+""+invoicing.getIdCustomer());
  frame.setVisible(true);
    }
    
}
 
    

