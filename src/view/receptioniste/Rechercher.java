
package view.receptioniste;

import controler.Verif;
import java.time.Instant;
import java.util.Date;
import view.Message;

public class Rechercher extends javax.swing.JPanel {

    public Rechercher()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        occupe = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boutonRechercher = new javax.swing.JButton();
        textJour = new javax.swing.JTextField();
        textNumReservation = new javax.swing.JTextField();
        textNbTable = new javax.swing.JTextField();
        textHeure = new javax.swing.JTextField();
        textCin = new javax.swing.JTextField();
        textNbPersonne = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        textNomPrenom = new javax.swing.JTextField();
        disponible = new javax.swing.JButton();
        disponible1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 0));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));
        setLayout(null);

        occupe.setBackground(new java.awt.Color(255, 204, 102));
        occupe.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        occupe.setText("Occupe");
        occupe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        occupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupeActionPerformed(evt);
            }
        });
        add(occupe);
        occupe.setBounds(20, 310, 210, 40);

        num.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(num);
        num.setBounds(20, 10, 210, 40);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Tel                                  ");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);
        add(jLabel1);
        jLabel1.setBounds(20, 270, 210, 30);

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Numero Reservation    ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(20, 60, 210, 30);

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Jour                                ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(20, 90, 210, 30);

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Heure                             ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(20, 120, 210, 30);

        jLabel5.setBackground(new java.awt.Color(255, 153, 0));
        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Nombre de table ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setOpaque(true);
        add(jLabel5);
        jLabel5.setBounds(20, 150, 210, 30);

        jLabel6.setBackground(new java.awt.Color(255, 153, 0));
        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Nombre de Personne ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(20, 180, 210, 30);

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("CIN                                ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel7.setOpaque(true);
        add(jLabel7);
        jLabel7.setBounds(20, 210, 210, 30);

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Nom  & Prenom           ");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        add(jLabel8);
        jLabel8.setBounds(20, 240, 210, 30);

        boutonRechercher.setBackground(new java.awt.Color(255, 204, 102));
        boutonRechercher.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        boutonRechercher.setText("Rechercher");
        boutonRechercher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        boutonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRechercherActionPerformed(evt);
            }
        });
        add(boutonRechercher);
        boutonRechercher.setBounds(240, 10, 200, 40);

        textJour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textJour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textJour.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textJour.setEnabled(false);
        add(textJour);
        textJour.setBounds(240, 90, 200, 30);

        textNumReservation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNumReservation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNumReservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textNumReservation.setEnabled(false);
        textNumReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumReservationActionPerformed(evt);
            }
        });
        add(textNumReservation);
        textNumReservation.setBounds(240, 60, 200, 30);

        textNbTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNbTable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNbTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textNbTable.setEnabled(false);
        add(textNbTable);
        textNbTable.setBounds(240, 150, 200, 30);

        textHeure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textHeure.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textHeure.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textHeure.setEnabled(false);
        add(textHeure);
        textHeure.setBounds(240, 120, 200, 30);

        textCin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textCin.setEnabled(false);
        add(textCin);
        textCin.setBounds(240, 210, 200, 30);

        textNbPersonne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNbPersonne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNbPersonne.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textNbPersonne.setEnabled(false);
        add(textNbPersonne);
        textNbPersonne.setBounds(240, 180, 200, 30);

        textTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textTel.setEnabled(false);
        add(textTel);
        textTel.setBounds(240, 270, 200, 30);

        textNomPrenom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNomPrenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNomPrenom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textNomPrenom.setEnabled(false);
        add(textNomPrenom);
        textNomPrenom.setBounds(240, 240, 200, 30);

        disponible.setBackground(new java.awt.Color(255, 204, 102));
        disponible.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        disponible.setText("Disponible");
        disponible.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibleActionPerformed(evt);
            }
        });
        add(disponible);
        disponible.setBounds(240, 310, 200, 40);

        disponible1.setBackground(new java.awt.Color(255, 204, 102));
        disponible1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        disponible1.setText("Annuler les reservations non respecte");
        disponible1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        disponible1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponible1ActionPerformed(evt);
            }
        });
        add(disponible1);
        disponible1.setBounds(20, 360, 420, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void occupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupeActionPerformed
    
     int[] tab=modele.TableClient.TablesDeReservation(Integer.parseInt(num.getText()));
     for(int i=0;i<tab.length;i++)
     {
       modele.Table.modifier(tab[i], "occupe");
     }
     
    }//GEN-LAST:event_occupeActionPerformed
      
    private void boutonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRechercherActionPerformed
         if(!controler.Verif.estPlein(new String[]{num.getText()}))
        {
           new Message("Erreur", "Champ est vide");
        }
         else if(!controler.Verif.verifEntier(num.getText()))
        {
           new Message("Erreur", "Format Incorrecte");
        }
        else if(!modele.Reservation.estReservation(Integer.parseInt(num.getText())))
        {
           new Message("Erreur", "Reservation Introuvable"); 
        }    
       else
        {
        String[] tab=modele.Reservation.afficher(Integer.parseInt(num.getText()));
        textNumReservation.setText(tab[0]);
        textJour.setText(tab[1]);
        textHeure.setText(tab[2]);
        textNbTable.setText(tab[3]);
        textNbPersonne.setText(tab[4]);
        textCin.setText(tab[5]);
        textNomPrenom.setText(tab[6]);
        textTel.setText(tab[7]);
        
        if(Verif.cestAujourdhuit( textJour.getText())&&Date.from(Instant.now()).getMinutes()<30&&Date.from(Instant.now()).getHours()==Integer.parseInt(textHeure.getText().substring(0, 2))) 
            {
               occupe.setEnabled(true);disponible.setEnabled(true);
               new view.Message("Client", "Ce client  respecte la date et l'heure");
            }
       
        else
            {
                occupe.setEnabled(false);disponible.setEnabled(true);
                //new view.Message("Client", "Ce client ne respecte pas la date et l'heure");
            }
         }
    }//GEN-LAST:event_boutonRechercherActionPerformed

    private void textNumReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumReservationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumReservationActionPerformed

    private void disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibleActionPerformed
     int[] numTableReserve=modele.TableClient.TablesDeReservation(Integer.parseInt(num.getText()));
     int[] numTableOccupe=modele.Table.TableOccupe(); 
  //  if(Verif.t1danst2(numTableReserve,numTableOccupe))
    // {
                for(int i=0;i<numTableReserve.length;i++)
                {
                  modele.Table.modifier(numTableReserve[i], "disponible");
                }
  //   }         
       
                
     
         textNumReservation.setText("");
        textJour.setText("");
        textHeure.setText("");
        textNbTable.setText("");
        textNbPersonne.setText("");
        textCin.setText("");
        textNomPrenom.setText("");
        textTel.setText("");
      modele.TableClient.supprimer(Integer.parseInt(num.getText()));
      modele.Reservation.supprimer(Integer.parseInt(num.getText()));
    }//GEN-LAST:event_disponibleActionPerformed
    
    private void disponible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponible1ActionPerformed
     modele.Reservation.supprimerReservationNonRespacte() ;
    }//GEN-LAST:event_disponible1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonRechercher;
    private javax.swing.JButton disponible;
    private javax.swing.JButton disponible1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField num;
    private javax.swing.JButton occupe;
    private javax.swing.JTextField textCin;
    private javax.swing.JTextField textHeure;
    private javax.swing.JTextField textJour;
    private javax.swing.JTextField textNbPersonne;
    private javax.swing.JTextField textNbTable;
    private javax.swing.JTextField textNomPrenom;
    private javax.swing.JTextField textNumReservation;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables
}
