package main;

import java.awt.Color;
import javax.swing.JPanel;

public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setLocationRelativeTo(null);
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
        opcioneszquierda = new javax.swing.JPanel();
        botonIniciarSesion = new javax.swing.JPanel();
        ind_LogIn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonPorDefinir = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonEventos = new javax.swing.JPanel();
        ind_Eventos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botonPorDefinir2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonPorDefinir3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        contenedorEventos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ayuda Mutua - Control de eventos");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcioneszquierda.setBackground(new java.awt.Color(2, 27, 34));

        botonIniciarSesion.setBackground(new java.awt.Color(2, 27, 34));
        botonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseReleased(evt);
            }
        });

        ind_LogIn.setBackground(new java.awt.Color(255, 255, 255));
        ind_LogIn.setOpaque(false);
        ind_LogIn.setPreferredSize(new java.awt.Dimension(5, 70));

        javax.swing.GroupLayout ind_LogInLayout = new javax.swing.GroupLayout(ind_LogIn);
        ind_LogIn.setLayout(ind_LogInLayout);
        ind_LogInLayout.setHorizontalGroup(
            ind_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_LogInLayout.setVerticalGroup(
            ind_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iniciar Sesion");

        javax.swing.GroupLayout botonIniciarSesionLayout = new javax.swing.GroupLayout(botonIniciarSesion);
        botonIniciarSesion.setLayout(botonIniciarSesionLayout);
        botonIniciarSesionLayout.setHorizontalGroup(
            botonIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonIniciarSesionLayout.createSequentialGroup()
                .addComponent(ind_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botonIniciarSesionLayout.setVerticalGroup(
            botonIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addGroup(botonIniciarSesionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        botonPorDefinir.setBackground(new java.awt.Color(2, 27, 34));
        botonPorDefinir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPorDefinirMousePressed(evt);
            }
        });

        ind_1.setBackground(new java.awt.Color(255, 255, 255));
        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(5, 70));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por definir");

        javax.swing.GroupLayout botonPorDefinirLayout = new javax.swing.GroupLayout(botonPorDefinir);
        botonPorDefinir.setLayout(botonPorDefinirLayout);
        botonPorDefinirLayout.setHorizontalGroup(
            botonPorDefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPorDefinirLayout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        botonPorDefinirLayout.setVerticalGroup(
            botonPorDefinirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addGroup(botonPorDefinirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        botonEventos.setBackground(new java.awt.Color(6, 45, 50));
        botonEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEventosMousePressed(evt);
            }
        });

        ind_Eventos.setBackground(new java.awt.Color(255, 255, 255));
        ind_Eventos.setPreferredSize(new java.awt.Dimension(5, 70));

        javax.swing.GroupLayout ind_EventosLayout = new javax.swing.GroupLayout(ind_Eventos);
        ind_Eventos.setLayout(ind_EventosLayout);
        ind_EventosLayout.setHorizontalGroup(
            ind_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_EventosLayout.setVerticalGroup(
            ind_EventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eventos");

        javax.swing.GroupLayout botonEventosLayout = new javax.swing.GroupLayout(botonEventos);
        botonEventos.setLayout(botonEventosLayout);
        botonEventosLayout.setHorizontalGroup(
            botonEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonEventosLayout.createSequentialGroup()
                .addComponent(ind_Eventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        botonEventosLayout.setVerticalGroup(
            botonEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_Eventos, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addGroup(botonEventosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        botonPorDefinir2.setBackground(new java.awt.Color(2, 27, 34));
        botonPorDefinir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPorDefinir2MousePressed(evt);
            }
        });

        ind_2.setBackground(new java.awt.Color(255, 255, 255));
        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(5, 70));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Por definir");

        javax.swing.GroupLayout botonPorDefinir2Layout = new javax.swing.GroupLayout(botonPorDefinir2);
        botonPorDefinir2.setLayout(botonPorDefinir2Layout);
        botonPorDefinir2Layout.setHorizontalGroup(
            botonPorDefinir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPorDefinir2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        botonPorDefinir2Layout.setVerticalGroup(
            botonPorDefinir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addGroup(botonPorDefinir2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        botonPorDefinir3.setBackground(new java.awt.Color(2, 27, 34));
        botonPorDefinir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPorDefinir3MousePressed(evt);
            }
        });

        ind_3.setBackground(new java.awt.Color(255, 255, 255));
        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(5, 70));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Por definir");

        javax.swing.GroupLayout botonPorDefinir3Layout = new javax.swing.GroupLayout(botonPorDefinir3);
        botonPorDefinir3.setLayout(botonPorDefinir3Layout);
        botonPorDefinir3Layout.setHorizontalGroup(
            botonPorDefinir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPorDefinir3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        botonPorDefinir3Layout.setVerticalGroup(
            botonPorDefinir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonPorDefinir3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout opcioneszquierdaLayout = new javax.swing.GroupLayout(opcioneszquierda);
        opcioneszquierda.setLayout(opcioneszquierdaLayout);
        opcioneszquierdaLayout.setHorizontalGroup(
            opcioneszquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPorDefinir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPorDefinir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPorDefinir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        opcioneszquierdaLayout.setVerticalGroup(
            opcioneszquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcioneszquierdaLayout.createSequentialGroup()
                .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botonPorDefinir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPorDefinir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPorDefinir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
        );

        getContentPane().add(opcioneszquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        contenedorEventos.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(0, 67, 92));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(35, 85, 96));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(35, 85, 96));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(35, 85, 96));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorEventosLayout = new javax.swing.GroupLayout(contenedorEventos);
        contenedorEventos.setLayout(contenedorEventosLayout);
        contenedorEventosLayout.setHorizontalGroup(
            contenedorEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEventosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenedorEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(contenedorEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        contenedorEventosLayout.setVerticalGroup(
            contenedorEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEventosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorEventosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(contenedorEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 910, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEventosMousePressed
        setColor(botonEventos,ind_Eventos);
        mostrarPanel(contenedorEventos);
        resetColor(new JPanel[]{botonPorDefinir,botonPorDefinir2,botonPorDefinir3}, new JPanel[]{ind_1,ind_2,ind_3});
    }//GEN-LAST:event_botonEventosMousePressed

    private void botonPorDefinirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPorDefinirMousePressed
        setColor(botonPorDefinir,ind_1);
        ocultarPanel(contenedorEventos);
        resetColor(new JPanel[]{botonEventos,botonPorDefinir2,botonPorDefinir3},new JPanel[]{ind_Eventos,ind_2,ind_3});
    }//GEN-LAST:event_botonPorDefinirMousePressed

    private void botonPorDefinir2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPorDefinir2MousePressed
        setColor(botonPorDefinir2,ind_2);
        ocultarPanel(contenedorEventos);
        resetColor(new JPanel[]{botonPorDefinir,botonEventos,botonPorDefinir3},new JPanel[]{ind_1,ind_Eventos,ind_3});
    }//GEN-LAST:event_botonPorDefinir2MousePressed

    private void botonPorDefinir3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPorDefinir3MousePressed
        setColor(botonPorDefinir3,ind_3);
        ocultarPanel(contenedorEventos);
        resetColor(new JPanel[]{botonPorDefinir,botonPorDefinir2,botonEventos},new JPanel[]{ind_1,ind_2,ind_Eventos});
    }//GEN-LAST:event_botonPorDefinir3MousePressed

    private void botonIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMousePressed
        setColor(botonIniciarSesion, ind_LogIn);
    }//GEN-LAST:event_botonIniciarSesionMousePressed

    private void botonIniciarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseReleased
        resetColor(botonIniciarSesion, ind_LogIn);
    }//GEN-LAST:event_botonIniciarSesionMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    
    private void setColor(JPanel pane, JPanel indicador){
        pane.setBackground(new Color(6,45,50));
        indicador.setOpaque(true);
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicadores){
        for (JPanel panel : pane) {
            panel.setBackground(new Color(2,27,34));
        }
        
        for (JPanel indicador : indicadores) {
            indicador.setOpaque(false);
        }
    }
    
    private void resetColor(JPanel pane, JPanel indicadores){
            pane.setBackground(new Color(2,27,34));
            indicadores.setOpaque(false);
    }
    
    private void mostrarPanel(JPanel panel){
        panel.setVisible(true);
    }
    
    private void ocultarPanel(JPanel panel){
        panel.setVisible(false);
    }
    
    private void ocultarPanel(JPanel [] paneles){
        for(JPanel panel : paneles)
        {
            panel.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonEventos;
    private javax.swing.JPanel botonIniciarSesion;
    private javax.swing.JPanel botonPorDefinir;
    private javax.swing.JPanel botonPorDefinir2;
    private javax.swing.JPanel botonPorDefinir3;
    private javax.swing.JPanel contenedorEventos;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_Eventos;
    private javax.swing.JPanel ind_LogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel opcioneszquierda;
    // End of variables declaration//GEN-END:variables
}
