package sourceCode;

public class Invoice {

    

    protected int ID;
    protected int customerId;
    protected String invoiceNo;       
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
        return invoiceNo;
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
  
    public int getTermsOfPayment() {
        return termsOfPayment;
    }
    public String getDueDate() { 
        return dueDate;
    }
    public String getTermsOfDelivery() { 
        return termsOfDelivery;
    }
    public float getTax() {
        return tax;
    }
    public float getValue() { 
        return value;
    }
    public float getTotal() {
        return total;
    }
    public String getSignature() {
        return signature;
    }
    public float getGross() {
        return gross;
    }
    public int getNo() {
        return no;
    }
    public String getProduct() {
        return product;
    }
    public float getPricePerUnit() {
        return pricePerUnit;
    }
    public float getCurrency() {
        return currency;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getUnit() {
        return unit;
    }
    public int getVat() {
        return vat;
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
    this.invoiceNo = invoiceNr;
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
    
     public void setTermsOfPayment(int termsOfPayment) {
        this.termsOfPayment = termsOfPayment;
    }
    public void setDueDate(String dueDate) { 
        this.dueDate = dueDate;
    }
    public void setTermsOfDelivery(String termsOfDelivery) { 
        this.termsOfDelivery = termsOfDelivery;
    }
    public void setTax(float tax) {
        this.tax = tax;
    }
    public void  setValue(float value) { 
        this.value = value;
    }
    public void  setTotal(float total) {
        this.total = total;
    }
    public void  setSignature(String signature) {
        this.signature = signature;
    }
    public void  setGross(float gross) {
        this.gross = gross;
    }
    public void  setNo(int no) {
        this.no = no;
    }
    public void  setProduct(String product) {
        this.product = product;
    }
    public void  setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public void  setCurrency(float currency) {
        this.currency = currency;
    }
    public void  setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }
    public void  setVat(int vat) {
        this.vat = vat;
    }
   
    // </editor-fold>
    
     
    
    public Invoice() {}
    public Invoice(int ID, int customerId, String invoiceNr, String address, String invoiceDate, String deliveryAddress, String customerNumber, String supplier,int termsOfPayment,
    String dueDate, String termsOfDelivery, float tax, float value,  float total,     String signature,
     float gross,     int no,     String product,     float pricePerUnit,     float currency,     int quantity,
     int unit,     int vat) 
    
    
    {
    this.ID= ID;
    this.customerId = customerId;
    this.invoiceNo = invoiceNr;
    this.address= address;
    this.invoiceDate = invoiceDate;
    this.deliveryAddress = deliveryAddress;
    this.customerNumber= customerNumber;
    this.supplier = supplier;
    this.termsOfPayment = termsOfPayment;
    this.dueDate = dueDate; 
    this.termsOfDelivery = termsOfDelivery; 
    this.tax = tax;
    this.value = value; 
    this.total = total;
    this.signature = signature;
    this.gross = gross;
    this.no = no;
    this.product = product;
    this.pricePerUnit = pricePerUnit;
    this.currency = currency;
    this.quantity = quantity;
    this.unit = unit;
    this.vat = vat;
    
       
    
    
    
    
    
    }
    
    @Override
    public String toString() {
    return "["+ID+"] - "+customerId+" - "+invoiceNo+" "+address+" "+invoiceDate+" "+deliveryAddress+" "+customerNumber+" "+supplier+" "+dueDate+"  "+termsOfDelivery+" "+tax+" - "+value+" -  "+total 
    + "+signature+" 
    + "+gross+" 
    + "+no+"
    + "+product+" 
    + "+pricePerUnit+" 
    + "+currency+" 
    + "+quantity+" 
    + "+unit+" 
    + "+vat";
     
    }
}
      