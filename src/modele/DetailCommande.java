
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import static modele.Commande.con;
import view.Message;


public class DetailCommande 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(int numCommande,int numElement,int quantite)
{
    	try
   	{
   	String r="insert into detailscommande  VALUES (?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
	
        ps.setInt(1, numCommande);
        ps.setInt(2, numElement);
        ps.setInt(3, quantite);
      
       
	ps.executeUpdate(); 
   	}
   	catch(Exception e)
    	{ 
   	   System.out.println(e.getMessage());
	}
}

//------------------------------------------------------------------------------
public static DefaultTableModel afficher1(int numCommande)
{  
      
       String[] col={"Numero","Commentaire"};
       String[][] row=null;
       DefaultTableModel m;
       ResultSet  r;
       
       
       String nom;
       int quantite;
      
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT nom,quantite FROM detailscommande ,menu where num=numElement and numCommande='"+numCommande+"' ");
        while(r.next())
   	{
        nom = r.getString(1);
	quantite=r.getInt(2);
	
        
        Object[] tab ={nom,quantite};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e)
        { 
            
        }
        return m;
}
   
}
