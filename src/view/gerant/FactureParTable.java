
package view.gerant;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.Message;

public class FactureParTable extends javax.swing.JFrame {


public int[] occupe;
public int numTable;

    public FactureParTable(int numTable)
    {
        this.numTable=numTable;
        setUndecorated(true);
        initComponents();
        setBounds(300, 100, 480, 540);
        charger();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fermer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pr1 = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        pr2 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        pr4 = new javax.swing.JLabel();
        pr3 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        pr6 = new javax.swing.JLabel();
        pr5 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        pr7 = new javax.swing.JLabel();
        somme = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

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

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prix");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(340, 60, 120, 40);

        pr1.setBackground(new java.awt.Color(255, 255, 255));
        pr1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr1.setOpaque(true);
        jPanel2.add(pr1);
        pr1.setBounds(340, 110, 120, 40);

        titre.setBackground(new java.awt.Color(255, 102, 0));
        titre.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setText("Table N° : ");
        titre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        titre.setOpaque(true);
        jPanel2.add(titre);
        titre.setBounds(10, 10, 450, 40);

        jLabel4.setBackground(new java.awt.Color(153, 51, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quantite");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 60, 120, 40);

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q1.setOpaque(true);
        jPanel2.add(q1);
        q1.setBounds(10, 110, 120, 40);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p1.setOpaque(true);
        jPanel2.add(p1);
        p1.setBounds(140, 110, 170, 40);

        q2.setBackground(new java.awt.Color(255, 255, 255));
        q2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q2.setOpaque(true);
        jPanel2.add(q2);
        q2.setBounds(10, 150, 120, 40);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p2.setOpaque(true);
        jPanel2.add(p2);
        p2.setBounds(140, 150, 170, 40);

        pr2.setBackground(new java.awt.Color(255, 255, 255));
        pr2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr2.setOpaque(true);
        jPanel2.add(pr2);
        pr2.setBounds(340, 150, 120, 40);

        q4.setBackground(new java.awt.Color(255, 255, 255));
        q4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q4.setOpaque(true);
        jPanel2.add(q4);
        q4.setBounds(10, 230, 120, 40);

        q3.setBackground(new java.awt.Color(255, 255, 255));
        q3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q3.setOpaque(true);
        jPanel2.add(q3);
        q3.setBounds(10, 190, 120, 40);

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p4.setOpaque(true);
        jPanel2.add(p4);
        p4.setBounds(140, 230, 170, 40);

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p3.setOpaque(true);
        jPanel2.add(p3);
        p3.setBounds(140, 190, 170, 40);

        pr4.setBackground(new java.awt.Color(255, 255, 255));
        pr4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr4.setOpaque(true);
        jPanel2.add(pr4);
        pr4.setBounds(340, 230, 120, 40);

        pr3.setBackground(new java.awt.Color(255, 255, 255));
        pr3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr3.setOpaque(true);
        jPanel2.add(pr3);
        pr3.setBounds(340, 190, 120, 40);

        q6.setBackground(new java.awt.Color(255, 255, 255));
        q6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q6.setOpaque(true);
        jPanel2.add(q6);
        q6.setBounds(10, 310, 120, 40);

        q5.setBackground(new java.awt.Color(255, 255, 255));
        q5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q5.setOpaque(true);
        jPanel2.add(q5);
        q5.setBounds(10, 270, 120, 40);

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p6.setOpaque(true);
        jPanel2.add(p6);
        p6.setBounds(140, 310, 170, 40);

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p5.setOpaque(true);
        jPanel2.add(p5);
        p5.setBounds(140, 270, 170, 40);

        pr6.setBackground(new java.awt.Color(255, 255, 255));
        pr6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr6.setOpaque(true);
        jPanel2.add(pr6);
        pr6.setBounds(340, 310, 120, 40);

        pr5.setBackground(new java.awt.Color(255, 255, 255));
        pr5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr5.setOpaque(true);
        jPanel2.add(pr5);
        pr5.setBounds(340, 270, 120, 40);

        q7.setBackground(new java.awt.Color(255, 255, 255));
        q7.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        q7.setOpaque(true);
        jPanel2.add(q7);
        q7.setBounds(10, 350, 120, 40);

        p7.setBackground(new java.awt.Color(255, 255, 255));
        p7.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        p7.setOpaque(true);
        jPanel2.add(p7);
        p7.setBounds(140, 350, 170, 40);

        pr7.setBackground(new java.awt.Color(255, 255, 255));
        pr7.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pr7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pr7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pr7.setOpaque(true);
        jPanel2.add(pr7);
        pr7.setBounds(340, 350, 120, 40);

        somme.setBackground(new java.awt.Color(255, 255, 255));
        somme.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        somme.setForeground(new java.awt.Color(255, 0, 0));
        somme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        somme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        somme.setOpaque(true);
        jPanel2.add(somme);
        somme.setBounds(340, 400, 120, 40);

        jLabel24.setBackground(new java.awt.Color(153, 51, 0));
        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Produit");
        jLabel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel24.setOpaque(true);
        jPanel2.add(jLabel24);
        jLabel24.setBounds(140, 60, 170, 40);

        jLabel26.setBackground(new java.awt.Color(255, 153, 0));
        jLabel26.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Imprimer");
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel26.setOpaque(true);
        jPanel2.add(jLabel26);
        jLabel26.setBounds(340, 450, 120, 40);

        jLabel28.setBackground(new java.awt.Color(255, 102, 0));
        jLabel28.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Totale");
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel28.setOpaque(true);
        jPanel2.add(jLabel28);
        jLabel28.setBounds(10, 400, 300, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 480, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_fermerActionPerformed


       public void cliquerSurBouton(JButton b,int i)
       {
         if(b.getBackground().equals(Color.red))
       {
         new Message("Bravo", "Derbeli ya m3alem");
       } 
         
      }    
    
       public void charger()
       {
         Vector qLabel=new Vector();  
         Vector pLabel=new Vector(); 
         Vector prLabel=new Vector();
         
         qLabel.addElement(q1);
         qLabel.addElement(q2);
         qLabel.addElement(q3);
         qLabel.addElement(q4);
         qLabel.addElement(q5);
         qLabel.addElement(q6);
         qLabel.addElement(q7);
         
         pLabel.addElement(p1);
         pLabel.addElement(p2);
         pLabel.addElement(p3);
         pLabel.addElement(p4);
         pLabel.addElement(p5);
         pLabel.addElement(p6);
         pLabel.addElement(p7);
         
         prLabel.addElement(pr1);
         prLabel.addElement(pr2);
         prLabel.addElement(pr3);
         prLabel.addElement(pr4);
         prLabel.addElement(pr5);
         prLabel.addElement(pr6);
         prLabel.addElement(pr7);
         
         titre.setText(titre.getText()+numTable);
         Vector q=new Vector();  
         Vector n=new Vector(); 
         Vector p=new Vector(); 
         somme.setText(modele.Facture.factureParTable( numTable , q, n, p)+"");
        
         
         for(int i=q.size();i<7;i++)   
         {
             ((JLabel)prLabel.elementAt(i)).setVisible(false);
             ((JLabel)pLabel.elementAt(i)).setVisible(false);
             ((JLabel)qLabel.elementAt(i)).setVisible(false);
         }
         
         for(int i=0;i<q.size();i++)   
         {
              ((JLabel)qLabel.elementAt(i)).setText(q.elementAt(i).toString());
              ((JLabel)pLabel.elementAt(i)).setText(n.elementAt(i).toString());
              ((JLabel)prLabel.elementAt(i)).setText(p.elementAt(i).toString());
         }
         
       }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel pr1;
    private javax.swing.JLabel pr2;
    private javax.swing.JLabel pr3;
    private javax.swing.JLabel pr4;
    private javax.swing.JLabel pr5;
    private javax.swing.JLabel pr6;
    private javax.swing.JLabel pr7;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel somme;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
