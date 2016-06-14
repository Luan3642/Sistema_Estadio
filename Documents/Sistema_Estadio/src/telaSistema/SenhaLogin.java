package telaSistema;


import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class SenhaLogin extends javax.swing.JFrame {

     telaInicial chama = new telaInicial();
    
    public SenhaLogin() {
        initComponents();
        setSize(440, 350);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        LOGIN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        SHOW = new javax.swing.JRadioButton();
        SEND = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jDesktopPane1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PASSWORD");

        SHOW.setForeground(new java.awt.Color(51, 51, 51));
        SHOW.setText("SHOW PASSWORD");
        SHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWActionPerformed(evt);
            }
        });

        SEND.setForeground(new java.awt.Color(51, 51, 51));
        SEND.setText("SEND");
        SEND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SENDMouseClicked(evt);
            }
        });
        SEND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SENDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(SHOW)
                        .addGap(39, 39, 39)
                        .addComponent(SEND, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SHOW))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(LOGIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PASSWORD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SHOW, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SEND, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 440, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWActionPerformed
        
        if(SHOW.isSelected()== true){
            PASSWORD.setEchoChar((char)0);
        }else{
            PASSWORD.setEchoChar(('*'));
        }
        
    }//GEN-LAST:event_SHOWActionPerformed

    private void SENDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENDMouseClicked
        metodoEntrar();
    }//GEN-LAST:event_SENDMouseClicked

    private void SENDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SENDKeyTyped
        metodoEntrar();
    }//GEN-LAST:event_SENDKeyTyped

  
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
            java.util.logging.Logger.getLogger(SenhaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenhaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenhaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenhaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SenhaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LOGIN;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JButton SEND;
    private javax.swing.JRadioButton SHOW;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void metodoEntrar() {
        
        if("israel123".equalsIgnoreCase(PASSWORD.getText())&&"israel".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
        else if("osvaldo123".equalsIgnoreCase(PASSWORD.getText())&&"osvaldo".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
        else if("caetano123".equalsIgnoreCase(PASSWORD.getText())&&"caetano".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
            
        }
        else if("christian123".equalsIgnoreCase(PASSWORD.getText())&&"christian".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
            
        }
        else if ("luan3642".equalsIgnoreCase(PASSWORD.getText())&&"luan".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
        else if("leandro123".equalsIgnoreCase(PASSWORD.getText())&&"leandro".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
        
    }
    
}
