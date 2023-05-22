/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.adminOnlineShop;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import model.AdminModel;
/**
 *
 * @author USER 10
 */
public class MenuAdmin extends javax.swing.JFrame {
    AdminModel adminModel = new AdminModel();
    int idBarang;

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        
        //mematikan semua fitur yang ada dikanan
        navbarKonfirmasi.setEnabled(false);
        updateKonfirmasi.setEnabled(false);
        
        navbarPengiriman.setEnabled(false);
        updatePengiriman.setEnabled(false);
        selesai.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        updateKonfirmasiBarang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        navbarKonfirmasi = new javax.swing.JComboBox<>();
        updateKonfirmasi = new javax.swing.JButton();
        selesai = new javax.swing.JButton();
        updatePengirimanBarang = new javax.swing.JButton();
        updatePengiriman = new javax.swing.JButton();
        navbarPengiriman = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Admin");

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Barang", "Jumlah", "Total Harga", "Metode Pembayaran", "Status"
            }
        ));
        tabelBarang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelBarang.setMinimumSize(new java.awt.Dimension(50, 16));
        tabelBarang.setPreferredSize(new java.awt.Dimension(500, 16));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        updateKonfirmasiBarang.setText("Konfirmasi Barang");
        updateKonfirmasiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateKonfirmasiBarangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Menu Admin");

        navbarKonfirmasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ditolak", "diterima" }));

        updateKonfirmasi.setText("Update");
        updateKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateKonfirmasiActionPerformed(evt);
            }
        });

        selesai.setText("Selesai");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });

        updatePengirimanBarang.setText("Update Barang");
        updatePengirimanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePengirimanBarangActionPerformed(evt);
            }
        });

        updatePengiriman.setText("Update");
        updatePengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePengirimanActionPerformed(evt);
            }
        });

        navbarPengiriman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "barang sedang dikemas", "barang dalam pengiriman" }));

        jLabel2.setText("Update Pengiriman");

        jLabel3.setText("Konfirmasi Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(navbarKonfirmasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateKonfirmasi))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(navbarPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updatePengiriman))
                            .addComponent(selesai, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateKonfirmasiBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatePengirimanBarang)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateKonfirmasiBarang)
                    .addComponent(updatePengirimanBarang))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(navbarKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateKonfirmasi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(navbarPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatePengiriman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selesai)
                        .addGap(90, 90, 90))))
        );

        pack();
    }// </editor-fold>                        

    private void updateKonfirmasiBarangActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        try {
            // TODO add your handling code here:
            //melemparkan ke model
            adminModel.getTableDataUpdateKonfirmasi(tabelBarang);
            //menghidupkan semua tombol yang dipakai
            navbarKonfirmasi.setEnabled(true);
            updateKonfirmasi.setEnabled(true);
        
            //mematikan semua tombol yang tidak dipakai
            navbarPengiriman.setEnabled(false);
            updatePengiriman.setEnabled(false);
            selesai.setEnabled(false);
            
            //output di cmd
            System.out.println("tombol update konfirmasi");
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");
        }
    }                                                      

    private void updatePengirimanBarangActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            //melemparkan ke model
            adminModel.getTableDataUpdatePengiriman(tabelBarang);
            //menghidupkan semua tombol yang dipakai
            navbarKonfirmasi.setEnabled(false);
            updateKonfirmasi.setEnabled(false);
        
            //mematikan semua tombol yang tidak dipakai
            navbarPengiriman.setEnabled(true);
            updatePengiriman.setEnabled(true);
            selesai.setEnabled(true);
            
            //output di cmd
             System.out.println("tombol update pengiriman");
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("error");
        }
    }                                                      

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        
        //mengambil data id barang yang diklik mouse
        try{
            String tempIdBarang = (String) model.getValueAt(tabelBarang.getSelectedRow(), 0);
            idBarang = Integer.parseInt(tempIdBarang);
        System.out.println("id barang = " + idBarang);
        }
        catch(NumberFormatException e) //jika data kosong atau terjadi error selain itu
        {
            System.out.println("id barang belum ada. error =  "+e);
        }
    }                                        

    private void updateKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
//        DefaultComboBox iniNavbarKonfirmasi = (JComboBox) navbarKonfirmasi.getModel();
        adminModel.updateTabelKonfirmasi(idBarang, (String) navbarKonfirmasi.getSelectedItem());
    }                                                

    private void updatePengirimanActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        adminModel.updateTabelKonfirmasi(idBarang, (String) navbarPengiriman.getSelectedItem());
    }                                                

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        adminModel.updateTabelKonfirmasi(idBarang,"selesai");
    }                                       

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> navbarKonfirmasi;
    private javax.swing.JComboBox<String> navbarPengiriman;
    private javax.swing.JButton selesai;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JButton updateKonfirmasi;
    private javax.swing.JButton updateKonfirmasiBarang;
    private javax.swing.JButton updatePengiriman;
    private javax.swing.JButton updatePengirimanBarang;
    // End of variables declaration                   
}
