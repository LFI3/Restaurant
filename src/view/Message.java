
package view;

import java.awt.Rectangle;

public class Message extends javax.swing.JFrame {

    public Message(String r,String m) 
    {
        jPanel1 = new javax.swing.JPanel();
        role = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        boutonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 0));
        setUndecorated(true);
        setVisible(true);
        getContentPane().setLayout(null);
        setBounds(300,300,540,200);
        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        role.setBackground(new java.awt.Color(0, 0, 0));
        role.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role.setText(r);
        role.setOpaque(true);
        jPanel1.add(role);
        role.setBounds(0, 0, 540, 40);

        message.setFont(new java.awt.Font("SketchFlow Print", 1, 20)); // NOI18N
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText(m);
        jPanel1.add(message);
        message.setBounds(0, 70, 540, 50);

        boutonOK.setBackground(new java.awt.Color(102, 102, 0));
        boutonOK.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        boutonOK.setText("OK");
        boutonOK.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204)));
        boutonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonOKActionPerformed(evt);
            }
        });
        jPanel1.add(boutonOK);
        boutonOK.setBounds(220, 140, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 200);
    }
                

    private void boutonOKActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setVisible(false);
    }                                        

   
    // Variables declaration - do not modify                     
    private javax.swing.JButton boutonOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel role;
    // End of variables declaration                   
}
