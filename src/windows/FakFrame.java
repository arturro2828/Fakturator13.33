package windows;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import sourceCode.Database;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturro
 */
public class FakFrame extends javax.swing.JFrame {

    /**
     * Creates new form FakFrame
     */

    public FakFrame() {
        initComponents();

    }

    public void setInvoice(String invoiceNo){
        this.invoiceNoText.setText(invoiceNo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jScrollPane2 = new javax.swing.JScrollPane();
  jTextArea2 = new javax.swing.JTextArea();
  jLabel10 = new javax.swing.JLabel();
  jLabel1 = new javax.swing.JLabel();
  invoiceDate = new javax.swing.JLabel();
  jLabel3 = new javax.swing.JLabel();
  jLabel4 = new javax.swing.JLabel();
  TermsOfPaymentText = new javax.swing.JComboBox();
  jLabel6 = new javax.swing.JLabel();
  jLabel7 = new javax.swing.JLabel();
  jLabel8 = new javax.swing.JLabel();
  jLabel9 = new javax.swing.JLabel();
  CustomerNoText = new javax.swing.JComboBox();
  jScrollPane8 = new javax.swing.JScrollPane();
  listaProduktow = new javax.swing.JTable();
  jLabel11 = new javax.swing.JLabel();
  jLabel12 = new javax.swing.JLabel();
  jLabel13 = new javax.swing.JLabel();
  dataText = new javax.swing.JLabel();
  invoiceDateText = new javax.swing.JFormattedTextField();
  issueToText = new javax.swing.JFormattedTextField();
  shipToText = new javax.swing.JFormattedTextField();
  DueDateText = new javax.swing.JFormattedTextField();
  grossText = new javax.swing.JFormattedTextField();
  taxTest = new javax.swing.JFormattedTextField();
  totalText = new javax.swing.JFormattedTextField();
  choosingProduct = new javax.swing.JComboBox();
  jLabel2 = new javax.swing.JLabel();
  jLabel17 = new javax.swing.JLabel();
  zapis = new javax.swing.JButton();
  invoiceNoText = new javax.swing.JLabel();
  jButton1 = new javax.swing.JButton();

  jTextArea2.setColumns(20);
  jTextArea2.setRows(5);
  jScrollPane2.setViewportView(jTextArea2);

  jLabel10.setText("jLabel10");

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jLabel1.setText("Numer faktury");

  invoiceDate.setText("Data wystawienia");

  jLabel3.setText("Data sprzedaży");

  jLabel4.setText("Termin płatności");

  TermsOfPaymentText.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    TermsOfPaymentTextActionPerformed(evt);
   }
  });

  jLabel6.setText("Sprzedawca");

  jLabel7.setText("Wybierz klienta");

  jLabel8.setText("Nabywca");

  jLabel9.setText("Adres dostawy");

  CustomerNoText.setToolTipText("");
  CustomerNoText.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    CustomerNoTextMouseClicked(evt);
   }
  });
  CustomerNoText.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    CustomerNoTextActionPerformed(evt);
   }
  });

  listaProduktow.setModel(new javax.swing.table.DefaultTableModel(
   new Object [][] {
    {null, null, null, null, null, null},
    {null, "", null, null, null, null},
    {null, null, null, null, null, null},
    {null, null, null, null, null, null}
   },
   new String [] {
    "L.p.", "Produkt", "Cena szt.", "Ilość", "VAT", "Cena netto"
   }
  ) {
   Class[] types = new Class [] {
    java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
   };

   public Class getColumnClass(int columnIndex) {
    return types [columnIndex];
   }
  });
  listaProduktow.getTableHeader().setReorderingAllowed(false);
  jScrollPane8.setViewportView(listaProduktow);
  if (listaProduktow.getColumnModel().getColumnCount() > 0) {
   listaProduktow.getColumnModel().getColumn(0).setPreferredWidth(5);
  }

  jLabel11.setText("Cena netto");

  jLabel12.setText("Wartość podatku VAT");

  jLabel13.setText("Cena brutto");

  dataText.addComponentListener(new java.awt.event.ComponentAdapter() {
   public void componentShown(java.awt.event.ComponentEvent evt) {
    dataTextComponentShown(evt);
   }
  });
  dataText.addInputMethodListener(new java.awt.event.InputMethodListener() {
   public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
   }
   public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
    dataTextInputMethodTextChanged(evt);
   }
  });

  invoiceDateText.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    invoiceDateTextActionPerformed(evt);
   }
  });

  issueToText.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    issueToTextActionPerformed(evt);
   }
  });

  DueDateText.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    DueDateTextActionPerformed(evt);
   }
  });

  grossText.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    grossTextActionPerformed(evt);
   }
  });

  jLabel2.setText("Przykładowa Firma");

  jLabel17.setText("Przykładowy adres");

  zapis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
  zapis.setText("Zapisz");
  zapis.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    zapisActionPerformed(evt);
   }
  });

  invoiceNoText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
  invoiceNoText.setText("0");

  jButton1.setText("Usuń pozycje");
  jButton1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton1ActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(jScrollPane8)
     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
       .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
         .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(38, 38, 38)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
         .addComponent(issueToText, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
         .addComponent(shipToText))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel4)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(DueDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(TermsOfPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
       .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel6)
        .addGap(477, 477, 477))
       .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2)
         .addComponent(jLabel17))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(invoiceDate)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(invoiceDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel11)
         .addComponent(grossText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel12)
         .addComponent(taxTest, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jLabel13)))
       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
         .addComponent(jLabel1)
         .addGroup(layout.createSequentialGroup()
          .addComponent(jLabel7)
          .addGap(22, 22, 22)
          .addComponent(CustomerNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(18, 18, 18)
          .addComponent(choosingProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(invoiceNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton1))))
      .addGap(0, 0, Short.MAX_VALUE)))
    .addContainerGap())
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(zapis, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(19, 19, 19))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(invoiceDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(invoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(29, 29, 29)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
       .addComponent(invoiceNoText)
       .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
     .addGroup(layout.createSequentialGroup()
      .addComponent(jLabel6)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel17)))))
    .addGap(60, 60, 60)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel7)
     .addComponent(CustomerNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(choosingProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jButton1))
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(TermsOfPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel3))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(DueDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel4))
      .addGap(0, 0, Short.MAX_VALUE))
     .addGroup(layout.createSequentialGroup()
      .addGap(37, 37, 37)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(issueToText, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
       .addComponent(jLabel8))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(jLabel9)
       .addComponent(shipToText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
    .addGap(29, 29, 29)
    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
    .addGap(70, 70, 70)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel11)
     .addComponent(jLabel12)
     .addComponent(jLabel13))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(taxTest)
     .addComponent(grossText)
     .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(30, 30, 30)
    .addComponent(zapis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(29, 29, 29))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

    private void TermsOfPaymentTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermsOfPaymentTextActionPerformed

    }//GEN-LAST:event_TermsOfPaymentTextActionPerformed

    private void invoiceDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceDateTextActionPerformed


    }//GEN-LAST:event_invoiceDateTextActionPerformed

    private void DueDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DueDateTextActionPerformed

    }//GEN-LAST:event_DueDateTextActionPerformed

    private void grossTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossTextActionPerformed

    private void issueToTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueToTextActionPerformed

    }//GEN-LAST:event_issueToTextActionPerformed

    private void CustomerNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNoTextActionPerformed

    private void CustomerNoTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerNoTextMouseClicked

    }//GEN-LAST:event_CustomerNoTextMouseClicked

    private void dataTextInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dataTextInputMethodTextChanged

    }//GEN-LAST:event_dataTextInputMethodTextChanged

    private void dataTextComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dataTextComponentShown

    }//GEN-LAST:event_dataTextComponentShown

    private void zapisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapisActionPerformed
        Database database = Database.getDatabase();


    }//GEN-LAST:event_zapisActionPerformed

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  DefaultTableModel model = (DefaultTableModel) this.listaProduktow.getModel();
  model.setRowCount(0);
  model.setRowCount(4);
 }//GEN-LAST:event_jButton1ActionPerformed





 // Variables declaration - do not modify//GEN-BEGIN:variables
 public javax.swing.JComboBox CustomerNoText;
 public javax.swing.JFormattedTextField DueDateText;
 public javax.swing.JComboBox TermsOfPaymentText;
 public javax.swing.JComboBox choosingProduct;
 public javax.swing.JLabel dataText;
 public javax.swing.JFormattedTextField grossText;
 private javax.swing.JLabel invoiceDate;
 public javax.swing.JFormattedTextField invoiceDateText;
 private javax.swing.JLabel invoiceNoText;
 public javax.swing.JFormattedTextField issueToText;
 private javax.swing.JButton jButton1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel10;
 private javax.swing.JLabel jLabel11;
 private javax.swing.JLabel jLabel12;
 private javax.swing.JLabel jLabel13;
 private javax.swing.JLabel jLabel17;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JLabel jLabel8;
 private javax.swing.JLabel jLabel9;
 private javax.swing.JScrollPane jScrollPane2;
 private javax.swing.JScrollPane jScrollPane8;
 private javax.swing.JTextArea jTextArea2;
 public javax.swing.JTable listaProduktow;
 public javax.swing.JFormattedTextField shipToText;
 public javax.swing.JFormattedTextField taxTest;
 public javax.swing.JFormattedTextField totalText;
 private javax.swing.JButton zapis;
 // End of variables declaration//GEN-END:variables
}
