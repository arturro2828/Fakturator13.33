

package model;


public class Invoicing {
    
    private int idCustomer;
    private int idProduct;
 
    public int getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
 
    public Invoicing() {}
    public Invoicing(int idCustomer, int idProduct) {
        this.idCustomer = idCustomer;
        this.idProduct = idProduct;
 
    }
}
