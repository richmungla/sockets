/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.net.Socket;
import java.util.HashMap;
import java.io.DataInputStream;
/**
 *
 * @author richm
 */
public class Toy extends javax.swing.JFrame {

    //initialize connection to server and open the connection
    SocketClient sockClient = new SocketClient();
    Socket sock = sockClient.connectToServer(1,25);
    
    ClientProtocol client = new ClientProtocol();
    
    DataInputStream din;    
    HashMap<String, Object>  toy_data = new HashMap<>();
    
    public Toy() {
        initComponents();
        try{
            din = new DataInputStream(sock.getInputStream());
            toy_console.setText(din.readUTF());            
        }catch(Exception e){
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        toyID_Button = new javax.swing.JButton();
        toy_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        toy_name_2 = new javax.swing.JTextField();
        toy_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        toy_batch_no = new javax.swing.JTextField();
        toy_desc = new javax.swing.JTextField();
        toy_company_name = new javax.swing.JTextField();
        toy_date = new javax.swing.JTextField();
        toy_country = new javax.swing.JTextField();
        toy_price = new javax.swing.JTextField();
        toy_street_address = new javax.swing.JTextField();
        toy_zip_code = new javax.swing.JTextField();
        toy_man_Button = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        toyData_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        toy_console = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Toy ID");

        toyID_Button.setText("Toy Identification");
        toyID_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toyID_ButtonActionPerformed(evt);
            }
        });

        toy_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_NameActionPerformed(evt);
            }
        });

        jLabel2.setText("Toy Name");

        jLabel3.setText("Toy Name");

        toy_name_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_name_2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Toy Price");

        jLabel7.setText("Zip Code");

        jLabel8.setText("Batch Number");

        jLabel9.setText("Toy Description");

        jLabel11.setText("Toy Date");

        toy_batch_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_batch_noActionPerformed(evt);
            }
        });

        toy_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_descActionPerformed(evt);
            }
        });

        toy_company_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_company_nameActionPerformed(evt);
            }
        });

        toy_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_dateActionPerformed(evt);
            }
        });

        toy_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_countryActionPerformed(evt);
            }
        });

        toy_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_priceActionPerformed(evt);
            }
        });

        toy_street_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_street_addressActionPerformed(evt);
            }
        });

        toy_zip_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_zip_codeActionPerformed(evt);
            }
        });

        toy_man_Button.setText("Manufacture");
        toy_man_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toy_man_ButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Street address");

        jLabel13.setText("Country");

        jLabel14.setText("Company Name");

        toyData_Button.setText("Toy Data");
        toyData_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toyData_ButtonActionPerformed(evt);
            }
        });

        toy_console.setColumns(20);
        toy_console.setRows(5);
        jScrollPane1.setViewportView(toy_console);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toyID_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toy_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toy_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toy_price, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_date, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_name_2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_batch_no, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toy_man_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_street_address, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_zip_code, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_country, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(toyData_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toy_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_name_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toy_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toy_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toy_street_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(toyID_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toy_price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toy_zip_code, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toy_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toy_country, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toy_batch_no, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toy_man_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(toyData_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toyID_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toyID_ButtonActionPerformed
        String toyID  = toy_ID.getText();
        String toyName = toy_Name.getText();  
        
        toy_data.put("toy_id", toyID);
        toy_data.put("toyName", toyName);        
        
        client.SendToServer(toy_data, sock);
        
        toy_data.clear();
        
    }//GEN-LAST:event_toyID_ButtonActionPerformed

    private void toy_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_NameActionPerformed

    private void toy_name_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_name_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_name_2ActionPerformed

    private void toy_batch_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_batch_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_batch_noActionPerformed

    private void toy_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_descActionPerformed

    private void toy_company_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_company_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_company_nameActionPerformed

    private void toy_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_dateActionPerformed

    private void toy_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_countryActionPerformed

    private void toy_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_priceActionPerformed

    private void toy_street_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_street_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_street_addressActionPerformed

    private void toy_zip_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_zip_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toy_zip_codeActionPerformed

    private void toy_man_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toy_man_ButtonActionPerformed
        String toyCompany = toy_company_name.getText();
        String toyAddress = toy_street_address.getText();
        String toyZip = toy_zip_code.getText();
        String toyCountry = toy_country.getText();       
                                
        toy_data.put("toyCompany", toyCompany);
        toy_data.put("toyAddress", toyAddress);
        toy_data.put("toyZip", toyZip);
        toy_data.put("toyCountry", toyCountry);     
        
        client.SendToServer(toy_data, sock);
        
        toy_data.clear();
    }//GEN-LAST:event_toy_man_ButtonActionPerformed

    private void toyData_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toyData_ButtonActionPerformed
        String toyName = toy_name_2.getText();
        String toyDesc = toy_desc.getText();
        String toyPrice = toy_price.getText();
        String toyDate = toy_date.getText();
        String toyBatchNo = toy_batch_no.getText();
                                
        toy_data.put("toyName", toyName);
        toy_data.put("toyDesc", toyDesc);
        toy_data.put("toyPrice", toyPrice);
        toy_data.put("toyDate", toyDate);
        toy_data.put("toyBatchNo", toyBatchNo);
        
        client.SendToServer(toy_data, sock);
        
        toy_data.clear();
    }//GEN-LAST:event_toyData_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Toy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton toyData_Button;
    private javax.swing.JButton toyID_Button;
    private javax.swing.JTextField toy_ID;
    private javax.swing.JTextField toy_Name;
    private javax.swing.JTextField toy_batch_no;
    private javax.swing.JTextField toy_company_name;
    private javax.swing.JTextArea toy_console;
    private javax.swing.JTextField toy_country;
    private javax.swing.JTextField toy_date;
    private javax.swing.JTextField toy_desc;
    private javax.swing.JButton toy_man_Button;
    private javax.swing.JTextField toy_name_2;
    private javax.swing.JTextField toy_price;
    private javax.swing.JTextField toy_street_address;
    private javax.swing.JTextField toy_zip_code;
    // End of variables declaration//GEN-END:variables
}
