
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import static modele.Reservation.con;
import view.Message;


public class Commande 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String commenatire,int numTable)
{
    	try
   	{
   	String r="insert into commande  VALUES (null,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
	
        ps.setString(1, commenatire);
        ps.setInt(2, numTable);
        ;
       
	ps.executeUpdate(); 
   	}
   	catch(Exception e)
    	{ 
   	    JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'Ajouter' !");
	    out.println(e);
	}
}
public static DefaultTableModel afficher1()
{  
      
       String[] col={"Numero","Commentaire"};
       String[][] row=null;
       DefaultTableModel m;
       ResultSet  r;
       
       
       int num;
       String commentaire;
      
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT num,commentaire FROM commande where etat='non preparer' ");
        while(r.next())
   	{
        num = r.getInt(1);
	commentaire=r.getString(2);
	
        
        Object[] tab ={num,commentaire};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e)
        { 
            
        }
        return m;
}
//------------------------------------------------------------------------------
public static  int donnerNumCommande(int numTable)
{
    int num=0;
    	try
   	{
   	String req="select num from  commande where numT="+numTable;
	ResultSet r = con.getS().executeQuery(req);
        r.next();
        num=r.getInt(1);
   	}
   	catch(Exception e)
    	{ 
   	     new view.Message("Erreur", "donnerNumCommande"); 
	}
        return num;
}

public static  int modifier(int numCommande,String commentaire)
{
    int num=0;
    	try
   	{
   	String req="UPDATE `commande` SET `num`=num,`commentaire`='"+commentaire+"',`numT`= numT `etat`=etat WHERE `num`="+numCommande;
	con.getS().executeUpdate(req);
       
   	}
   	catch(Exception e)
    	{ 
   	     new view.Message("Erreur", "donnerNumCommande"); 
	}
        return num;
}
   public static void  supprimer(int numEtudiant)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from client  where numEtudiant="+numEtudiant+" ;");
  	}
  	catch(Exception e)
    	{ 
   	    new view.Message("Erreur", "Supprimer Client"); 
	}
    }
   
   
   public static  int modifier(int numCommande)
{
    int num=0;
    	try
   	{
   	String req="UPDATE `commande` SET `num`=num,`commentaire`=commentaire,`numT`= numT ,`etat`='preparer' WHERE `num`="+numCommande;
	con.getS().executeUpdate(req);
       
   	}
   	catch(Exception e)
    	{ 
   	     new view.Message("Erreur", "donnerNumCommande"); 
             System.out.println(e.getMessage());
	}
        return num;
}
}
