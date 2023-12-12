package com.mycompany.proyectocrud_2.Gráfica;

import com.mycompany.proyectocrud_2.Lógica.Controladora;
import com.mycompany.proyectocrud_2.Lógica.Reporte;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerReporte extends javax.swing.JFrame {

    Controladora control = null;

    public VerReporte() {

        control = new Controladora();
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();
        btn_editar = new javax.swing.JToggleButton();
        btn_eliminar = new javax.swing.JToggleButton();
        btn_Retroceder = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setText("Visualización de Reportes");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaReportes);

        btn_editar.setText("Editar Reporte");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar Reporte");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btn_editar)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Retroceder.setText("<=");
        btn_Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetrocederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_Retroceder)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_Retroceder)
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (tablaReportes.getRowCount() > 0) {
            if (tablaReportes.getSelectedRow() != -1) {
                int códigoJugadorRep = Integer.parseInt(String.valueOf(tablaReportes.getValueAt(tablaReportes.getSelectedRow(), 0)));

                control.borrarReporte(códigoJugadorRep);

                mostrarMensaje("Reporte Eliminado correctamente", "Información", "Borrado de Reporte");
                cargarTabla();
            } else {
                mostrarMensaje("No seleccionó ningun reporte", "Error", "Error al eliminar");
            }

        } else {
            mostrarMensaje("No hay ningún reporte para eliminar en la tabla", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetrocederActionPerformed

        this.dispose();

    }//GEN-LAST:event_btn_RetrocederActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        if (tablaReportes.getRowCount() > 0) {
            if (tablaReportes.getSelectedRow() != -1) {
                int códigoJugadorRep = Integer.parseInt(String.valueOf(tablaReportes.getValueAt(tablaReportes.getSelectedRow(), 0)));

                EditarReporte pantallaEdit = new EditarReporte(códigoJugadorRep);
                pantallaEdit.setVisible(true);
                pantallaEdit.setLocationRelativeTo(null);

                this.dispose();
                
            } else {
                mostrarMensaje("No seleccionó ningun reporte", "Error", "Error al eliminar");
            }

        } else {
            mostrarMensaje("No hay ningún reporte para eliminar en la tabla", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btn_editarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String título) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Información")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(título);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Retroceder;
    private javax.swing.JToggleButton btn_editar;
    private javax.swing.JToggleButton btn_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaReportes;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        //Definimos nuestra tabla a mostrar
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String títulos[] = {"Código", "ID de Jugador", "Celular", "Correo Electrónico", "Servidor", "ID del Jugador Reportado", "Fecha", "Motivo", "Observación"};
        modeloTabla.setColumnIdentifiers(títulos);

        //Carga de los datos desde la Base de Datos
        List<Reporte> listaReportes = control.traerReportes();

        //Recorrer lista de Reporte y visualizar cada elemento en la tabla
        if (listaReportes != null) {
            for (Reporte rep : listaReportes) {
                Object[] objeto = {rep.getEljugador().getCódigoJugador(), rep.getEljugador().getIdJugador(), rep.getEljugador().getCelular(), rep.getEljugador().getCorreoElectrónico(), rep.getEljugador().getServidor(),
                    rep.getIdJugadorRep(), rep.getFecha(), rep.getMotivo(), rep.getObservación()};

                modeloTabla.addRow(objeto);
            }
        }

        tablaReportes.setModel(modeloTabla);

    }
    
}
