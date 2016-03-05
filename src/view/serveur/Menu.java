
package view.serveur;

import view.Message;

public class Menu extends javax.swing.JFrame {

     public int numTable;
     public int numCommande;
    public boolean premier=true;
    public Menu(int numTable) {
        this.numTable=numTable;
         setUndecorated(true);
         initComponents();
         setBounds(100, 100, 630, 550);
         table.setModel(modele.Menu.afficher());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutonStock = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        boutonEnregistrerCommande = new javax.swing.JButton();
        quantite = new javax.swing.JTextField();
        boutonAjouter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentaire = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        boutonStock.setBackground(new java.awt.Color(255, 204, 102));
        boutonStock.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonStock.setText("Stock en repture ");
        boutonStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonStockActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(153, 102, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setLayout(null);

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        table.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Type", "Nom", "Prix"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAlignmentX(2.0F);
        table.setAlignmentY(2.0F);
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(30);
        table.setRowMargin(2);
        table.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(50, 10, 530, 270);

        boutonEnregistrerCommande.setBackground(new java.awt.Color(255, 204, 102));
        boutonEnregistrerCommande.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonEnregistrerCommande.setText("Enregistrer Commande");
        boutonEnregistrerCommande.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonEnregistrerCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEnregistrerCommandeActionPerformed(evt);
            }
        });
        jPanel5.add(boutonEnregistrerCommande);
        boutonEnregistrerCommande.setBounds(50, 410, 530, 40);

        quantite.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        quantite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantite.setText("1");
        quantite.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.add(quantite);
        quantite.setBounds(330, 360, 250, 40);

        boutonAjouter.setBackground(new java.awt.Color(255, 204, 102));
        boutonAjouter.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonAjouter.setText("Ajouter");
        boutonAjouter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });
        jPanel5.add(boutonAjouter);
        boutonAjouter.setBounds(50, 360, 260, 40);

        commentaire.setColumns(20);
        commentaire.setRows(5);
        commentaire.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane2.setViewportView(commentaire);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(330, 290, 250, 60);

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Commentaire");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);
        jPanel5.add(jLabel2);
        jLabel2.setBounds(50, 290, 260, 60);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 70, 630, 460);

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(570, 10, 40, 40);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jPanel6.add(jLabel1);
        jLabel1.setBounds(140, 10, 330, 50);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 630, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonStockActionPerformed
        
    }//GEN-LAST:event_boutonStockActionPerformed

    private void boutonEnregistrerCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEnregistrerCommandeActionPerformed
        modele.Commande.modifier(numCommande,commentaire.getText());
        setVisible(false);
     
    }//GEN-LAST:event_boutonEnregistrerCommandeActionPerformed

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterActionPerformed
         if(table.getSelectedRow()!=-1 && !quantite.getText().equals("") && controler.Verif.verifEntier(quantite.getText()))
         {
            if(premier)
            {
             modele.Commande.ajouter("", numTable);
             numCommande= modele.Commande.donnerNumCommande( numTable);
             modele.DetailCommande.ajouter(numCommande, (Integer)table.getValueAt(table.getSelectedRow(), 0), Integer.parseInt(quantite.getText()));
             premier=false;
            }
            else
            {
               modele.DetailCommande.ajouter(numCommande, (Integer)table.getValueAt(table.getSelectedRow(), 0), Integer.parseInt(quantite.getText()));
            }
           
         }
         else
         {  new Message("Error", "Probleme de selection/quantite incorrecte");
            
         }
    }//GEN-LAST:event_boutonAjouterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAjouter;
    private javax.swing.JButton boutonEnregistrerCommande;
    private javax.swing.JButton boutonStock;
    private javax.swing.JTextArea commentaire;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quantite;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
