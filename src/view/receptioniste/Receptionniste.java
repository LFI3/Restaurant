package view.receptioniste;
public class Receptionniste extends view.Inter
{

 
    public Receptionniste() 
    {
        
        setLayout(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        rechercher = new Rechercher();
        ajouter = new Ajouter();
        rechercher.setLayout(null);
        ajouter.setLayout(null);
        ajouter.setBounds(0,150,500, 450);
        rechercher.setBounds(500,150,500, 450); 
        add(rechercher);
        add(ajouter);
        ajouter.setVisible(true);
        rechercher.setVisible(true);
        lab.setText("Bienvenu cher Receptionniste");
        setVisible(true);
    }

    public static void main(String args[]) 
    { 
      new Receptionniste().setVisible(true);
    }
    private javax.swing.JPanel ajouter;
    private javax.swing.JPanel rechercher;
    // End of variables declaration                   
}
