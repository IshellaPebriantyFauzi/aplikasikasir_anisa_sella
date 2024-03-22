/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikasir_anisa_sella;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author user
 */
public class MenuUtama extends javax.swing.JFrame {
    Connection konek;
PreparedStatement pst;
ResultSet rst;
  


    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        konek = Koneksi.KoneksiDB();
        mulai();
        tampilWaktu();
    }

    public void mulai() {
    formlogin.setVisible(false);
    register.setEnabled(false);
    Logout.setEnabled(false);
    Master.setEnabled(false);
    Transaksi.setEnabled(false);
    Laporan.setEnabled(false);
    TXTJAM.setEnabled(false);
    TXTTANGGAL.setEnabled(false);
    btnregister.setEnabled(false);
    btnproduk.setEnabled(false);
    btnpelanggan.setEnabled(false);
    btnpenjualan.setEnabled(false);
}

    public void tampilWaktu() {
        Thread clock = new Thread() {
            public void run() {
                for(;;) {
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat Jam = new SimpleDateFormat("HH:mm:ss");
                    SimpleDateFormat Tanggal = new SimpleDateFormat("yyyy-MM-dd");
                    TXTJAM.setText(Jam.format(cal.getTime()));
                    TXTTANGGAL.setText(Tanggal.format(cal.getTime()));
               try { sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            }
        };
        clock.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXTJAM = new javax.swing.JTextField();
        TXTTANGGAL = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnregister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnpelanggan = new javax.swing.JButton();
        btnproduk = new javax.swing.JButton();
        btnpenjualan = new javax.swing.JButton();
        formlogin = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbhakakses = new javax.swing.JComboBox<>();
        btnbatal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Login = new javax.swing.JMenu();
        Register = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        register = new javax.swing.JMenuItem();
        Master = new javax.swing.JMenu();
        Pelanggan = new javax.swing.JMenuItem();
        Produk = new javax.swing.JMenuItem();
        Transaksi = new javax.swing.JMenu();
        Penjualan = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        RkpLap = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Tentang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(TXTJAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 11, 57, -1));
        getContentPane().add(TXTTANGGAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 11, 72, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnregister.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-register-40 (1).png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Silahkan login dulu...!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnregister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregister)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 137, 560));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnpelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-customer-30.png")); // NOI18N
        btnpelanggan.setText("Pelanggan");

        btnproduk.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-product-30.png")); // NOI18N
        btnproduk.setText("Produk");
        btnproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprodukActionPerformed(evt);
            }
        });

        btnpenjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-sale-30.png")); // NOI18N
        btnpenjualan.setText("Penjualan");
        btnpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(btnpelanggan)
                .addGap(44, 44, 44)
                .addComponent(btnproduk)
                .addGap(34, 34, 34)
                .addComponent(btnpenjualan)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpelanggan)
                    .addComponent(btnproduk)
                    .addComponent(btnpenjualan))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 470, 590, -1));

        formlogin.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FORM LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-user-20.png")); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-password-20.png")); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-access-20.png")); // NOI18N
        jLabel4.setText("Hak Akses");

        cmbhakakses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih salah satu-" }));
        cmbhakakses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbhakaksesActionPerformed(evt);
            }
        });

        btnbatal.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-list-20 (1).png")); // NOI18N
        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-login-20.png")); // NOI18N
        jButton2.setText("MASUK");

        javax.swing.GroupLayout formloginLayout = new javax.swing.GroupLayout(formlogin.getContentPane());
        formlogin.getContentPane().setLayout(formloginLayout);
        formloginLayout.setHorizontalGroup(
            formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formloginLayout.createSequentialGroup()
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formloginLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formloginLayout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbhakakses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(formloginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(formloginLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnbatal)
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formloginLayout.setVerticalGroup(
            formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formloginLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbhakakses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbatal)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        getContentPane().add(formlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 77, -1, -1));

        Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-home-20 (1).png")); // NOI18N
        Login.setText("Beranda");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Register.setText("Register");
        Login.add(Register);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Login.add(Logout);

        register.setText("Login");
        Login.add(register);

        jMenuBar1.add(Login);

        Master.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-master-20.png")); // NOI18N
        Master.setText("Master");

        Pelanggan.setText("Pelanggan");
        Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganActionPerformed(evt);
            }
        });
        Master.add(Pelanggan);

        Produk.setText("Produk");
        Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukActionPerformed(evt);
            }
        });
        Master.add(Produk);

        jMenuBar1.add(Master);

        Transaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-transaction-20.png")); // NOI18N
        Transaksi.setText("Transaksi");

        Penjualan.setText("Penjualan");
        Penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjualanActionPerformed(evt);
            }
        });
        Transaksi.add(Penjualan);

        jMenuBar1.add(Transaksi);

        Laporan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-report-20 (1).png")); // NOI18N
        Laporan.setText("Laporan");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });

        RkpLap.setText("Rekap Laporan");
        RkpLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RkpLapActionPerformed(evt);
            }
        });
        Laporan.add(RkpLap);

        jMenuBar1.add(Laporan);

        Help.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-about-20.png")); // NOI18N
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        Tentang.setText("Tentang");
        Help.add(Tentang);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbhakaksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbhakaksesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbhakaksesActionPerformed

    private void RkpLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RkpLapActionPerformed
new FormLapTransaksi().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_RkpLapActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
new FormAbout().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_HelpActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
new FormLapTransaksi().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LaporanActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    formlogin.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
new MenuUtama().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukActionPerformed
new formproduk().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ProdukActionPerformed

    private void PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganActionPerformed
new formPelanggan().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_PelangganActionPerformed

    private void PenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjualanActionPerformed
new FormPenjualan().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_PenjualanActionPerformed

    private void btnpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenjualanActionPerformed
new FormPenjualan().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnpenjualanActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
new MenuUtama().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprodukActionPerformed
new formproduk().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnprodukActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenu Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuItem Pelanggan;
    private javax.swing.JMenuItem Penjualan;
    private javax.swing.JMenuItem Produk;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenuItem RkpLap;
    private javax.swing.JTextField TXTJAM;
    private javax.swing.JTextField TXTTANGGAL;
    private javax.swing.JMenuItem Tentang;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnpelanggan;
    private javax.swing.JButton btnpenjualan;
    private javax.swing.JButton btnproduk;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> cmbhakakses;
    private javax.swing.JInternalFrame formlogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem register;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
