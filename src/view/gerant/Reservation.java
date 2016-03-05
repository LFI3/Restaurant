
package view.gerant;

public class Reservation extends javax.swing.JFrame {

    public Reservation() 
    {
        setUndecorated(true);
        initComponents();
       
        setBounds(100, 100, 880, 520);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajouter1 = new view.receptioniste.Ajouter();
        rechercher1 = new view.receptioniste.Rechercher();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(880, 522));
        setMinimumSize(new java.awt.Dimension(880, 522));
        setPreferredSize(new java.awt.Dimension(880, 522));
        getContentPane().setLayout(null);
        getContentPane().add(ajouter1);
        ajouter1.setBounds(0, 40, 410, 480);
        getContentPane().add(rechercher1);
        rechercher1.setBounds(410, 40, 470, 480);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(840, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.receptioniste.Ajouter ajouter1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private view.receptioniste.Rechercher rechercher1;
    // End of variables declaration//GEN-END:variables
}
