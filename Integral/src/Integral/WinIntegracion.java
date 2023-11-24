
package Integral;

public class WinIntegracion extends javax.swing.JFrame {

   
    public WinIntegracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        btntranparente();
    }
    
    public void btntranparente(){
        btnsalir.setOpaque(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    
    public int grado;
    double Resultado1,Resultado2,Resultado3,Resultado4;
    public ClsPolinomio q;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPolinomio = new javax.swing.JTextField();
        BtnGrado = new javax.swing.JButton();
        BtnCoeficiente = new javax.swing.JButton();
        TxtCoeficiente = new javax.swing.JTextField();
        TxtInf = new javax.swing.JTextField();
        BtnIzquierdo = new javax.swing.JButton();
        TxtPartes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtSup = new javax.swing.JTextField();
        BtnSimpson = new javax.swing.JButton();
        TxtTrapecio = new javax.swing.JTextField();
        BtnDerecho = new javax.swing.JButton();
        TxtIzquierdo = new javax.swing.JTextField();
        BtnTrapecio = new javax.swing.JButton();
        TxtDerecho = new javax.swing.JTextField();
        TxtSimpson = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        lblgrado = new javax.swing.JLabel();
        lblx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCmbGrado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtPolinomio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtPolinomio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 290, -1));

        BtnGrado.setBackground(new java.awt.Color(0, 102, 102));
        BtnGrado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BtnGrado.setForeground(new java.awt.Color(255, 255, 255));
        BtnGrado.setText("Grado");
        BtnGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGradoMouseClicked(evt);
            }
        });
        BtnGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGradoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        BtnCoeficiente.setBackground(new java.awt.Color(0, 102, 102));
        BtnCoeficiente.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BtnCoeficiente.setForeground(new java.awt.Color(255, 255, 255));
        BtnCoeficiente.setText("Coeficiente");
        BtnCoeficiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCoeficienteMouseClicked(evt);
            }
        });
        BtnCoeficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoeficienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCoeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 30));

        TxtCoeficiente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtCoeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 48, -1));

        TxtInf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 27, -1));

        BtnIzquierdo.setBackground(new java.awt.Color(0, 102, 102));
        BtnIzquierdo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BtnIzquierdo.setForeground(new java.awt.Color(255, 255, 255));
        BtnIzquierdo.setText("Izquierdo");
        BtnIzquierdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIzquierdoMouseClicked(evt);
            }
        });
        BtnIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIzquierdoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 90, -1));

        TxtPartes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 40, -1));

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setText("Particiones=");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        TxtSup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 27, -1));

        BtnSimpson.setBackground(new java.awt.Color(0, 102, 102));
        BtnSimpson.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BtnSimpson.setForeground(new java.awt.Color(255, 255, 255));
        BtnSimpson.setText("Simpson");
        BtnSimpson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSimpsonMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSimpson, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        TxtTrapecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTrapecioActionPerformed(evt);
            }
        });
        getContentPane().add(TxtTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 110, -1));

        BtnDerecho.setBackground(new java.awt.Color(0, 102, 102));
        BtnDerecho.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BtnDerecho.setForeground(new java.awt.Color(255, 255, 255));
        BtnDerecho.setText("Derecho");
        BtnDerecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDerechoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 90, -1));

        TxtIzquierdo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(TxtIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 110, -1));

        BtnTrapecio.setBackground(new java.awt.Color(0, 102, 102));
        BtnTrapecio.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BtnTrapecio.setForeground(new java.awt.Color(255, 255, 255));
        BtnTrapecio.setText("Trapecio");
        BtnTrapecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTrapecioMouseClicked(evt);
            }
        });
        getContentPane().add(BtnTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        TxtDerecho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDerechoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 110, -1));

        TxtSimpson.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtSimpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSimpsonActionPerformed(evt);
            }
        });
        getContentPane().add(TxtSimpson, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 110, -1));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 40));

        btnnuevo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-archivo.png"))); // NOI18N
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 80, 50));

        lblgrado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(lblgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 30, 20));

        lblx.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblx.setText("X");
        getContentPane().add(lblx, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 20, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/in.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/udenar-modified.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 180));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Metodo del Rectángulo por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, 30));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INTEGRACION POR LOS METODOS: RECTÁNGULO, TRAPECIO Y SIMPSON ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 580, 70));

        jCmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));
        getContentPane().add(jCmbGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel5.setText("dx");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel8.setText("Dar click en cada uno de los metodos para  conocer el resultado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 330, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo blanco.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGradoMouseClicked
        // TODO add your handling code here:
        grado=Integer.parseInt(jCmbGrado.getSelectedItem().toString());
        q=new ClsPolinomio(grado+1);
        jCmbGrado.setSelectedItem(null);
        lblgrado.setText(" " + grado);
    }//GEN-LAST:event_BtnGradoMouseClicked

    private void BtnCoeficienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCoeficienteMouseClicked
        // TODO add your handling code here:
        if(grado>0)
        {
            q.a(grado, Float.parseFloat(TxtCoeficiente.getText()));
            TxtCoeficiente.setText(null);
            grado-=1;
            lblgrado.setText(""+grado+"");
            TxtCoeficiente.requestFocus();

        }
        else

        {
            q.a(grado, Float.parseFloat(TxtCoeficiente.getText()));
            TxtPolinomio.setText(q.ver());
        }
    }//GEN-LAST:event_BtnCoeficienteMouseClicked

    private void BtnIzquierdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIzquierdoMouseClicked
        // TODO add your handling code here:
        Resultado1=q.izquierdo(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtIzquierdo.setText(Double.toString(Resultado1));
    }//GEN-LAST:event_BtnIzquierdoMouseClicked

    private void BtnSimpsonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSimpsonMouseClicked
        // TODO add your handling code here:
        Resultado2=q.simpson(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtSimpson.setText(Double.toString(Resultado2));
    }//GEN-LAST:event_BtnSimpsonMouseClicked

    private void BtnDerechoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDerechoMouseClicked
        // TODO add your handling code here:
        Resultado3=q.derecho(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtDerecho.setText(Double.toString(Resultado3));
    }//GEN-LAST:event_BtnDerechoMouseClicked

    private void BtnTrapecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTrapecioMouseClicked
        // TODO add your handling code here:
        Resultado4=q.trapecio(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtTrapecio.setText(Double.toString(Resultado4));
    }//GEN-LAST:event_BtnTrapecioMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void BtnCoeficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoeficienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCoeficienteActionPerformed

    private void BtnGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGradoActionPerformed

    private void BtnIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIzquierdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIzquierdoActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        WinIntegracion nuevo=new WinIntegracion();
        nuevo.setVisible(true);
        dispose();//cierra la ventana anterior
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void TxtSimpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSimpsonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSimpsonActionPerformed

    private void TxtDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDerechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDerechoActionPerformed

    private void TxtTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTrapecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTrapecioActionPerformed

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
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinIntegracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCoeficiente;
    private javax.swing.JButton BtnDerecho;
    private javax.swing.JButton BtnGrado;
    private javax.swing.JButton BtnIzquierdo;
    private javax.swing.JButton BtnSimpson;
    private javax.swing.JButton BtnTrapecio;
    private javax.swing.JTextField TxtCoeficiente;
    private javax.swing.JTextField TxtDerecho;
    private javax.swing.JTextField TxtInf;
    private javax.swing.JTextField TxtIzquierdo;
    private javax.swing.JTextField TxtPartes;
    private javax.swing.JTextField TxtPolinomio;
    private javax.swing.JTextField TxtSimpson;
    private javax.swing.JTextField TxtSup;
    private javax.swing.JTextField TxtTrapecio;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> jCmbGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblgrado;
    private javax.swing.JLabel lblx;
    // End of variables declaration//GEN-END:variables
}
