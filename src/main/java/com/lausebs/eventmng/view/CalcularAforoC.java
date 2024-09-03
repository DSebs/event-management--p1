/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.lausebs.eventmng.view;

import com.lausebas.eventmng.services.ServicioEvento;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author estigia
 */
public class CalcularAforoC extends javax.swing.JFrame {

       private ServicioEvento servicioEvento;
       
    public CalcularAforoC(ServicioEvento servicioEvento) {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        this.servicioEvento = servicioEvento;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFBuscarConcierto = new javax.swing.JTextField();
        pnlCenter = new javax.swing.JPanel();
        lblNLocalidades = new javax.swing.JLabel();
        txtFUbicacion = new javax.swing.JTextField();
        txtFNLocalidades = new javax.swing.JTextField();
        txtFPrecio = new javax.swing.JTextField();
        lblArtista = new javax.swing.JLabel();
        txtFFecha = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblTipoMusica = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        txtFTipoMusica = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtFArtista = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtFCalcularAforo = new javax.swing.JTextField();
        btnCalcularAforo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtFBuscarConcierto.setForeground(new java.awt.Color(153, 153, 153));
        txtFBuscarConcierto.setText("Digite el nombre");
        txtFBuscarConcierto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFBuscarConciertoMousePressed(evt);
            }
        });
        txtFBuscarConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFBuscarConciertoActionPerformed(evt);
            }
        });

        pnlCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNLocalidades.setForeground(new java.awt.Color(5, 44, 77));
        lblNLocalidades.setText("Nª Localidades");

        txtFUbicacion.setEditable(false);
        txtFUbicacion.setBackground(new java.awt.Color(185, 209, 226));
        txtFUbicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFUbicacionActionPerformed(evt);
            }
        });

        txtFNLocalidades.setEditable(false);
        txtFNLocalidades.setBackground(new java.awt.Color(185, 209, 226));
        txtFNLocalidades.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNLocalidadesActionPerformed(evt);
            }
        });

        txtFPrecio.setEditable(false);
        txtFPrecio.setBackground(new java.awt.Color(185, 209, 226));
        txtFPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFPrecioActionPerformed(evt);
            }
        });

        lblArtista.setForeground(new java.awt.Color(5, 44, 77));
        lblArtista.setText("Artista");

        txtFFecha.setEditable(false);
        txtFFecha.setBackground(new java.awt.Color(185, 209, 226));
        txtFFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFechaActionPerformed(evt);
            }
        });

        lblNombre.setForeground(new java.awt.Color(5, 44, 77));
        lblNombre.setText("Nombre");

        lblTipoMusica.setForeground(new java.awt.Color(5, 44, 77));
        lblTipoMusica.setText("Tipo de musica");

        txtFNombre.setEditable(false);
        txtFNombre.setBackground(new java.awt.Color(185, 209, 226));
        txtFNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreActionPerformed(evt);
            }
        });

        txtFTipoMusica.setEditable(false);
        txtFTipoMusica.setBackground(new java.awt.Color(185, 209, 226));
        txtFTipoMusica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFTipoMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTipoMusicaActionPerformed(evt);
            }
        });

        lblFecha.setForeground(new java.awt.Color(5, 44, 77));
        lblFecha.setText("Fecha");

        lblUbicacion.setForeground(new java.awt.Color(5, 44, 77));
        lblUbicacion.setText("Ubicacion");

        lblPrecio.setForeground(new java.awt.Color(5, 44, 77));
        lblPrecio.setText("Precio");

        txtFArtista.setEditable(false);
        txtFArtista.setBackground(new java.awt.Color(185, 209, 226));
        txtFArtista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFArtistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addComponent(lblUbicacion)
                        .addGap(47, 47, 47)
                        .addComponent(txtFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblFecha))
                        .addGap(56, 56, 56)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtFFecha)))
                    .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlCenterLayout.createSequentialGroup()
                            .addComponent(lblPrecio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNLocalidades)
                                    .addComponent(lblArtista))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                                .addComponent(lblTipoMusica)
                                .addGap(18, 18, 18)
                                .addComponent(txtFTipoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFFecha))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbicacion)
                    .addComponent(txtFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoMusica)
                    .addComponent(txtFTipoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNLocalidades)
                    .addComponent(txtFNLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArtista)
                    .addComponent(txtFArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        lblTitulo.setFont(new java.awt.Font("URW Gothic", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(5, 44, 77));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calcular Aforo Concierto");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnBuscar.setBackground(new java.awt.Color(5, 44, 77));
        btnBuscar.setFont(new java.awt.Font("URW Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtFCalcularAforo.setEditable(false);
        txtFCalcularAforo.setBackground(new java.awt.Color(185, 209, 226));
        txtFCalcularAforo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFCalcularAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCalcularAforoActionPerformed(evt);
            }
        });

        btnCalcularAforo.setBackground(new java.awt.Color(5, 44, 77));
        btnCalcularAforo.setFont(new java.awt.Font("URW Gothic", 1, 12)); // NOI18N
        btnCalcularAforo.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularAforo.setText("Calcular Aforo");
        btnCalcularAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAforoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFBuscarConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnCalcularAforo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFCalcularAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTitulo)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFBuscarConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularAforo)
                    .addComponent(txtFCalcularAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFBuscarConciertoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFBuscarConciertoMousePressed
        txtFBuscarConcierto.setText("");
        txtFBuscarConcierto.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_txtFBuscarConciertoMousePressed

    private void txtFBuscarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFBuscarConciertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFBuscarConciertoActionPerformed

    private void txtFUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUbicacionActionPerformed

    private void txtFNLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNLocalidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNLocalidadesActionPerformed

    private void txtFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFPrecioActionPerformed

    private void txtFFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFechaActionPerformed

    private void txtFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreActionPerformed

    private void txtFTipoMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTipoMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFTipoMusicaActionPerformed

    private void txtFArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFArtistaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      String nombre = txtFBuscarConcierto.getText();
   try{
       txtFNombre.setText(servicioEvento.buscarConcierto(nombre).getNombre());
       txtFFecha.setText(String.valueOf(servicioEvento.buscarConcierto(nombre).getFecha()));
       txtFUbicacion.setText(servicioEvento.buscarConcierto(nombre).getUbicacion());
       txtFPrecio.setText(String.valueOf(servicioEvento.buscarConcierto(nombre).getPrecioEntrada()));
       txtFTipoMusica.setText(servicioEvento.buscarConcierto(nombre).getTipoMusica());
       txtFNLocalidades.setText(String.valueOf(servicioEvento.buscarConcierto(nombre).getLocalidades()));
       txtFArtista.setText(servicioEvento.buscarConcierto(nombre).getArtista().getNombre());
   }
   catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFCalcularAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCalcularAforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCalcularAforoActionPerformed

    private void btnCalcularAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAforoActionPerformed
         String nombre = txtFBuscarConcierto.getText();
         try{
             
         
         txtFCalcularAforo.setText(String.valueOf(servicioEvento.buscarConcierto(nombre).calcularAforo()));
         } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularAforoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcularAforo;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNLocalidades;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoMusica;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JTextField txtFArtista;
    private javax.swing.JTextField txtFBuscarConcierto;
    private javax.swing.JTextField txtFCalcularAforo;
    private javax.swing.JTextField txtFFecha;
    private javax.swing.JTextField txtFNLocalidades;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFPrecio;
    private javax.swing.JTextField txtFTipoMusica;
    private javax.swing.JTextField txtFUbicacion;
    // End of variables declaration//GEN-END:variables
}