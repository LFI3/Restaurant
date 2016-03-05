
package view.receptioniste;

public class AjouterClient extends javax.swing.JFrame 
{

    public AjouterClient() 
    {
        setUndecorated(true);
        initComponents();
        setBounds(250, 250, 490, 340);
        setVisible(true);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boutonFermer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boutonEnregistrer = new javax.swing.JButton();
        tel = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel1.setText(" Tel");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 220, 230, 40);

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel3.setText(" Nom");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 230, 40);

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel4.setText(" Prenom");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 170, 230, 40);

        boutonFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        boutonFermer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonFermerActionPerformed(evt);
            }
        });
        jPanel1.add(boutonFermer);
        boutonFermer.setBounds(440, 10, 40, 40);

        jLabel5.setBackground(new java.awt.Color(204, 102, 0));
        jLabel5.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Ajouter Client");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 10, 430, 40);

        jLabel6.setBackground(new java.awt.Color(255, 153, 0));
        jLabel6.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel6.setText(" Cin");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 70, 230, 40);

        boutonEnregistrer.setBackground(new java.awt.Color(204, 153, 0));
        boutonEnregistrer.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonEnregistrer.setText("Enregistrer");
        boutonEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEnregistrerActionPerformed(evt);
            }
        });
        jPanel1.add(boutonEnregistrer);
        boutonEnregistrer.setBounds(160, 280, 170, 40);

        tel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(tel);
        tel.setBounds(260, 220, 210, 40);

        cin.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        cin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(cin);
        cin.setBounds(260, 70, 210, 40);

        nom.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(nom);
        nom.setBounds(260, 120, 210, 40);

        prenom.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        prenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prenom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(prenom);
        prenom.setBounds(260, 170, 210, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonFermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_boutonFermerActionPerformed

    private void boutonEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEnregistrerActionPerformed
        String cin1=cin.getText();
        String nom1=nom.getText();
        String prenom1=prenom.getText();
        int tel1=Integer.parseInt(tel.getText());
        
        modele.Client.ajouter(cin1, nom1, prenom1, tel1);
        setVisible(false);
        
        
    }//GEN-LAST:event_boutonEnregistrerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonEnregistrer;
    private javax.swing.JButton boutonFermer;
    private javax.swing.JTextField cin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
