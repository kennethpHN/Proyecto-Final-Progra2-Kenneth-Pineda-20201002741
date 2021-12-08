/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Util.AdminArchivos;
import Util.AdminSerializacion;
import Util.AdminFechas;
import clases.Fecha;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pinedas
 */
public class FrmFecha extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmFecha
     */
    private boolean _agregando;
    private int _indiceSeleccion;

    public FrmFecha() {
        initComponents();
        this.setTitle("Gestión de Fecha");
        txtDescripcion.setText("dd/MM/YYYY");
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

        btnEditar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFecha = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();

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

        jLabel3.setText("Descripcion:");

        jLabel8.setText("Codigo:");

        txtCodigo.setEditable(false);

        txtDescripcion.setEditable(false);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jtFecha.setModel(new javax.swing.table.DefaultTableModel(
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
        jtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtFechaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtFecha);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel3))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGuardar)))
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReporte)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this._agregando = false;
        estadoBotones(false);
        estadoControles(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        AdminArchivos adminA = new AdminArchivos();
        adminA.setNombreArchivo("Reporte  Fecha.csv");
        adminA.setContenido(MDIPrincipal.gFecha.getInfoReporte());
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
        String codigo, descripcion;
        codigo = this.txtCodigo.getText();
        descripcion = this.txtDescripcion.getText();
        //Paso 2
        Fecha fecha = new Fecha();

        try {
            //Paso 3
            //origen.set_codigo(Integer.parseInt(codigo));
            fecha.set_descripcion(AdminFechas.stringToDate(descripcion));
            if (this._agregando) { // agregara
                /**
                 * 4. Agregar instancia a la gestion
                 */

                //Paso 4
                MDIPrincipal.gFecha.Agregar(fecha);

            } else { // editara o modificara
                /**
                 * 4. Editar instancia en la gestion
                 */
                //Paso 1.1
                codigo = this.txtCodigo.getText();
                //Paso 3.1
                fecha.set_codigo(Integer.parseInt(codigo));

                //Paso 4
                MDIPrincipal.gFecha.Modificar(this._indiceSeleccion, fecha);
            }
            //Paso 5
            actualizarElementosTabla();
            estadoBotones(true);
            estadoControles(false);

            //Paso 6: Serializar informacion
            AdminSerializacion.serializacion(MDIPrincipal.gFecha, "gFecha.obj");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String _codigoFecha = JOptionPane.showInputDialog("Ingrese el código");
        Fecha _fechaEncontrado = MDIPrincipal.gFecha.BuscarPorCodigoGetElem(Integer.parseInt(_codigoFecha));
        if (_fechaEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Elemento no encontrado");
        } else {
            mostrarElemento(_fechaEncontrado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (_indiceSeleccion >= 0) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Warning", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                MDIPrincipal.gFecha.Eliminar(_indiceSeleccion);
                actualizarElementosTabla();
                //Paso 6: Serializar informacion
                AdminSerializacion.serializacion(MDIPrincipal.gFecha, "gFecha.obj");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor seleccione el elemento de la tabla que desea eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void jtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFechaMousePressed
        // TODO add your handling code here:
        _indiceSeleccion = jtFecha.getSelectedRow();
        if (_indiceSeleccion != -1) {
            Fecha _fecha = MDIPrincipal.gFecha.getElementoPorPosicion(_indiceSeleccion);
            mostrarElemento(_fecha);
        }
    }//GEN-LAST:event_jtFechaMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this._agregando = true;

        estadoBotones(false);
        estadoControles(true);
        //this.txtCodigo.setEditable(true);
        this.txtCodigo.setText("");
        this.txtDescripcion.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
        // TODO add your handling code here:
        if (txtDescripcion.getText().trim().equals("dd/MM/YYYY"))
            txtDescripcion.setText("");
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost
        // TODO add your handling code here:
        if (txtDescripcion.getText().trim().equals(""))
            txtDescripcion.setText("dd/MM/YYYY");
    }//GEN-LAST:event_txtDescripcionFocusLost

    public void estadoControles(boolean _estado) {
        this.txtDescripcion.setEditable(_estado);
    }

    public void estadoBotones(boolean _estado) {
        this.btnBuscar.setEnabled(_estado);
        this.btnEditar.setEnabled(_estado);
        this.btnEliminar.setEnabled(_estado);
        this.btnGuardar.setEnabled(!_estado);
        this.btnNuevo.setEnabled(_estado);
        this.btnReporte.setEnabled(_estado);
    }

    public void mostrarElemento(Fecha _fecha) {
        this.txtCodigo.setText(Integer.toString(_fecha.get_codigo()));
        this.txtDescripcion.setText(AdminFechas.FechaToString(_fecha.get_descripcion()));
        
    }

    public void actualizarElementosTabla() {
        // String codigo, dni, nombre, apellido
        String[] titulos = {"Código", "Descripción"};
        DefaultTableModel dt = new DefaultTableModel(MDIPrincipal.gFecha.GetArrayGestion(), titulos);
        this.jtFecha.setModel(dt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtFecha;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
