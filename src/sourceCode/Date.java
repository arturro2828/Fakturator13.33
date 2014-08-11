
package sourceCode;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JFrame;
import java.util.GregorianCalendar;
import windows.SelectItem;
import windows.FakFrame;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import model.Customer;

public class Date{
    FakFrame frame = new FakFrame();
 
    public void Date(){
         
  
  GregorianCalendar calendar = new GregorianCalendar();
  //Date date = new Date();    
 //calendar.setTime(date);
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
  Integer daysAdded = ((SelectItem) selectedDate).getId();
  
  GregorianCalendar calendar = new GregorianCalendar();
 //calendar.setTime(date);
  int month = calendar.get(Calendar.MONTH)+1;
  int day = calendar.get(Calendar.DAY_OF_MONTH);
  int year = calendar.get(Calendar.YEAR);
  
  if (day + daysAdded >= 31) {month = month+1; day =(day +daysAdded-31);} else {day = day + daysAdded;}
  frame.DueDateText.setValue( day+"-"+month+"-"+year); 
  
    
   }
  });  
//  int id; 
//  frame.invoiceNoText.setValue(year+""+month+""+id );
  frame.setVisible(true);
    }
    
}
 
    
   //////////////////////////////     rok miesiac 000001 

