package telaSistema;


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

        jPanel1 = new javax.swing.JPanel();
        SHOW = new javax.swing.JRadioButton();
        SEND = new javax.swing.JButton();
        LOGIN = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);

        SHOW.setForeground(new java.awt.Color(51, 51, 51));
        SHOW.setText("MOSTRAR SENHA");

        SEND.setForeground(new java.awt.Color(153, 153, 153));
        SEND.setText("ENTRAR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SENHA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PASSWORD)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LOGIN)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SHOW, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SEND)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEND)
                    .addComponent(SHOW))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 310, 270);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(2, 0, 240, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  
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
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JButton SEND;
    private javax.swing.JRadioButton SHOW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void metodoEntrar() {
        
        if ("luan3642".equalsIgnoreCase(PASSWORD.getText()) && "luan".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
        
        if("israel123".equalsIgnoreCase(PASSWORD.getText())&&"israel".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
         if("osvaldo123".equalsIgnoreCase(PASSWORD.getText())&&"osvaldo".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
         if("caetano123".equalsIgnoreCase(PASSWORD.getText())&&"caetano".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        
        }
         if("leandro123".equalsIgnoreCase(PASSWORD.getText())&&"leandro".equalsIgnoreCase(LOGIN.getText())){
            chama.setVisible(true);
            this.setVisible(false);
        }
         
    }
    
}
