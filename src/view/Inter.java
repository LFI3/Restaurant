package view;




public class Inter extends javax.swing.JFrame {

 
    public Inter() 
    {
        initComponents();
       
   
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan1 = new javax.swing.JPanel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 1000, 600));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pan1.setBackground(new java.awt.Color(255, 204, 51));
        pan1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pan1.setLayout(null);

        lab1.setBackground(new java.awt.Color(255, 255, 255));
        lab1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        lab1.setForeground(new java.awt.Color(255, 102, 0));
        lab1.setText("Bienvenu cher ");
        lab1.setOpaque(true);
        pan1.add(lab1);
        lab1.setBounds(150, 100, 750, 50);

        lab2.setBackground(new java.awt.Color(255, 255, 255));
        lab2.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        lab2.setForeground(new java.awt.Color(255, 102, 0));
        lab2.setText("Bienvenu cher ");
        lab2.setOpaque(true);
        pan1.add(lab2);
        lab2.setBounds(150, 100, 750, 50);

        jLabel12.setBackground(new java.awt.Color(255, 204, 51));
        jLabel12.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Resto tunisien");
        jLabel12.setOpaque(true);
        pan1.add(jLabel12);
        jLabel12.setBounds(20, 20, 390, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connecter.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pan1.add(jButton1);
        jButton1.setBounds(790, 10, 30, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pan1.add(jButton2);
        jButton2.setBounds(950, 10, 40, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" Deconnexion");
        pan1.add(jLabel1);
        jLabel1.setBounds(830, 10, 110, 30);

        getContentPane().add(pan1);
        pan1.setBounds(0, 0, 1000, 100);

        lab.setBackground(new java.awt.Color(255, 102, 0));
        lab.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab.setText("Bienvenu cher ");
        lab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lab.setOpaque(true);
        getContentPane().add(lab);
        lab.setBounds(0, 100, 1000, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new LoginPassword().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel lab;
    public javax.swing.JLabel lab1;
    public javax.swing.JLabel lab2;
    public javax.swing.JPanel pan1;
    // End of variables declaration//GEN-END:variables
}
