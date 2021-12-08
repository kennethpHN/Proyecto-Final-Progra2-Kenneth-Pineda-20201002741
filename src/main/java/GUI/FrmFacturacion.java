/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Util.AdminArchivos;
import Util.AdminSerializacion;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pinedas
 */
public class FrmFacturacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmFactura
     */
    public FrmFacturacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFactura = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBoletos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Facturas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtFactura);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBoletos.setText("Boletos");
        btnBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletosActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");

        jButton6.setText("Buscar");

        jButton7.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(jButton2)
                    .addComponent(btnGuardar)
                    .addComponent(btnBoletos)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBoletos, btnGuardar, btnNuevo, jButton2, jButton5, jButton6, jButton7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBoletos)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBoletos, btnGuardar, btnNuevo, jButton2, jButton5, jButton6, jButton7});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Dimension jInternal = MDIPrincipal.frmFacturacionBoletos.getSize(); //Dimensión de mi formulario interno
        Dimension desktopSize = this.getDesktopPane().getSize(); //Dimensiones de mi desktop
        MDIPrincipal.frmFacturacionBoletos.setLocation((desktopSize.width - jInternal.width) / 2, (desktopSize.height - jInternal.height) / 2);
        this.getDesktopPane().add(MDIPrincipal.frmFacturacionBoletos);
        MDIPrincipal.frmFacturacionBoletos.setVisible(true);
        MDIPrincipal.frmFacturacionBoletos._agregando = true;
        MDIPrincipal.frmFacturacionBoletos.inicioFormulario();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletosActionPerformed
        // TODO add your handling code here:
        Dimension jInternal = MDIPrincipal.frmFacturacionBoletos.getSize(); //Dimensión de mi formulario interno
        Dimension desktopSize = this.getDesktopPane().getSize(); //Dimensiones de mi desktop
        MDIPrincipal.frmFacturacionBoletos.setLocation((desktopSize.width - jInternal.width) / 2, (desktopSize.height - jInternal.height) / 2);
        this.getDesktopPane().add(MDIPrincipal.frmFacturacionBoletos);
        MDIPrincipal.frmFacturacionBoletos.setVisible(true);

        int _indiceSeleccionado = this.jtFactura.getSelectedRow();
        int _idFacturaSeleccionada = MDIPrincipal.gFactura.getElementoPorPosicion(_indiceSeleccionado).get_id();

        MDIPrincipal.frmFacturacionBoletos._agregando = false;
        MDIPrincipal.frmFacturacionBoletos._codigoFactura = _idFacturaSeleccionada;

        MDIPrincipal.frmFacturacionBoletos.inicioFormulario();
    }//GEN-LAST:event_btnBoletosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        AdminSerializacion.serializacion(MDIPrincipal.gFactura, "gFactura.obj");
        AdminArchivos adminA = new AdminArchivos();
        adminA.setNombreArchivo("Reporte Facturas.csv");
        adminA.setContenido(MDIPrincipal.gFactura.getInfoReporte());
        adminA.escribir();
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, "Reporte generado correctamente");
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void actualizarElementosTabla() {
        // String codigo, dni, nombre, apellido
        String[] titulos = {"ID", "Fecha", "Asesor De Servicio", "Cliente", "Total"};
        DefaultTableModel dt = new DefaultTableModel(MDIPrincipal.gFactura.GetArrayGestion(), titulos);
        this.jtFactura.setModel(dt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoletos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtFactura;
    // End of variables declaration//GEN-END:variables
}