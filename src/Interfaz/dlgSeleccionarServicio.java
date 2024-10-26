/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interfaz;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class dlgSeleccionarServicio extends javax.swing.JDialog {
private Servicio servicioSeleccionado;
private principal principalFrame;
    
    public dlgSeleccionarServicio(java.awt.Frame parent, boolean modal, String nombreCliente, String dniCliente) {
        super(parent, modal);
        FlatMacDarkLaf.setup();
        initComponents();
        this.principalFrame = (principal) parent;
        dlgSeleccionarServicio_lblNombre.setText(nombreCliente);
        dlgSeleccionarServicio_lblDni.setText(dniCliente);
    }
    
     public JTable getTblSeleccionServicio() {
        return tblSeleccionServicio;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSeleccionarServicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeleccionServicio = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        dlgSeleccionarServicio_lblDni = new javax.swing.JLabel();
        dlgSeleccionarServicio_lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnSeleccionarServicio.setBackground(new java.awt.Color(15, 130, 255));
        btnSeleccionarServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeleccionarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarServicio.setText("Seleccionar");
        btnSeleccionarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarServicioActionPerformed(evt);
            }
        });

        tblSeleccionServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Servicio", "Tipo", "Dirección", "Estado", "F. Contratación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSeleccionServicio);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DNI/RUC");

        dlgSeleccionarServicio_lblDni.setText("48322105");

        dlgSeleccionarServicio_lblNombre.setText("ROY MARKOS HUAYTA LAURA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(dlgSeleccionarServicio_lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(dlgSeleccionarServicio_lblDni)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionarServicio))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(dlgSeleccionarServicio_lblNombre)
                        .addComponent(dlgSeleccionarServicio_lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeleccionarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarServicioActionPerformed
     seleccionarServicio();
    }//GEN-LAST:event_btnSeleccionarServicioActionPerformed

    private void seleccionarServicio() {
    int selectedRow = tblSeleccionServicio.getSelectedRow();
    if (selectedRow != -1) {
        int idServicio = (int) tblSeleccionServicio.getValueAt(selectedRow, 0); // Asumiendo que la primera columna es el ID del servicio
        principalFrame.actualizarDatosPrincipal(idServicio); 
        this.dispose(); // Cerrar el diálogo
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un servicio.", "Selección de Servicio", JOptionPane.WARNING_MESSAGE);
    }
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
            java.util.logging.Logger.getLogger(dlgSeleccionarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccionarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccionarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgSeleccionarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        // Proporciona valores de ejemplo o variables adecuadas para los parámetros
        String nombreCliente = "Nombre de Ejemplo"; // Sustituye con el valor real
        String dniCliente = "DNI de Ejemplo"; // Sustituye con el valor real
        dlgSeleccionarServicio dialog = new dlgSeleccionarServicio(new javax.swing.JFrame(), true, nombreCliente, dniCliente);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarServicio;
    private javax.swing.JLabel dlgSeleccionarServicio_lblDni;
    private javax.swing.JLabel dlgSeleccionarServicio_lblNombre;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSeleccionServicio;
    // End of variables declaration//GEN-END:variables
}
