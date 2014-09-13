package model;

public class Invoicing {

 private Integer id;
 private Customer customer;
  private String invoiceNo;
 private String dateSell;
 private String datePayment;
 private Float netto;
 private Float brutto;
 private Float taxRate;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public Customer getCustomer() {
  return customer;
 }

 public void setCustomer(Customer customer) {
  this.customer = customer;
 }

 public String getInvoiceNo() {
  return invoiceNo;
 }

 public void setInvoiceNo(String invoiceNo) {
  this.invoiceNo = invoiceNo;
 }

 public String getDateSell() {
  return dateSell;
 }

 public void setDateSell(String dateSell) {
  this.dateSell = dateSell;
 }

 public String getDatePayment() {
  return datePayment;
 }

 public void setDatePayment(String datePayment) {
  this.datePayment = datePayment;
 }

 public Float getNetto() {
  return netto;
 }

 public void setNetto(Float netto) {
  this.netto = netto;
 }

 public Float getBrutto() {
  return brutto;
 }

 public void setBrutto(Float brutto) {
  this.brutto = brutto;
 }

 public Float getTaxRate() {
  return taxRate;
 }

 public void setTaxRate(Float taxRate) {
  this.taxRate = taxRate;
 }

}
