package sourceCode;

public class Faktura {

    protected int ID;
    protected int customerId;
    protected String invoiceNr;       
    protected String address;              
    protected String invoiceDate; //dzien wystawienia
    protected String deliveryAddress;
    protected String customerNumber;
    protected String supplier;
    protected int termsOfPayment;//warunki platnosci, ile dni na zaplacenie faktury
    protected String dueDate; //dzien w ktorym powinna zostac zalpacona faktura
    protected String termsOfDelivery; //warunki dostawy - kto organizuje transport, czy w cene jest wliczony transport
    protected float tax;
    protected float value; 
    protected float total;
    protected String signature;
    protected float gross;
    protected int no;
    protected String product;
    protected float pricePerUnit;
    protected float currency;
    protected int quantity;
    protected int unit;
    protected int vat;
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Gettery">

   public int getID() {
        return ID;
    }    
    
   public int getCustomerId() {
        return customerId;
        
    }
   public String getAddress() {
        return address;
    }
    
    
    public String invoiceNr() {
        return invoiceNr;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getDeliveryAddress () {
        return deliveryAddress;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getSupplier() {
        return supplier;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Settery">
    
        
    public void setID(int ID) {
    this.ID = ID;
    }    
    
    public void setCustomerId(int customerId) {
    this.customerId = customerId;  
    }
    
    public void setAddress(String address) {
    this.address = address;
    }
    
    public void setInvoiceNr(String invoiceNr) {
    this.invoiceNr = invoiceNr;
    }

    public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    }

    public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    // </editor-fold>
    public Faktura() {}
    public Faktura(int ID, int customerId, String invoiceNr, String address, String invoiceDate, String deliveryAddress, String customerNumber, String supplier) {
    this.ID= ID;
    this.customerId = customerId;
    this.invoiceNr = invoiceNr;
    this.address= address;
    this.invoiceDate = invoiceDate;
    this.deliveryAddress = deliveryAddress;
    this.customerNumber= customerNumber;
    this.supplier = supplier;
    }
}

     
     
      
      
      
     
      
     
     
      