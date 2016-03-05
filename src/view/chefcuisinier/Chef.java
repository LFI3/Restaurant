package view.chefcuisinier;

import view.*;




public class Chef extends javax.swing.JFrame {

 
    public Chef() 
    {
        setUndecorated(true);
        initComponents();
        table1.setModel(modele.Commande.afficher1());
        setBounds(100, 100, 1000, 600);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        bouton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        bouton1 = new javax.swing.JButton();
        bouton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 1000, 600));
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
        lab.setText("Bienvenu cher Chef Cuisinier");
        lab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lab.setOpaque(true);
        getContentPane().add(lab);
        lab.setBounds(0, 100, 1000, 50);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        table2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        table2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nom ", "Quantite"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setAlignmentX(2.0F);
        table2.setAlignmentY(2.0F);
        table2.setGridColor(new java.awt.Color(0, 0, 0));
        table2.setRowHeight(30);
        table2.setRowMargin(2);
        table2.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setResizable(false);
        }
        table2.setVisible(false);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 10, 460, 270);

        bouton2.setBackground(new java.awt.Color(255, 204, 102));
        bouton2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        bouton2.setText("Preparer");
        bouton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton2ActionPerformed(evt);
            }
        });
        jPanel1.add(bouton2);
        bouton2.setBounds(490, 290, 460, 40);
        bouton2.setVisible(false);

        table1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        table1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero", "Commentaire"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setAlignmentX(2.0F);
        table1.setAlignmentY(2.0F);
        table1.setGridColor(new java.awt.Color(0, 0, 0));
        table1.setRowHeight(30);
        table1.setRowMargin(2);
        table1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 460, 270);

        bouton1.setBackground(new java.awt.Color(255, 204, 102));
        bouton1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        bouton1.setText("Actualiser");
        bouton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton1ActionPerformed(evt);
            }
        });
        jPanel1.add(bouton1);
        bouton1.setBounds(10, 350, 460, 40);

        bouton3.setBackground(new java.awt.Color(255, 204, 102));
        bouton3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        bouton3.setText("Voir detail");
        bouton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton3ActionPerformed(evt);
            }
        });
        jPanel1.add(bouton3);
        bouton3.setBounds(10, 290, 460, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 150, 1000, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new LoginPassword().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton2ActionPerformed
        table2.setVisible(false);
        bouton2.setVisible(false);   
        modele.Commande.modifier((Integer)table1.getValueAt(table1.getSelectedRow(), 0));
         table1.setModel(modele.Commande.afficher1());
    }//GEN-LAST:event_bouton2ActionPerformed

    private void bouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton1ActionPerformed
       table1.setModel(modele.Commande.afficher1());
    }//GEN-LAST:event_bouton1ActionPerformed

    private void bouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton3ActionPerformed
        
        if(table1.getSelectedRow()!=-1)
        {
        table2.setVisible(true);
        bouton2.setVisible(true);
        table2.setModel(modele.DetailCommande.afficher1((Integer)table1.getValueAt(table1.getSelectedRow(), 0)));
        
        
        
        
        }
    }//GEN-LAST:event_bouton3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton1;
    private javax.swing.JButton bouton2;
    private javax.swing.JButton bouton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lab;
    public javax.swing.JLabel lab1;
    public javax.swing.JLabel lab2;
    public javax.swing.JPanel pan1;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
