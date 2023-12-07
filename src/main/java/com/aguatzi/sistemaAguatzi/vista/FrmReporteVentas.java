/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author Omar Guerrero
 */
public class FrmReporteVentas extends javax.swing.JFrame {

    /**
     * Creates new form FrmCierreCajaLocal
     */
    UIManager UI;

    public FrmReporteVentas() {

        initComponents();
        setTitle("Reporte de ventas");
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
        lblGarrafonesNuevos = new javax.swing.JLabel();
        lblPagadosTranasferencia = new javax.swing.JLabel();
        lblGarrafonesVaciados = new javax.swing.JLabel();
        lblDineroVenta = new javax.swing.JLabel();
        lblGarrafonesVendidos = new javax.swing.JLabel();
        lblLitrosVendidos = new javax.swing.JLabel();
        txtTotalPagadosTrasferencia = new javax.swing.JTextField();
        txtDineroVentaTotal = new javax.swing.JTextField();
        txtTotalGarrafonesNuevos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDetallado = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidadGarrafonesVendidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadGarrafonesVaciados = new javax.swing.JTextField();
        txtCantidadPagadosTransferencia = new javax.swing.JTextField();
        txtCantidadGarrafonesNuevos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalGarrafonesVaciados = new javax.swing.JTextField();
        txtTotalGarrafonesVendidos = new javax.swing.JTextField();
        txtTotalLitrosVendidos = new javax.swing.JTextField();
        fechaInicial = new com.github.lgooddatepicker.components.DatePicker();
        fechaFinal = new com.github.lgooddatepicker.components.DatePicker();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de ventas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGarrafonesNuevos.setBackground(new java.awt.Color(102, 102, 102));
        lblGarrafonesNuevos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGarrafonesNuevos.setForeground(new java.awt.Color(102, 102, 102));
        lblGarrafonesNuevos.setText("Garrafones Nuevos");
        jPanel1.add(lblGarrafonesNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        lblPagadosTranasferencia.setBackground(new java.awt.Color(102, 102, 102));
        lblPagadosTranasferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPagadosTranasferencia.setForeground(new java.awt.Color(102, 102, 102));
        lblPagadosTranasferencia.setText("Pagados Por Trasferencia");
        jPanel1.add(lblPagadosTranasferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        lblGarrafonesVaciados.setBackground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVaciados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGarrafonesVaciados.setForeground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVaciados.setText("Garrafones Vaciados");
        jPanel1.add(lblGarrafonesVaciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        lblDineroVenta.setBackground(new java.awt.Color(102, 102, 102));
        lblDineroVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDineroVenta.setForeground(new java.awt.Color(102, 102, 102));
        lblDineroVenta.setText("Dinero Venta Total");
        jPanel1.add(lblDineroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        lblGarrafonesVendidos.setBackground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVendidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGarrafonesVendidos.setForeground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVendidos.setText("Garrafones Vendidos");
        jPanel1.add(lblGarrafonesVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        lblLitrosVendidos.setText("Litros Vendidos");
        lblLitrosVendidos.setBackground(new java.awt.Color(102, 102, 102));
        lblLitrosVendidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLitrosVendidos.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblLitrosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        txtTotalPagadosTrasferencia.setEditable(false);
        txtTotalPagadosTrasferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalPagadosTrasferenciaMouseClicked(evt);
            }
        });
        jPanel1.add(txtTotalPagadosTrasferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 90, -1));

        txtDineroVentaTotal.setEditable(false);
        txtDineroVentaTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDineroVentaTotalMouseClicked(evt);
            }
        });
        jPanel1.add(txtDineroVentaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 90, -1));

        txtTotalGarrafonesNuevos.setEditable(false);
        txtTotalGarrafonesNuevos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalGarrafonesNuevosMouseClicked(evt);
            }
        });
        txtTotalGarrafonesNuevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalGarrafonesNuevosActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalGarrafonesNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 90, -1));

        jPanel2.setBackground(new java.awt.Color(58, 138, 236));

        lblBienvenido.setText("Reporte de ventas");
        lblBienvenido.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));

        txtUsuario.setText("Usuario");
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario)
                            .addComponent(lblBienvenido))))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 990, 90));

        btnDetallado.setText("Detallado");
        btnDetallado.setBackground(new java.awt.Color(58, 138, 236));
        btnDetallado.setBorder(null);
        btnDetallado.setBorderPainted(false);
        btnDetallado.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnDetallado.setForeground(new java.awt.Color(255, 255, 255));
        btnDetallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalladoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetallado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 120, 40));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBackground(new java.awt.Color(58, 138, 236));
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(58, 138, 236));
        btnCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, 40));

        txtCantidadGarrafonesVendidos.setEditable(false);
        txtCantidadGarrafonesVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadGarrafonesVendidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadGarrafonesVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 40, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Total");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        txtCantidadGarrafonesVaciados.setEditable(false);
        txtCantidadGarrafonesVaciados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadGarrafonesVaciadosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadGarrafonesVaciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 40, -1));

        txtCantidadPagadosTransferencia.setEditable(false);
        txtCantidadPagadosTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadPagadosTransferenciaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadPagadosTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 40, -1));

        txtCantidadGarrafonesNuevos.setEditable(false);
        txtCantidadGarrafonesNuevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadGarrafonesNuevosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadGarrafonesNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 40, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        jLabel4.setText("a");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 20, -1));

        jLabel5.setText("Seleccione fechas ");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel6.setText("De");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        txtTotalGarrafonesVaciados.setEditable(false);
        txtTotalGarrafonesVaciados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalGarrafonesVaciadosMouseClicked(evt);
            }
        });
        jPanel1.add(txtTotalGarrafonesVaciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 90, -1));

        txtTotalGarrafonesVendidos.setEditable(false);
        txtTotalGarrafonesVendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalGarrafonesVendidosMouseClicked(evt);
            }
        });
        txtTotalGarrafonesVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalGarrafonesVendidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalGarrafonesVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 90, -1));

        txtTotalLitrosVendidos.setEditable(false);
        txtTotalLitrosVendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalLitrosVendidosMouseClicked(evt);
            }
        });
        jPanel1.add(txtTotalLitrosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 90, -1));
        jPanel1.add(fechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 30));
        jPanel1.add(fechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 30));

        btnGenerar.setBackground(new java.awt.Color(58, 138, 236));
        btnGenerar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalladoActionPerformed

    }//GEN-LAST:event_btnDetalladoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDineroVentaTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDineroVentaTotalMouseClicked
        quitarBorde(txtDineroVentaTotal);
    }//GEN-LAST:event_txtDineroVentaTotalMouseClicked

    private void txtTotalPagadosTrasferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalPagadosTrasferenciaMouseClicked
        quitarBorde(txtTotalPagadosTrasferencia);
    }//GEN-LAST:event_txtTotalPagadosTrasferenciaMouseClicked

    private void txtTotalGarrafonesNuevosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalGarrafonesNuevosMouseClicked
        quitarBorde(txtTotalGarrafonesNuevos);
    }//GEN-LAST:event_txtTotalGarrafonesNuevosMouseClicked

    private void txtCantidadGarrafonesVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadGarrafonesVendidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadGarrafonesVendidosActionPerformed

    private void txtCantidadGarrafonesVaciadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadGarrafonesVaciadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadGarrafonesVaciadosActionPerformed

    private void txtCantidadPagadosTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadPagadosTransferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadPagadosTransferenciaActionPerformed

    private void txtCantidadGarrafonesNuevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadGarrafonesNuevosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadGarrafonesNuevosActionPerformed

    private void txtTotalGarrafonesVaciadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalGarrafonesVaciadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalGarrafonesVaciadosMouseClicked

    private void txtTotalGarrafonesVendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalGarrafonesVendidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalGarrafonesVendidosMouseClicked

    private void txtTotalLitrosVendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalLitrosVendidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalLitrosVendidosMouseClicked

    private void txtTotalGarrafonesVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalGarrafonesVendidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalGarrafonesVendidosActionPerformed

        private void txtTotalGarrafonesNuevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalGarrafonesNuevosActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_txtTotalGarrafonesNuevosActionPerformed

        private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();;
    }//GEN-LAST:event_btnLimpiarMouseClicked

    public void quitarBorde(JTextField field) {
        Border border = BorderFactory.createLineBorder(Color.black);
        field.setBorder(border);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDetallado;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private com.github.lgooddatepicker.components.DatePicker fechaFinal;
    private com.github.lgooddatepicker.components.DatePicker fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDineroVenta;
    private javax.swing.JLabel lblGarrafonesNuevos;
    private javax.swing.JLabel lblGarrafonesVaciados;
    private javax.swing.JLabel lblGarrafonesVendidos;
    private javax.swing.JLabel lblLitrosVendidos;
    private javax.swing.JLabel lblPagadosTranasferencia;
    private javax.swing.JTextField txtCantidadGarrafonesNuevos;
    private javax.swing.JTextField txtCantidadGarrafonesVaciados;
    private javax.swing.JTextField txtCantidadGarrafonesVendidos;
    private javax.swing.JTextField txtCantidadPagadosTransferencia;
    private javax.swing.JTextField txtDineroVentaTotal;
    private javax.swing.JTextField txtTotalGarrafonesNuevos;
    private javax.swing.JTextField txtTotalGarrafonesVaciados;
    private javax.swing.JTextField txtTotalGarrafonesVendidos;
    private javax.swing.JTextField txtTotalLitrosVendidos;
    private javax.swing.JTextField txtTotalPagadosTrasferencia;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    public LocalDate getFechaInicial() {
        return fechaInicial.getDate();
    }

    public LocalDate getFechaFinal() {
        return fechaFinal.getDate();
    }

    public String getGarrafonesVaciados() {
        return txtDineroVentaTotal.getText();
    }

    public String getTotalGarrafonesNuevos() {
        return txtTotalGarrafonesNuevos.getText();
    }

    public String getTotalPagadosTrasferencia() {
        return txtTotalPagadosTrasferencia.getText();
    }

    public String getTotalGarrafonesVendidos() {
        return txtTotalGarrafonesVendidos.getText();
    }

    //Setters
    public void setCantidadGarrafonesVendidos(String cantidadGarrafonesVendidos) {
        txtCantidadGarrafonesVendidos.setText(cantidadGarrafonesVendidos);
    }

    public void setTotalGarrafonesVendidos(String totalGarrafonesVendidos) {
        txtTotalGarrafonesVendidos.setText(totalGarrafonesVendidos);
    }

    public void setCantidadGarrafonesPagadosTransferencia(String cantidadGarrafonesPagadosTransferencia) {
        txtCantidadPagadosTransferencia.setText(cantidadGarrafonesPagadosTransferencia);
    }

    public void setTotalGarrafonesPagadosTransferencia(String totalGarrafonesPagadosTransferencia) {
        txtTotalPagadosTrasferencia.setText(totalGarrafonesPagadosTransferencia);
    }

    public void setCantidadGarrafonesNuevos(String cantidadGarrafonesNuevos) {
        txtCantidadGarrafonesNuevos.setText(cantidadGarrafonesNuevos);
    }

    public void setTotalGarrafonesNuevos(String totalGarrafonesNuevos) {
        txtTotalGarrafonesNuevos.setText(totalGarrafonesNuevos);
    }

    public void setCantidadGarrafonesVaciados(String cantidadGarrafonesVaciados) {
        txtCantidadGarrafonesVaciados.setText(cantidadGarrafonesVaciados);
    }

    public void setTotalGarrafonesVaciados(String totalGarrafonesVaciados) {
        txtTotalGarrafonesVaciados.setText(totalGarrafonesVaciados);
    }

    public void setTotalLitrosVendidos(String totalLitrosVendidos) {
        txtTotalLitrosVendidos.setText(totalLitrosVendidos);
    }

    public void setDineroVentaTotal(String dineroVentaTotal) {
        txtDineroVentaTotal.setText(dineroVentaTotal);
    }

    //
    public void agregarDetalladoListener(ActionListener actionListener) {
        btnDetallado.addActionListener(actionListener);
    }

    public void agregarGenerarListener(ActionListener actionListener) {
        btnGenerar.addActionListener(actionListener);
    }

    public void agregarLimpiarListener(ActionListener actionListener) {
        btnLimpiar.addActionListener(actionListener);
    }

    public void agregarCancelarListener(ActionListener actionListener) {
        btnCancelar.addActionListener(actionListener);
    }

    public void limpiar() {
        txtCantidadGarrafonesNuevos.setText("");
        txtTotalGarrafonesNuevos.setText("");
        txtCantidadGarrafonesVendidos.setText("");
        txtTotalGarrafonesVendidos.setText("");
        txtCantidadGarrafonesVaciados.setText("");
        txtTotalGarrafonesVaciados.setText("");
        txtCantidadPagadosTransferencia.setText("");
        txtTotalPagadosTrasferencia.setText("");
        txtTotalLitrosVendidos.setText("");
        txtDineroVentaTotal.setText("");
        fechaInicial.setText("");
        fechaFinal.setText("");
    }

    public void mostrarMensaje(String mensaje) {
        UI = null;
        UI.put("OptionPane.background", new Color(58, 138, 236));
        UI.put("Panel.background", new Color(58, 138, 236));
        JOptionPane.showMessageDialog(this, "<html><p style = \"color:white \">" + mensaje.replace("\n", "<br>") + "</p></html>", "Aviso", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/gota.png", 40, 40));

    }

    public void mostrarMensajeError(String mensajeError) {
        UI = null;
        UI.put("OptionPane.background", new Color(58, 138, 236));
        UI.put("Panel.background", new Color(58, 138, 236));
        JOptionPane.showMessageDialog(this, "<html><p style = \"color:white \">" + mensajeError.replace("\n", "<br>") + "</p></html>", "Error", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/gota.png", 40, 40));
    }

    public int mostrarMensajeConfirmacion(String mensaje) {
        UI = null;
        UI.put("OptionPane.background", new Color(58, 138, 236));
        UI.put("Panel.background", new Color(58, 138, 236));
        return JOptionPane.showConfirmDialog(this, "<html><p style = \"color:white; font:12px; \">" + mensaje.replace("\n", "<br>") + "</p></html>", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, HEIGHT, icono("/imagenes/gota.png", 60, 60));
    }

    public void eliminarVentana() {
        this.dispose();
    }

    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, heigth));
        return img;
    }

    private boolean contieneSoloNumeros(String campo) {
        return campo.matches("[0-9]+");
    }

    public boolean CampoVacio() {
        if (fechaInicial.getText().isEmpty() || fechaFinal.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean rangoFechasInvalido(){
	    return fechaFinal.getDate().isBefore(fechaInicial.getDate());
    }

    private void cambiarColor(JTextField textField) {
        if (textField.getText().trim().isEmpty()) {
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            textField.setBorder(border);
        }
        if (!contieneSoloNumeros(textField.getText())) {
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            textField.setBorder(border);
        }
    }

    public void setNombreUsuario(String nombreUsuario) {
        txtUsuario.setText(nombreUsuario);
    }

}
