
package model;


public class Product {
  private  int ID;
  private  String productName;    
  private  float price;  
  
  public int getID() {
        return ID;
    }   
  public String getProductName() {
        return productName;
    }  
  public float getPrice() {
        return price;
    } 
  
 public void setID(int ID) {
    this.ID = ID;
    } 
 public void setProductName(String productName) {
    this.productName = productName;
    }
 public void setPrice(float price) {
    this.price = price;
    }
 
 
 
 public Product () {}
 public Product(int ID,String productName,float price)
         {
    this.ID= ID;
    this.productName = productName;
    this.price = price;
}
 
 @Override
    public String toString() {
        return "["+ID+"] - "+productName+" - "+price;
    }
}
