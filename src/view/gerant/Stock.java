
package view.gerant;

import view.Message;

public class Stock extends javax.swing.JFrame {
int clique=0;
    public Stock() 
    {
        setUndecorated(true);
        initComponents();
       
        setBounds(100, 100, 880, 520);
        table.setModel(modele.Produit.afficher());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        boutonCommande = new javax.swing.JButton();
        boutonStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 522));
        getContentPane().setLayout(null);

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        table.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Nom Produit", "Unite", "Quantite", "Quantite Min"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(62, 40, 740, 270);

        boutonCommande.setBackground(new java.awt.Color(255, 204, 102));
        boutonCommande.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonCommande.setText("Affecter une commande");
        boutonCommande.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonCommandeActionPerformed(evt);
            }
        });
        jPanel2.add(boutonCommande);
        boutonCommande.setBounds(60, 370, 740, 40);

        boutonStock.setBackground(new java.awt.Color(255, 204, 102));
        boutonStock.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonStock.setText("Stock en repture ");
        boutonStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonStockActionPerformed(evt);
            }
        });
        jPanel2.add(boutonStock);
        boutonStock.setBounds(60, 320, 740, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 880, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boutonCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonCommandeActionPerformed
     if(table.getSelectedRow()!=-1)
     {
         String nomP =(String)table.getValueAt(table.getSelectedRow(),1);
          int numP =(Integer)table.getValueAt(table.getSelectedRow(),0);
         new Fournisseur( nomP,numP ).setVisible(true);

     }
     else
     {
     new Message("Error", "Selectionnez un produit !");
     }
    }//GEN-LAST:event_boutonCommandeActionPerformed

    private void boutonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonStockActionPerformed
        if(clique==0)
        {
        table.setModel(modele.Produit.afficherMin());
        clique=1;
        boutonStock.setText("Stock");
        }
        else
        {
        table.setModel(modele.Produit.afficher());
        clique=0;
        boutonStock.setText("Stock en repture"); 
        } 
        
    }//GEN-LAST:event_boutonStockActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonCommande;
    private javax.swing.JButton boutonStock;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
