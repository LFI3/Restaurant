/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gerant;

import javax.swing.DefaultComboBoxModel;
import view.Message;

public class Fournisseur extends javax.swing.JFrame {

     public String nomP;
    public int numP;
    public Fournisseur(String nomP, int numP)
    {
        this.nomP=nomP;
        this.numP=numP;
        setUndecorated(true);
        initComponents();
        nomProduit.setText(nomP);
     
        fournisseur.setModel(new DefaultComboBoxModel(modele.Fournisseur.listeFournisseur(numP)));
       
        setBounds(200, 200, 480, 460);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fermer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fournisseur = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        nomProduit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prix = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cin = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        quantite = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        fermer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });
        jPanel1.add(fermer);
        fermer.setBounds(440, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        fournisseur.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        fournisseur.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fournisseurActionPerformed(evt);
            }
        });
        jPanel2.add(fournisseur);
        fournisseur.setBounds(240, 30, 220, 50);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setText(" Quantite");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 352, 130, 50);

        nomProduit.setBackground(new java.awt.Color(102, 102, 0));
        nomProduit.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        nomProduit.setForeground(new java.awt.Color(255, 255, 255));
        nomProduit.setText(" ");
        nomProduit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nomProduit.setOpaque(true);
        jPanel2.add(nomProduit);
        nomProduit.setBounds(20, 30, 200, 50);

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setText(" Nom");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 140, 120, 30);

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setText(" Prenom");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 180, 120, 30);

        Tel.setBackground(new java.awt.Color(255, 153, 0));
        Tel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        Tel.setText(" Tel");
        Tel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Tel.setOpaque(true);
        jPanel2.add(Tel);
        Tel.setBounds(20, 220, 120, 30);

        jLabel5.setBackground(new java.awt.Color(255, 153, 0));
        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel5.setText(" Email");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 260, 120, 30);

        prix.setBackground(new java.awt.Color(255, 204, 0));
        prix.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        prix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        prix.setOpaque(true);
        jPanel2.add(prix);
        prix.setBounds(150, 300, 310, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Confirmer");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 350, 150, 50);

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel7.setText(" Cin");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 100, 120, 30);

        cin.setBackground(new java.awt.Color(255, 204, 0));
        cin.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        cin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cin.setOpaque(true);
        jPanel2.add(cin);
        cin.setBounds(150, 100, 310, 30);

        nom.setBackground(new java.awt.Color(255, 204, 0));
        nom.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        nom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nom.setOpaque(true);
        jPanel2.add(nom);
        nom.setBounds(150, 140, 310, 30);

        prenom.setBackground(new java.awt.Color(255, 204, 0));
        prenom.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        prenom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        prenom.setOpaque(true);
        jPanel2.add(prenom);
        prenom.setBounds(150, 180, 310, 30);

        tel.setBackground(new java.awt.Color(255, 204, 0));
        tel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        tel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tel.setOpaque(true);
        jPanel2.add(tel);
        tel.setBounds(150, 220, 310, 30);

        email.setBackground(new java.awt.Color(255, 204, 0));
        email.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        email.setOpaque(true);
        jPanel2.add(email);
        email.setBounds(150, 260, 310, 30);

        quantite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quantite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantite.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantiteActionPerformed(evt);
            }
        });
        jPanel2.add(quantite);
        quantite.setBounds(160, 350, 130, 50);

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel13.setText(" Prix");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 300, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 480, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_fermerActionPerformed

    private void quantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantiteActionPerformed

    private void fournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fournisseurActionPerformed
       String cin1=(String)fournisseur.getSelectedItem();
       String[] tab=modele.Fournisseur.informationFournisseur(cin1,numP);
       cin.setText(tab[0]);
       nom.setText(tab[1]);
       prenom.setText(tab[2]);
       tel.setText(tab[3]);
       email.setText(tab[4]);
       prix.setText(tab[5]);
       
    }//GEN-LAST:event_fournisseurActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(controler.Verif.verifEntier(quantite.getText())&& !quantite.getText().equals(""))
        {
          modele.Produit.ajouterQuantite( numP, Integer.parseInt(quantite.getText()));
            setVisible(false);
        }
        else
        {
        
        new Message("Error", "Format Incorrecte!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tel;
    private javax.swing.JLabel cin;
    private javax.swing.JLabel email;
    private javax.swing.JButton fermer;
    private javax.swing.JComboBox fournisseur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nomProduit;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel prix;
    private javax.swing.JTextField quantite;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
