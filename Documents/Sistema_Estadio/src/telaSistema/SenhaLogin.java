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
        SEND = new javax.swing.JButton();
        SEND1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jDesktopPane1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Login: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha:");

        SEND.setForeground(new java.awt.Color(51, 51, 51));
        SEND.setText("Entrar");
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

        SEND1.setForeground(new java.awt.Color(51, 51, 51));
        SEND1.setText("Sair");
        SEND1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEND1MouseClicked(evt);
            }
        });
        SEND1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEND1ActionPerformed(evt);
            }
        });
        SEND1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEND1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Sistema estádio");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(SEND, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(SEND1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(PASSWORD))
                .addGap(56, 56, 56)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEND1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(LOGIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PASSWORD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SEND, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SEND1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 440, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SENDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENDMouseClicked
        metodoEntrar();
    }//GEN-LAST:event_SENDMouseClicked

    private void SENDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SENDKeyTyped
        metodoEntrar();
    }//GEN-LAST:event_SENDKeyTyped

    private void SEND1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEND1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SEND1MouseClicked

    private void SEND1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEND1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_SEND1KeyTyped

    private void SEND1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEND1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SEND1ActionPerformed

  
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
    private javax.swing.JButton SEND1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
