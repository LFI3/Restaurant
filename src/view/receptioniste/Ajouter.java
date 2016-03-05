
package view.receptioniste;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JButton;

public class Ajouter extends javax.swing.JPanel {
public String jour="Lundi";
public String heure="08:00";
public int[] disponible;
public int[] reserve;
public int[] occupe;
Vector selectionne=new Vector();
    public Ajouter() {
       
        initComponents();
        chargerListeOccupeDisponibleReservee();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboHeur = new javax.swing.JComboBox();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboJour = new javax.swing.JComboBox();
        boutonChercher = new javax.swing.JButton();
        boutonReserve = new javax.swing.JButton();
        cin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boutonAjouter = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nbPersonne = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 0));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(null);

        comboHeur.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        comboHeur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        comboHeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHeurActionPerformed(evt);
            }
        });
        add(comboHeur);
        comboHeur.setBounds(20, 80, 200, 40);

        b1.setBackground(new java.awt.Color(0, 153, 0));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("1");
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        add(b1);
        b1.setBounds(230, 70, 40, 40);

        b2.setBackground(new java.awt.Color(0, 153, 0));
        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setText("2");
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        add(b2);
        b2.setBounds(270, 70, 40, 40);

        b3.setBackground(new java.awt.Color(0, 153, 0));
        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setText("3");
        b3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        add(b3);
        b3.setBounds(310, 70, 40, 40);

        b4.setBackground(new java.awt.Color(0, 153, 0));
        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setText("4");
        b4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        add(b4);
        b4.setBounds(350, 70, 40, 40);

        b8.setBackground(new java.awt.Color(0, 153, 0));
        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.setText("8");
        b8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        add(b8);
        b8.setBounds(350, 110, 40, 40);

        b12.setBackground(new java.awt.Color(0, 153, 0));
        b12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b12.setText("12");
        b12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        add(b12);
        b12.setBounds(350, 150, 40, 40);

        b16.setBackground(new java.awt.Color(0, 153, 0));
        b16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b16.setText("16");
        b16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        add(b16);
        b16.setBounds(350, 190, 40, 40);

        b15.setBackground(new java.awt.Color(0, 153, 0));
        b15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b15.setText("15");
        b15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        add(b15);
        b15.setBounds(310, 190, 40, 40);

        b11.setBackground(new java.awt.Color(0, 153, 0));
        b11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b11.setText("11");
        b11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        add(b11);
        b11.setBounds(310, 150, 40, 40);

        b7.setBackground(new java.awt.Color(0, 153, 0));
        b7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b7.setText("7");
        b7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        add(b7);
        b7.setBounds(310, 110, 40, 40);

        b6.setBackground(new java.awt.Color(0, 153, 0));
        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.setText("6");
        b6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        add(b6);
        b6.setBounds(270, 110, 40, 40);

        b10.setBackground(new java.awt.Color(0, 153, 0));
        b10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b10.setText("10");
        b10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        add(b10);
        b10.setBounds(270, 150, 40, 40);

        b14.setBackground(new java.awt.Color(0, 153, 0));
        b14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b14.setText("14");
        b14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        add(b14);
        b14.setBounds(270, 190, 40, 40);

        b13.setBackground(new java.awt.Color(0, 153, 0));
        b13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b13.setText("13");
        b13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        add(b13);
        b13.setBounds(230, 190, 40, 40);

        b9.setBackground(new java.awt.Color(0, 153, 0));
        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.setText("9");
        b9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        add(b9);
        b9.setBounds(230, 150, 40, 40);

        b5.setBackground(new java.awt.Color(0, 153, 0));
        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.setText("5");
        b5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        add(b5);
        b5.setBounds(230, 110, 40, 40);

        jPanel2.setBackground(java.awt.Color.green);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel2);
        jPanel2.setBounds(260, 340, 30, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText(" Disponible");
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(290, 340, 90, 30);

        jPanel1.setBackground(java.awt.Color.orange);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(260, 370, 30, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setText("  Reserve");
        jLabel1.setOpaque(true);
        add(jLabel1);
        jLabel1.setBounds(290, 370, 90, 30);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel3);
        jPanel3.setBounds(260, 400, 30, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText(" Occupe");
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(290, 400, 90, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel4.setText("  Liste des tables");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(230, 20, 160, 40);

        comboJour.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        comboJour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" }));
        comboJour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJourActionPerformed(evt);
            }
        });
        add(comboJour);
        comboJour.setBounds(20, 30, 200, 40);

        boutonChercher.setBackground(new java.awt.Color(255, 204, 102));
        boutonChercher.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonChercher.setText("Chercher");
        boutonChercher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonChercherActionPerformed(evt);
            }
        });
        add(boutonChercher);
        boutonChercher.setBounds(20, 130, 200, 40);

        boutonReserve.setBackground(new java.awt.Color(255, 204, 102));
        boutonReserve.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonReserve.setText("Reserve");
        boutonReserve.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonReserveActionPerformed(evt);
            }
        });
        add(boutonReserve);
        boutonReserve.setBounds(20, 340, 200, 40);

        cin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(cin);
        cin.setBounds(230, 240, 160, 40);

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText(" CIN");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel7.setOpaque(true);
        add(jLabel7);
        jLabel7.setBounds(20, 240, 200, 40);

        boutonAjouter.setBackground(new java.awt.Color(255, 204, 102));
        boutonAjouter.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        boutonAjouter.setText("Enregistrer client");
        boutonAjouter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });
        add(boutonAjouter);
        boutonAjouter.setBounds(20, 390, 200, 40);

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Nombre de Personne");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        add(jLabel8);
        jLabel8.setBounds(20, 290, 200, 40);

        nbPersonne.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nbPersonne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbPersonne.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(nbPersonne);
        nbPersonne.setBounds(230, 290, 160, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       cliquerSurBouton( b8, 8) ;
    }//GEN-LAST:event_b8ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
     cliquerSurBouton( b13, 13) ;
    }//GEN-LAST:event_b13ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
      cliquerSurBouton( b6, 6) ;
    }//GEN-LAST:event_b6ActionPerformed

    private void comboHeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHeurActionPerformed
     heure=(String)comboHeur.getSelectedItem();        
    }//GEN-LAST:event_comboHeurActionPerformed

    private void comboJourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJourActionPerformed
      jour=(String)comboJour.getSelectedItem();
    }//GEN-LAST:event_comboJourActionPerformed

    private void boutonChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonChercherActionPerformed
  chargerListeOccupeDisponibleReservee();
    }//GEN-LAST:event_boutonChercherActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      cliquerSurBouton( b1, 1) ;     
    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       cliquerSurBouton( b5, 5) ; 
    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       cliquerSurBouton( b2, 2) ;
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        cliquerSurBouton( b3, 3) ;
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
     cliquerSurBouton( b4, 4) ;
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     cliquerSurBouton( b7, 7) ;
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
      cliquerSurBouton( b9, 9) ;
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
            cliquerSurBouton( b10, 10) ;       
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
       cliquerSurBouton( b11, 11) ;
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
      cliquerSurBouton( b12, 12) ;
    }//GEN-LAST:event_b12ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        cliquerSurBouton( b14, 14) ;
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
       cliquerSurBouton( b15, 15) ;
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
       cliquerSurBouton( b16, 16) ;
    }//GEN-LAST:event_b16ActionPerformed

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterActionPerformed
      new AjouterClient();
    }//GEN-LAST:event_boutonAjouterActionPerformed

    private void boutonReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonReserveActionPerformed
   
    if(selectionne.isEmpty())  
    {
      new view.Message("Erreur", "Pas de Selection");
    }
    else if(!controler.Verif.verifCinTel(cin.getText()))  
    {
      new view.Message("Erreur", "Cin Incorrecte");
    }
    else if(!controler.Verif.verifEntier(nbPersonne.getText())||!controler.Verif.estPlein(new String[]{nbPersonne.getText()}))  
    {
      new view.Message("Erreur", "Nombre de Personne Incorrecte");
    }
    else if(!modele.Client.estClient(cin.getText()))  
    {
      new view.Message("Erreur", "Cin Introuvable");
    }
    else
    {
     modele.Reservation.ajouter(jour, heure, Integer.parseInt(nbPersonne.getText()), selectionne.size(), cin.getText());
     modele.TableClient.ajouter( modele.Reservation.dernierReservation(), selectionne);
     new view.Message("Client", "Reservation Ajoute");
     nbPersonne.setText("");
     cin.setText("");
     chargerListeOccupeDisponibleReservee();
     selectionne.clear();
    }
    }//GEN-LAST:event_boutonReserveActionPerformed

    public void chargerListeOccupeDisponibleReservee()
    {
     disponible=modele.Table.TableDisponible(jour, heure);
     reserve=modele.Table.TableReserve(jour, heure);
 
     for(int i=0;i<disponible.length;i++)
     {
     switch(disponible[i])
     {
         case 1:b1.setBackground(Color.green);break;
             case 2:b2.setBackground(Color.green);break;
                 case 3:b3.setBackground(Color.green);break;
                     case 4:b4.setBackground(Color.green);break;
                         case 5:b5.setBackground(Color.green);break;
                             case 6:b6.setBackground(Color.green);break;
                                 case 7:b7.setBackground(Color.green);break;
                                     case 8:b8.setBackground(Color.green);break;
                                         case 9:b9.setBackground(Color.green);break;
                                             case 10:b10.setBackground(Color.green);break;
                                                 case 11:b11.setBackground(Color.green);break;
                                                     case 12:b12.setBackground(Color.green);break;
                                                         case 13:b13.setBackground(Color.green);break;
                                                             case 14:b14.setBackground(Color.green);break;
                                                                 case 15:b15.setBackground(Color.green);break;
                                                                     case 16:b16.setBackground(Color.green);break;
     }
     }
     for(int i=0;i<reserve.length;i++)
     {
     switch(reserve[i])
     {
         case 1:b1.setBackground(Color.orange);break;
             case 2:b2.setBackground(Color.orange);break;
                 case 3:b3.setBackground(Color.orange);break;
                     case 4:b4.setBackground(Color.orange);break;
                         case 5:b5.setBackground(Color.orange);break;
                             case 6:b6.setBackground(Color.orange);break;
                                 case 7:b7.setBackground(Color.orange);break;
                                     case 8:b8.setBackground(Color.orange);break;
                                         case 9:b9.setBackground(Color.orange);break;
                                             case 10:b10.setBackground(Color.orange);break;
                                                 case 11:b11.setBackground(Color.orange);break;
                                                     case 12:b12.setBackground(Color.orange);break;
                                                         case 13:b13.setBackground(Color.orange);break;
                                                             case 14:b14.setBackground(Color.orange);break;
                                                                 case 15:b15.setBackground(Color.orange);break;
                                                                     case 16:b16.setBackground(Color.orange);break;
     }
     }
     
     if(controler.Verif.cestAujourdhuit(jour)&&controler.Verif.cestMaintenant(heure))
     {
          
        occupe=modele.Table.TableOccupe(); //controler.Verif.afficher(occupe);
        for(int i=0;i<occupe.length;i++)    
     {
     switch(occupe[i])
     {
         case 1:b1.setBackground(Color.red);break;
             case 2:b2.setBackground(Color.red);break;
                 case 3:b3.setBackground(Color.red);break;
                     case 4:b4.setBackground(Color.red);break;
                         case 5:b5.setBackground(Color.red);break;
                             case 6:b6.setBackground(Color.red);break;
                                 case 7:b7.setBackground(Color.red);break;
                                     case 8:b8.setBackground(Color.red);break;
                                         case 9:b9.setBackground(Color.red);break;
                                             case 10:b10.setBackground(Color.red);break;
                                                 case 11:b11.setBackground(Color.red);break;
                                                     case 12:b12.setBackground(Color.red);break;
                                                         case 13:b13.setBackground(Color.red);break;
                                                             case 14:b14.setBackground(Color.red);break;
                                                                 case 15:b15.setBackground(Color.red);break;
                                                                     case 16:b16.setBackground(Color.red);break;
     }
     }
     }
    
    
    }
     public void cliquerSurBouton(JButton b,int i)
     {
         if(b.getBackground().equals(Color.green))
       {
         b.setBackground(Color.white);
         selectionne.add(i);
       }
       else if(b.getBackground().equals(Color.white))
       {
         b.setBackground(Color.green);
         selectionne.removeElement(i);
       }
       else if(b.getBackground().equals(Color.red))
       {
         String[] tab=modele.Client.informationClient(jour, heure, i);
         new InfoClient(tab[0], tab[1], tab[2], tab[3],tab[4]);
       } 
         else if(b.getBackground().equals(Color.orange))
       {
         String[] tab=modele.Client.informationClient(jour, heure, i);
         new InfoClient(tab[0], tab[1], tab[2], tab[3],tab[4]);
       } 
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton boutonAjouter;
    private javax.swing.JButton boutonChercher;
    private javax.swing.JButton boutonReserve;
    private javax.swing.JTextField cin;
    private javax.swing.JComboBox comboHeur;
    private javax.swing.JComboBox comboJour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nbPersonne;
    // End of variables declaration//GEN-END:variables
}
