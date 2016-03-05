
package view;

import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import view.chefcuisinier.Chef;
import view.gerant.Gerant;
import view.receptioniste.Receptionniste;
import view.serveur.Serveur;

public class LoginPassword extends javax.swing.JFrame {
private javax.swing.JButton Boutonfermer;
    public LoginPassword() 
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        inscrire = new javax.swing.JButton();
        login2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nom2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        prenom2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tel2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cin2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        role2 = new javax.swing.JComboBox();
        password2 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        connexion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login1 = new javax.swing.JTextField();
        password1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(50,50,controler.Parametre.x, controler.Parametre.y);
        setLayout(null);
        setUndecorated(true);
        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        inscrire.setBackground(new java.awt.Color(255, 204, 51));
        inscrire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/240_F_32232411_DcpnuhidxpcRLDBqRFS5dHl0XpggZKXd.jpg"))); // NOI18N
        inscrire.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        inscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrire(evt);
            }
        });
        jPanel3.add(inscrire);
        inscrire.setBounds(180, 400, 190, 40);

        login2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        login2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       
        jPanel3.add(login2);
        login2.setBounds(170, 240, 210, 40);

        jLabel7.setBackground(new java.awt.Color(255, 204, 51));
        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText(" Login");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(80, 240, 90, 40);

        jLabel8.setBackground(new java.awt.Color(255, 204, 51));
        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel8.setText(" Nom");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        jPanel3.add(jLabel8);
        jLabel8.setBounds(80, 90, 90, 40);

        nom2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nom2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nom2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(nom2);
        nom2.setBounds(170, 90, 210, 40);

        jLabel9.setBackground(new java.awt.Color(255, 204, 51));
        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel9.setText(" Prenom");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel9.setOpaque(true);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(80, 140, 90, 40);

        prenom2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        prenom2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prenom2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(prenom2);
        prenom2.setBounds(170, 140, 210, 40);

        jLabel10.setBackground(new java.awt.Color(255, 204, 51));
        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel10.setText(" Tel");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel10.setOpaque(true);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(80, 190, 90, 40);

        tel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        tel2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(tel2);
        tel2.setBounds(170, 190, 210, 40);

        jLabel11.setBackground(new java.awt.Color(255, 204, 51));
        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel11.setText(" Cin");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel11.setOpaque(true);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(80, 40, 90, 40);

        cin2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        cin2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(cin2);
        cin2.setBounds(170, 40, 210, 40);

        jLabel13.setBackground(new java.awt.Color(255, 204, 51));
        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel13.setText(" Password");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel13.setOpaque(true);
        jPanel3.add(jLabel13);
        jLabel13.setBounds(80, 290, 90, 40);

        role2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        role2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Serveur", "Receptionniste", "Gerant", "Chef cuisinier" }));
        role2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(role2);
        role2.setBounds(170, 340, 210, 40);

        password2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        password2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(password2);
        password2.setBounds(170, 290, 210, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(500, 100, 500, 500);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        connexion.setBackground(new java.awt.Color(255, 204, 51));
        connexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-connexion-2-copie-744x214.png"))); // NOI18N
        connexion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexion(evt);
            }
        });
        jPanel4.add(connexion);
        connexion.setBounds(70, 170, 180, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(30, 40, 50, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/password.png"))); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(30, 100, 50, 50);

        login1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(login1);
        login1.setBounds(90, 40, 210, 50);

        password1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(password1);
        password1.setBounds(90, 100, 210, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7991005-vecteur-arri-re-plan-de-menu-restaurant.jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 240, 350, 210);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 100, 500, 500);

        jLabel12.setBackground(new java.awt.Color(255, 204, 51));
        jLabel12.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(controler.Parametre.titre);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1000, 60);

        jLabel4.setBackground(new java.awt.Color(204, 102, 0));
        jLabel4.setFont(new java.awt.Font("Rod", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inscription");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 60, 500, 40);

        jLabel14.setBackground(new java.awt.Color(204, 102, 0));
        jLabel14.setFont(new java.awt.Font("Rod", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Connexion");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 60, 500, 40); 
        Boutonfermer = new javax.swing.JButton();
        Boutonfermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        Boutonfermer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Boutonfermer.addActionListener(new java.awt.event.ActionListener() 
        {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
        }
        });
        add(Boutonfermer);
        Boutonfermer.setBounds(950, 10, 40, 40);

    }                       

    private void connexion(java.awt.event.ActionEvent evt) 
    {                                          
      
      String login=login1.getText();
      String password=password1.getText();
      
       if(modele.Utilisateur.estUtilisateur(login,password))
      {
          String role=modele.Utilisateur.informationClient(login, password)[6];
          switch(role) 
          {
              case "Serveur":new Serveur(modele.Serveur.donneCin(login,password)).setVisible(true);break;
              case "Receptionniste":new Receptionniste().setVisible(true);break;
              case "Gerant":new Gerant().setVisible(true);break;
              case "Chef cuisinier":new Chef().setVisible(true);break;
          }
          setVisible(false);
          
      }
        
    }                                         
    private void inscrire(java.awt.event.ActionEvent evt)
    {                                         
      String cin=cin2.getText();
      String nom=nom2.getText();
      String prenom=prenom2.getText();
      String tel=tel2.getText();
      String login=login2.getText();
      String password=password2.getText();
      String role=(String)role2.getSelectedItem();
      
      if(!controler.Verif.estPlein(new String[]{cin,nom,prenom,tel,login,password,role})||
              !controler.Verif.verifCinTel(cin)||
              !controler.Verif.verifCinTel(tel) )
      {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," verifier champs !");
          
          
         
      }
      else if(modele.Utilisateur.estUtilisateur(login))
      {}
      else
        { modele.Utilisateur.ajouter(cin, nom, prenom, tel, login, password, role);}   
    }                                        

    public static void main(String args[]) 
    {
        new LoginPassword().setVisible(true);
     }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField cin2;
    private javax.swing.JButton connexion;
    private javax.swing.JButton inscrire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField login1;
    private javax.swing.JTextField login2;
    private javax.swing.JTextField nom2;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField prenom2;
    private javax.swing.JComboBox role2;
    private javax.swing.JTextField tel2;
    // End of variables declaration                   
}
