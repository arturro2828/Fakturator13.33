
package model;

public class Customer {
    
  private  int ID;
  private String customerName;
  private  String companyAddress;    //issueToText
  private  String deliveryAddress;  //shipToText 

    
 
  public int getID() {
        return ID;
    } 
  
  public String getCustomerName() {
        return customerName;
  }
  
  public String getCompanyAddress() {
        return companyAddress;
    }  
  public String getDeliveryAddress() {
        return deliveryAddress;
    } 
  
 public void setID(int ID) {
    this.ID = ID;
    } 
 public void setCustomerName(String customerName) {
    this.customerName = customerName;
    }
 public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    }
 public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    }
 
 
 
 public Customer () {}
 public Customer(int ID,String customerName,String companyAddress,String deliveryAddress)
         {
    this.ID= ID;
    this.customerName = customerName;
    this.companyAddress = companyAddress;
    this.deliveryAddress = deliveryAddress;
}
 
 @Override
  public String toString() {
      return "["+ID+"] - "+customerName+" - "+companyAddress+" - "+deliveryAddress;
  
  
  }
}