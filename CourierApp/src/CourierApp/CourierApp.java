package CourierApp;

public class CourierApp extends javax.swing.JFrame {

    Kota[] kota;

    public CourierApp() {
        initKota();
        initComponents();
    }
    
    public void initKota(){
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CourierApplicationTITLE = new javax.swing.JLabel();
        JTabbedPane = new javax.swing.JTabbedPane();
        panelPengirim = new javax.swing.JPanel();
        alamatPengirimLabel = new javax.swing.JLabel();
        namaPengirimLabel = new javax.swing.JLabel();
        kotaPengirimLabel = new javax.swing.JLabel();
        kodePosPengirimLabel = new javax.swing.JLabel();
        provinsiPengirimLabel = new javax.swing.JLabel();
        teleponPengirimLabel = new javax.swing.JLabel();
        namaPengirimTextField = new javax.swing.JTextField();
        kodePosPengirimTextField = new javax.swing.JTextField();
        provinsiPengirimTextField = new javax.swing.JTextField();
        teleponPengirimTextField = new javax.swing.JTextField();
        pengirimLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatPengirimTextArea = new javax.swing.JTextArea();
        kotaComboBox = new javax.swing.JComboBox<>(kota);
        panelPenerima = new javax.swing.JPanel();
        namaPenerimaLabel = new javax.swing.JLabel();
        alamaPenerimaLabel = new javax.swing.JLabel();
        teleponPenerimaLabel = new javax.swing.JLabel();
        namaPenerimaTextField = new javax.swing.JTextField();
        teleponPenerimaTextField = new javax.swing.JTextField();
        penerimaLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatPenerimaTextArea = new javax.swing.JTextArea();
        panelDataPengirimanPaket = new javax.swing.JPanel();
        buttonSubmit = new javax.swing.JButton();
        noPaketLabel = new javax.swing.JLabel();
        kotaTujuanLabel = new javax.swing.JLabel();
        jenisBarangLabel = new javax.swing.JLabel();
        beratBarangLabel = new javax.swing.JLabel();
        tglKirimLabel = new javax.swing.JLabel();
        tglKirimLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        noPaketSpinner = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        namaBillLabel = new javax.swing.JLabel();
        billAlamatLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourierApplicationTITLE.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        CourierApplicationTITLE.setForeground(new java.awt.Color(102, 102, 102));
        CourierApplicationTITLE.setText("COURIER APPLICATION");

        panelPengirim.setBackground(new java.awt.Color(153, 153, 255));

        alamatPengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        alamatPengirimLabel.setText("Alamat");

        namaPengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaPengirimLabel.setText("Nama");

        kotaPengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        kotaPengirimLabel.setText("Kota");

        kodePosPengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        kodePosPengirimLabel.setText("Kode Pos");

        provinsiPengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        provinsiPengirimLabel.setText("Provinsi");

        teleponPengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        teleponPengirimLabel.setText("Telepon");

        namaPengirimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPengirimTextFieldActionPerformed(evt);
            }
        });

        kodePosPengirimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePosPengirimTextFieldActionPerformed(evt);
            }
        });

        provinsiPengirimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsiPengirimTextFieldActionPerformed(evt);
            }
        });

        teleponPengirimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponPengirimTextFieldActionPerformed(evt);
            }
        });

        pengirimLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pengirimLabel.setForeground(new java.awt.Color(255, 255, 255));
        pengirimLabel.setText("Pengirim");

        alamatPengirimTextArea.setColumns(20);
        alamatPengirimTextArea.setRows(5);
        jScrollPane1.setViewportView(alamatPengirimTextArea);

        kotaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPengirimLayout = new javax.swing.GroupLayout(panelPengirim);
        panelPengirim.setLayout(panelPengirimLayout);
        panelPengirimLayout.setHorizontalGroup(
            panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPengirimLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provinsiPengirimLabel)
                    .addComponent(alamatPengirimLabel)
                    .addComponent(kodePosPengirimLabel)
                    .addComponent(namaPengirimLabel)
                    .addComponent(pengirimLabel)
                    .addComponent(teleponPengirimLabel)
                    .addComponent(kotaPengirimLabel))
                .addGap(43, 43, 43)
                .addGroup(panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(provinsiPengirimTextField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(namaPengirimTextField)
                    .addComponent(kodePosPengirimTextField)
                    .addComponent(teleponPengirimTextField)
                    .addComponent(kotaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        panelPengirimLayout.setVerticalGroup(
            panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPengirimLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pengirimLabel)
                .addGap(41, 41, 41)
                .addGroup(panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaPengirimTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaPengirimLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPengirimLayout.createSequentialGroup()
                        .addComponent(alamatPengirimLabel)
                        .addGap(52, 52, 52)
                        .addComponent(kotaPengirimLabel)
                        .addGap(18, 18, 18)
                        .addComponent(provinsiPengirimLabel))
                    .addGroup(panelPengirimLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kotaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(provinsiPengirimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodePosPengirimLabel)
                    .addComponent(kodePosPengirimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelPengirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleponPengirimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleponPengirimLabel))
                .addGap(72, 72, 72))
        );

        JTabbedPane.addTab("Pengirim", panelPengirim);

        panelPenerima.setBackground(new java.awt.Color(153, 153, 255));

        namaPenerimaLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaPenerimaLabel.setText("Nama");

        alamaPenerimaLabel.setForeground(new java.awt.Color(255, 255, 255));
        alamaPenerimaLabel.setText("Alamat");

        teleponPenerimaLabel.setForeground(new java.awt.Color(255, 255, 255));
        teleponPenerimaLabel.setText("Telepon");

        teleponPenerimaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponPenerimaTextFieldActionPerformed(evt);
            }
        });

        penerimaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        penerimaLabel.setForeground(new java.awt.Color(255, 255, 255));
        penerimaLabel.setText("Penerima");

        alamatPenerimaTextArea.setColumns(20);
        alamatPenerimaTextArea.setRows(5);
        jScrollPane2.setViewportView(alamatPenerimaTextArea);

        javax.swing.GroupLayout panelPenerimaLayout = new javax.swing.GroupLayout(panelPenerima);
        panelPenerima.setLayout(panelPenerimaLayout);
        panelPenerimaLayout.setHorizontalGroup(
            panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenerimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPenerimaLayout.createSequentialGroup()
                        .addComponent(penerimaLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPenerimaLayout.createSequentialGroup()
                        .addGroup(panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaPenerimaLabel)
                            .addComponent(alamaPenerimaLabel)
                            .addComponent(teleponPenerimaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addGroup(panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(teleponPenerimaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(namaPenerimaTextField))
                        .addGap(37, 37, 37))))
        );
        panelPenerimaLayout.setVerticalGroup(
            panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenerimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(penerimaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPenerimaLabel)
                    .addComponent(namaPenerimaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamaPenerimaLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPenerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleponPenerimaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleponPenerimaLabel))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Penerima", panelPenerima);

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        noPaketLabel.setText("Nomor Paket ");

        kotaTujuanLabel.setText("Kota Tujuan");

        jenisBarangLabel.setText("Jenis Barang");

        beratBarangLabel.setText("Berat Barang");

        tglKirimLabel.setText("Tanggal Kirim");

        tglKirimLabel1.setText("Dimensi");

        javax.swing.GroupLayout panelDataPengirimanPaketLayout = new javax.swing.GroupLayout(panelDataPengirimanPaket);
        panelDataPengirimanPaket.setLayout(panelDataPengirimanPaketLayout);
        panelDataPengirimanPaketLayout.setHorizontalGroup(
            panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataPengirimanPaketLayout.createSequentialGroup()
                .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataPengirimanPaketLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataPengirimanPaketLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenisBarangLabel)
                            .addComponent(beratBarangLabel)
                            .addComponent(tglKirimLabel1)
                            .addGroup(panelDataPengirimanPaketLayout.createSequentialGroup()
                                .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noPaketLabel)
                                    .addComponent(tglKirimLabel)
                                    .addComponent(kotaTujuanLabel))
                                .addGap(27, 27, 27)
                                .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(noPaketSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1))))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        panelDataPengirimanPaketLayout.setVerticalGroup(
            panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataPengirimanPaketLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noPaketLabel)
                    .addComponent(noPaketSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kotaTujuanLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jenisBarangLabel)
                .addGap(18, 18, 18)
                .addComponent(beratBarangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPengirimanPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tglKirimLabel)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tglKirimLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(buttonSubmit)
                .addGap(34, 34, 34))
        );

        JTabbedPane.addTab("Data Pengiriman Paket", panelDataPengirimanPaket);

        namaBillLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namaBillLabel.setText("Nama");

        billAlamatLabel.setText("Kota");

        jLabel1.setText("Thank you for using our Courier Application, we hope you enjoyed :)");

        jLabel3.setText("Hi,");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billAlamatLabel)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaBillLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBillLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(billAlamatLabel)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Bill", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CourierApplicationTITLE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CourierApplicationTITLE)
                .addGap(38, 38, 38)
                .addComponent(JTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void namaPengirimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPengirimTextFieldActionPerformed
        // TODO add your handling code here:
        String terpilih = (String) namaPengirimTextField.getText();
        namaBillLabel.setText(terpilih);
    }//GEN-LAST:event_namaPengirimTextFieldActionPerformed

    private void kodePosPengirimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePosPengirimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodePosPengirimTextFieldActionPerformed

    private void provinsiPengirimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsiPengirimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsiPengirimTextFieldActionPerformed

    private void teleponPengirimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponPengirimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponPengirimTextFieldActionPerformed

    private void teleponPenerimaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponPenerimaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponPenerimaTextFieldActionPerformed

    private void kotaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaComboBoxActionPerformed
        // TODO add your handling code here:
        Kota k = (Kota) kotaComboBox.getSelectedItem();
        provinsiPengirimTextField.setText(k.getProvinsi());
    }//GEN-LAST:event_kotaComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourierApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourierApplicationTITLE;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JLabel alamaPenerimaLabel;
    private javax.swing.JTextArea alamatPenerimaTextArea;
    private javax.swing.JLabel alamatPengirimLabel;
    private javax.swing.JTextArea alamatPengirimTextArea;
    private javax.swing.JLabel beratBarangLabel;
    private javax.swing.JLabel billAlamatLabel;
    private javax.swing.JButton buttonSubmit;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jenisBarangLabel;
    private javax.swing.JLabel kodePosPengirimLabel;
    private javax.swing.JTextField kodePosPengirimTextField;
    private javax.swing.JComboBox<String> kotaComboBox;
    private javax.swing.JLabel kotaPengirimLabel;
    private javax.swing.JLabel kotaTujuanLabel;
    private javax.swing.JLabel namaBillLabel;
    private javax.swing.JLabel namaPenerimaLabel;
    private javax.swing.JTextField namaPenerimaTextField;
    private javax.swing.JLabel namaPengirimLabel;
    private javax.swing.JTextField namaPengirimTextField;
    private javax.swing.JLabel noPaketLabel;
    private javax.swing.JSpinner noPaketSpinner;
    private javax.swing.JPanel panelDataPengirimanPaket;
    private javax.swing.JPanel panelPenerima;
    private javax.swing.JPanel panelPengirim;
    private javax.swing.JLabel penerimaLabel;
    private javax.swing.JLabel pengirimLabel;
    private javax.swing.JLabel provinsiPengirimLabel;
    private javax.swing.JTextField provinsiPengirimTextField;
    private javax.swing.JLabel teleponPenerimaLabel;
    private javax.swing.JTextField teleponPenerimaTextField;
    private javax.swing.JLabel teleponPengirimLabel;
    private javax.swing.JTextField teleponPengirimTextField;
    private javax.swing.JLabel tglKirimLabel;
    private javax.swing.JLabel tglKirimLabel1;
    // End of variables declaration//GEN-END:variables
}
