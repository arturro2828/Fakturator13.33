package model;

import java.util.List;

public class Invoicing {

 private Integer id;
 private Customer customer;
  private String invoiceNo;
 private String dateSell;
 private String datePayment;
 private Double netto;
 private Double brutto;
 private Double taxRate;
 private List<InvoiceProduct> products;

 public List<InvoiceProduct> getProducts() {
  return products;
 }

 public void setProducts(List<InvoiceProduct> products) {
  this.products = products;
 }

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

 public Double getNetto() {
  return netto;
 }

 public void setNetto(Double netto) {
  this.netto = netto;
 }

 public Double getBrutto() {
  return brutto;
 }

 public void setBrutto(Double brutto) {
  this.brutto = brutto;
 }

 public Double getTaxRate() {
  return taxRate;
 }

 public void setTaxRate(Double taxRate) {
  this.taxRate = taxRate;
 }

}
