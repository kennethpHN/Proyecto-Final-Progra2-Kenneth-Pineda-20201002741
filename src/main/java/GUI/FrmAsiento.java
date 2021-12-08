/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Util.AdminArchivos;
import Util.AdminSerializacion;
import clases.Asiento;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pinedas
 */
public class FrmAsiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmAsiento
     */
    private boolean _agregando;
    private int _indiceSeleccion;

    public FrmAsiento() {
        initComponents();
        this.setTitle("Gestión de Asiento");
        actualizarElementosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAsiento = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        txtCodigo.setEditable(false);

        jtAsiento.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAsiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtAsientoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtAsiento);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnReporte)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnEditar)
                        .addComponent(btnBuscar)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtAsientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAsientoMousePressed
        // TODO add your handling code here:
        _indiceSeleccion = jtAsiento.getSelectedRow();
        if (_indiceSeleccion != -1) {
            Asiento _asiento = MDIPrincipal.gAsiento.getElementoPorPosicion(_indiceSeleccion);
            mostrarElemento(_asiento);
        }
    }//GEN-LAST:event_jtAsientoMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this._agregando = true;

        estadoBotones(false);
        estadoControles(true);
        //this.txtCodigo.setEditable(true);
        this.txtCodigo.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this._agregando = false;
        estadoBotones(false);
        estadoControles(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        AdminArchivos adminA = new AdminArchivos();
        adminA.setNombreArchivo("Reporte Asiento.csv");
        adminA.setContenido(MDIPrincipal.gAsiento.getInfoReporte());
        adminA.escribir();
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, "Reporte generado correctamente");

    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        /**
         * 1. Solicitar valores 2. Crear instancia 3. Setear valores a instancia
         * 4. Agregar instancia a la gestion 5. Mostrar valores
         */

        //Paso 1
        String codigo;
        codigo = this.txtCodigo.getText();
        //Paso 2
        Asiento asiento = new Asiento();

        try {
            //Paso 3
            //origen.set_codigo(Integer.parseInt(codigo));
            if (this._agregando) { // agregara
                /**
                 * 4. Agregar instancia a la gestion
                 */

                //Paso 4
                MDIPrincipal.gAsiento.Agregar(asiento);

            } else { // editara o modificara
                /**
                 * 4. Editar instancia en la gestion
                 */
                //Paso 1.1
                codigo = this.txtCodigo.getText();
                //Paso 3.1
                asiento.set_codigo(Integer.parseInt(codigo));

                //Paso 4
                MDIPrincipal.gAsiento.Modificar(this._indiceSeleccion, asiento);
            }
            //Paso 5
            actualizarElementosTabla();
            estadoBotones(true);
            estadoControles(false);

            //Paso 6: Serializar informacion
            AdminSerializacion.serializacion(MDIPrincipal.gAsiento, "gAsiento.obj");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String _codigoAsiento = JOptionPane.showInputDialog("Ingrese el código");
        Asiento _asientoEncontrado = MDIPrincipal.gAsiento.BuscarPorcodigoGetElem(Integer.parseInt(_codigoAsiento));
        if (_asientoEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Elemento no encontrado");
        } else {
            mostrarElemento(_asientoEncontrado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (_indiceSeleccion >= 0) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Warning", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                MDIPrincipal.gAsiento.Eliminar(_indiceSeleccion);
                actualizarElementosTabla();
                //Paso 6: Serializar informacion
                AdminSerializacion.serializacion(MDIPrincipal.gAsiento, "gAsiento.obj");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor seleccione el elemento de la tabla que desea eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void estadoControles(boolean _estado) {
    }

    public void estadoBotones(boolean _estado) {
        this.btnBuscar.setEnabled(_estado);
        this.btnEditar.setEnabled(_estado);
        this.btnEliminar.setEnabled(_estado);
        this.btnGuardar.setEnabled(!_estado);
        this.btnNuevo.setEnabled(_estado);
        this.btnReporte.setEnabled(_estado);
    }

    public void mostrarElemento(Asiento _asiento) {
        this.txtCodigo.setText(Integer.toString(_asiento.get_codigo()));
    }

    public void actualizarElementosTabla() {
        // String codigo, dni, nombre, apellido
        String[] titulos = {"Código"};
        DefaultTableModel dt = new DefaultTableModel(MDIPrincipal.gAsiento.GetArrayGestion(), titulos);
        this.jtAsiento.setModel(dt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtAsiento;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
