
package view.serveur;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JButton;
import view.LoginPassword;
import view.receptioniste.InfoClient;


public class Serveur extends javax.swing.JFrame {

    public Vector listeOccupe;
    public Vector listePasserCommande;
    public Vector disponible;
    public Vector horsService;
    public Vector mesServices;
    public String cin;
    public Serveur(String cin) {
        listeOccupe=new Vector();
        listePasserCommande=new Vector();
        disponible=new Vector();
        horsService=new Vector();
        mesServices=new Vector();
        this.cin=cin;
        
        setUndecorated(true);
        initComponents();
        initialise();
        setBounds(100, 100, 1000, 831);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pan1 = new javax.swing.JPanel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        deconnexion = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pan2 = new javax.swing.JPanel();
        lab3 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        b016 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

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

        deconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connecter.png"))); // NOI18N
        deconnexion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionActionPerformed(evt);
            }
        });
        pan1.add(deconnexion);
        deconnexion.setBounds(790, 10, 30, 30);

        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        fermer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });
        pan1.add(fermer);
        fermer.setBounds(950, 10, 40, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" Deconnexion");
        pan1.add(jLabel1);
        jLabel1.setBounds(830, 10, 110, 30);

        jPanel1.add(pan1);
        pan1.setBounds(0, 0, 1000, 100);

        lab.setBackground(new java.awt.Color(255, 102, 0));
        lab.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab.setText("Bienvenu cher Serveur");
        lab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lab.setOpaque(true);
        jPanel1.add(lab);
        lab.setBounds(0, 100, 1000, 50);

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setLayout(null);

        pan2.setBackground(new java.awt.Color(255, 204, 51));
        pan2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pan2.setLayout(null);

        lab3.setBackground(new java.awt.Color(255, 255, 255));
        lab3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        lab3.setForeground(new java.awt.Color(255, 102, 0));
        lab3.setText("Bienvenu cher ");
        lab3.setOpaque(true);
        pan2.add(lab3);
        lab3.setBounds(150, 100, 750, 50);

        lab4.setBackground(new java.awt.Color(255, 255, 255));
        lab4.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        lab4.setForeground(new java.awt.Color(255, 102, 0));
        lab4.setText("Bienvenu cher ");
        lab4.setOpaque(true);
        pan2.add(lab4);
        lab4.setBounds(150, 100, 750, 50);

        jLabel13.setBackground(new java.awt.Color(255, 204, 51));
        jLabel13.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Resto tunisien");
        jLabel13.setOpaque(true);
        pan2.add(jLabel13);
        jLabel13.setBounds(20, 20, 390, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connecter.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pan2.add(jButton3);
        jButton3.setBounds(790, 10, 30, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pan2.add(jButton4);
        jButton4.setBounds(950, 10, 40, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Deconnexion");
        pan2.add(jLabel2);
        jLabel2.setBounds(830, 10, 110, 30);

        jPanel2.add(pan2);
        pan2.setBounds(0, 0, 1000, 100);

        lab5.setBackground(new java.awt.Color(255, 102, 0));
        lab5.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        lab5.setForeground(new java.awt.Color(255, 255, 255));
        lab5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab5.setText("Bienvenu cher Serveur");
        lab5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lab5.setOpaque(true);
        jPanel2.add(lab5);
        lab5.setBounds(0, 100, 1000, 50);

        b16.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b16);
        b16.setBounds(480, 170, 70, 70);

        b17.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b17);
        b17.setBounds(390, 170, 70, 70);

        b18.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b18);
        b18.setBounds(570, 170, 70, 70);

        b19.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b19);
        b19.setBounds(480, 440, 70, 70);

        b20.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b20);
        b20.setBounds(300, 170, 70, 70);

        b21.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b21);
        b21.setBounds(300, 260, 70, 70);

        b22.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b22);
        b22.setBounds(390, 260, 70, 70);

        b23.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b23);
        b23.setBounds(480, 260, 70, 70);

        b24.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b24);
        b24.setBounds(570, 260, 70, 70);

        b25.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b25);
        b25.setBounds(300, 350, 70, 70);

        b26.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b26);
        b26.setBounds(390, 350, 70, 70);

        b27.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b27);
        b27.setBounds(480, 350, 70, 70);

        b28.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b28);
        b28.setBounds(570, 350, 70, 70);

        b29.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b29);
        b29.setBounds(300, 440, 70, 70);

        b30.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.add(b30);
        b30.setBounds(390, 440, 70, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(860, 200, 73, 70);

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        jPanel1.add(refresh);
        refresh.setBounds(30, 200, 340, 60);

        jPanel3.setBackground(java.awt.Color.green);
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 360, 60, 60);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText(" Disponible");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 360, 280, 60);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 420, 60, 60);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText(" Occupe (Ne passe pas une commande)");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 420, 280, 60);

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 480, 60, 60);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText(" Occupe ( commande deja passe)");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 480, 280, 60);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(30, 300, 60, 60);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText(" Hors  Servise");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 300, 280, 60);

        b1.setBackground(new java.awt.Color(0, 0, 0));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(590, 200, 73, 70);

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(680, 200, 73, 70);

        b3.setBackground(new java.awt.Color(0, 0, 0));
        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(770, 200, 73, 70);

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(590, 280, 73, 70);

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(680, 280, 73, 70);

        b7.setBackground(new java.awt.Color(0, 0, 0));
        b7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(770, 280, 73, 70);

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(860, 280, 73, 70);

        b9.setBackground(new java.awt.Color(0, 0, 0));
        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(590, 360, 73, 70);

        b10.setBackground(new java.awt.Color(0, 0, 0));
        b10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b10.setForeground(new java.awt.Color(255, 255, 255));
        b10.setText("10");
        b10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10);
        b10.setBounds(680, 360, 73, 70);

        b11.setBackground(new java.awt.Color(0, 0, 0));
        b11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b11.setForeground(new java.awt.Color(255, 255, 255));
        b11.setText("11");
        b11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11);
        b11.setBounds(770, 360, 73, 70);

        b12.setBackground(new java.awt.Color(0, 0, 0));
        b12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b12.setForeground(new java.awt.Color(255, 255, 255));
        b12.setText("12");
        b12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12);
        b12.setBounds(860, 360, 73, 70);

        b13.setBackground(new java.awt.Color(0, 0, 0));
        b13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b13.setForeground(new java.awt.Color(255, 255, 255));
        b13.setText("13");
        b13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jPanel1.add(b13);
        b13.setBounds(590, 440, 73, 70);

        b14.setBackground(new java.awt.Color(0, 0, 0));
        b14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b14.setForeground(new java.awt.Color(255, 255, 255));
        b14.setText("14");
        b14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel1.add(b14);
        b14.setBounds(680, 440, 73, 70);

        b15.setBackground(new java.awt.Color(0, 0, 0));
        b15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b15.setForeground(new java.awt.Color(255, 255, 255));
        b15.setText("15");
        b15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel1.add(b15);
        b15.setBounds(770, 440, 73, 70);

        b016.setBackground(new java.awt.Color(0, 0, 0));
        b016.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b016.setForeground(new java.awt.Color(255, 255, 255));
        b016.setText("16");
        b016.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b016.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b016ActionPerformed(evt);
            }
        });
        jPanel1.add(b016);
        b016.setBounds(860, 440, 73, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 581);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionActionPerformed
        setVisible(false);
        new LoginPassword().setVisible(true);
    }//GEN-LAST:event_deconnexionActionPerformed

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_fermerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
       cliquerSurBouton( b14, 14);
    }//GEN-LAST:event_b14ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        cliquerSurBouton( b1, 1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
cliquerSurBouton( b2, 2);        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       cliquerSurBouton( b3, 3);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
   cliquerSurBouton( b4, 4);        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       cliquerSurBouton( b5, 5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        cliquerSurBouton( b6, 6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        cliquerSurBouton( b7, 7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        cliquerSurBouton( b8, 8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        cliquerSurBouton( b9, 9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
       cliquerSurBouton( b10, 10);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
      cliquerSurBouton( b11, 11);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
       cliquerSurBouton( b12, 12);
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        cliquerSurBouton( b13, 13);
    }//GEN-LAST:event_b13ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        cliquerSurBouton( b15, 15);
    }//GEN-LAST:event_b15ActionPerformed

    private void b016ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b016ActionPerformed
       cliquerSurBouton( b016, 16);
    }//GEN-LAST:event_b016ActionPerformed

   public void initialise()
   {
     mesServices=modele.Serveur.tableDeService(cin);
     for(int i=0;i<mesServices.size();i++)
     {
        switch((Integer)mesServices.elementAt(i))
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
                                                                     case 16:b016.setBackground(Color.green);break;
     }
     }
     listeOccupe=modele.Table.TableOccupee(cin);
     for(int i=0;i<listeOccupe.size();i++)
     {
        switch((Integer)listeOccupe.elementAt(i))
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
                                                                     case 16:b016.setBackground(Color.red);break;
     }
     }
   }
   
   public void cliquerSurBouton(JButton b,int i)
     {
         
       
       if(b.getBackground().equals(Color.red))
       {
           
           new Menu(i).setVisible(true);
           b.setBackground(Color.blue);
       } 
         else if(b.getBackground().equals(Color.blue))
       {
         new FactureParTable(i).setVisible(true);
       } 
     }
    public static void main(String args[]) 
    {
       new Serveur("22222222").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b016;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton deconnexion;
    private javax.swing.JButton fermer;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JLabel lab;
    public javax.swing.JLabel lab1;
    public javax.swing.JLabel lab2;
    public javax.swing.JLabel lab3;
    public javax.swing.JLabel lab4;
    public javax.swing.JLabel lab5;
    public javax.swing.JPanel pan1;
    public javax.swing.JPanel pan2;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
