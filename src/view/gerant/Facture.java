
package view.gerant;

import java.awt.Color;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import view.Message;

public class Facture extends javax.swing.JFrame {


public int[] occupe;

    public Facture()
    {
        
        setUndecorated(true);
        initComponents();
        chargerListeOccupeDisponibleReservee();
        setBounds(200, 200, 480, 460);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fermer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

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

        b4.setBackground(new java.awt.Color(51, 204, 0));
        b4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4.setText("4");
        b4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel2.add(b4);
        b4.setBounds(340, 50, 73, 60);

        b1.setBackground(new java.awt.Color(51, 204, 0));
        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("1");
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1);
        b1.setBounds(70, 50, 73, 60);

        b2.setBackground(new java.awt.Color(51, 204, 0));
        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.setText("2");
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel2.add(b2);
        b2.setBounds(160, 50, 73, 60);

        b3.setBackground(new java.awt.Color(51, 204, 0));
        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.setText("3");
        b3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel2.add(b3);
        b3.setBounds(250, 50, 73, 60);

        b5.setBackground(new java.awt.Color(51, 204, 0));
        b5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b5.setText("5");
        b5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel2.add(b5);
        b5.setBounds(70, 130, 73, 60);

        b6.setBackground(new java.awt.Color(51, 204, 0));
        b6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b6.setText("6");
        b6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel2.add(b6);
        b6.setBounds(160, 130, 73, 60);

        b7.setBackground(new java.awt.Color(51, 204, 0));
        b7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b7.setText("7");
        b7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel2.add(b7);
        b7.setBounds(250, 130, 73, 60);

        b8.setBackground(new java.awt.Color(51, 204, 0));
        b8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b8.setText("8");
        b8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel2.add(b8);
        b8.setBounds(340, 130, 73, 60);

        b9.setBackground(new java.awt.Color(51, 204, 0));
        b9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b9.setText("9");
        b9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel2.add(b9);
        b9.setBounds(70, 210, 73, 60);

        b10.setBackground(new java.awt.Color(51, 204, 0));
        b10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b10.setText("10");
        b10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel2.add(b10);
        b10.setBounds(160, 210, 73, 60);

        b11.setBackground(new java.awt.Color(51, 204, 0));
        b11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b11.setText("11");
        b11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel2.add(b11);
        b11.setBounds(250, 210, 73, 60);

        b12.setBackground(new java.awt.Color(51, 204, 0));
        b12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b12.setText("12");
        b12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel2.add(b12);
        b12.setBounds(340, 210, 73, 60);

        b13.setBackground(new java.awt.Color(51, 204, 0));
        b13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b13.setText("13");
        b13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jPanel2.add(b13);
        b13.setBounds(70, 290, 73, 60);

        b14.setBackground(new java.awt.Color(51, 204, 0));
        b14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b14.setText("14");
        b14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel2.add(b14);
        b14.setBounds(160, 290, 73, 60);

        b15.setBackground(new java.awt.Color(51, 204, 0));
        b15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b15.setText("15");
        b15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel2.add(b15);
        b15.setBounds(250, 290, 73, 60);

        b16.setBackground(new java.awt.Color(51, 204, 0));
        b16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b16.setText("16");
        b16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jPanel2.add(b16);
        b16.setBounds(340, 290, 73, 60);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 380, 30, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText(" Occupe");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 380, 90, 30);

        jPanel4.setBackground(java.awt.Color.green);
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(160, 380, 30, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Non Occupe");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 380, 90, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 480, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_fermerActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      cliquerSurBouton(b4,4);    
    }//GEN-LAST:event_b4ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        cliquerSurBouton(b8,8);    
    }//GEN-LAST:event_b8ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
       cliquerSurBouton(b12,12);    
    }//GEN-LAST:event_b12ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
         cliquerSurBouton(b16,16);    
    }//GEN-LAST:event_b16ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    cliquerSurBouton(b1,1);        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
 cliquerSurBouton(b2,2);            // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
 cliquerSurBouton(b3,3);            // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        cliquerSurBouton(b5,5);    
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        cliquerSurBouton(b6,6);    
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       cliquerSurBouton(b7,8);    
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
         cliquerSurBouton(b9,9);    
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
         cliquerSurBouton(b10,10);    
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
       cliquerSurBouton(b11,11);    
    }//GEN-LAST:event_b11ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        cliquerSurBouton(b13,13);    
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        cliquerSurBouton(b14,14);    
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
 cliquerSurBouton(b15,15);            // TODO add your handling code here:
    }//GEN-LAST:event_b15ActionPerformed

public void chargerListeOccupeDisponibleReservee()
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
public void cliquerSurBouton(JButton b,int i)
     {
         if(b.getBackground().equals(Color.red))
       {
         new FactureParTable( i).setVisible(true);
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
    private javax.swing.JButton fermer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
