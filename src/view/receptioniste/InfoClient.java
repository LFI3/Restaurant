
package view.receptioniste;

public class InfoClient extends javax.swing.JFrame 
{

    public InfoClient(String reservation1 ,String cin1,String nom1,String prenom1,String tel1) 
    {
        setUndecorated(true);
        initComponents();
        setBounds(250, 250, 490, 340);
        reservation.setText(reservation1);
        cin.setText(cin1);
        nom.setText(nom1);
        prenom.setText(prenom1);
        tel.setText(tel1);
        setVisible(true);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cin = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelReseravtion = new javax.swing.JLabel();
        reservation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel1.setText(" Tel");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 280, 230, 40);

        tel.setBackground(new java.awt.Color(255, 255, 255));
        tel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        tel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tel.setOpaque(true);
        jPanel1.add(tel);
        tel.setBounds(250, 280, 230, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel3.setText(" Nom");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 180, 230, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel4.setText(" Prenom");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 230, 230, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 10, 40, 40);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel5.setText(" Cin");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 130, 230, 40);

        cin.setBackground(new java.awt.Color(255, 255, 255));
        cin.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        cin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cin.setOpaque(true);
        jPanel1.add(cin);
        cin.setBounds(250, 130, 230, 40);

        nom.setBackground(new java.awt.Color(255, 255, 255));
        nom.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        nom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nom.setOpaque(true);
        jPanel1.add(nom);
        nom.setBounds(250, 180, 230, 40);

        prenom.setBackground(new java.awt.Color(255, 255, 255));
        prenom.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        prenom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        prenom.setOpaque(true);
        jPanel1.add(prenom);
        prenom.setBounds(250, 230, 230, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enseignant4.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 50);

        labelReseravtion.setBackground(new java.awt.Color(255, 255, 255));
        labelReseravtion.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        labelReseravtion.setText(" Reservation");
        labelReseravtion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        labelReseravtion.setOpaque(true);
        jPanel1.add(labelReseravtion);
        labelReseravtion.setBounds(10, 80, 230, 40);

        reservation.setBackground(new java.awt.Color(255, 255, 255));
        reservation.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        reservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reservation.setOpaque(true);
        jPanel1.add(reservation);
        reservation.setBounds(250, 80, 230, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelReseravtion;
    public javax.swing.JLabel nom;
    public javax.swing.JLabel prenom;
    public javax.swing.JLabel reservation;
    public javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
