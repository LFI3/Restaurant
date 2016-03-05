
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import view.Message;


public class Client 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String cin,String nom,String prenom,int tel)
{
    	try
   	{
   	String r="insert into client  VALUES (?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
	ps.setString(1, cin);
        ps.setString(2, nom);
        ps.setString(3, prenom);
        ps.setInt(4, tel);
       
	ps.executeUpdate(); 
   	}
   	catch(Exception e)
    	{ 
   	    JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'Ajouter' !");
	    out.println(e);
	}
}
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------  
public static boolean estClient(String cin)
{
     try
     {
     String s="select count(*) from client where cin='"+cin+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
        if(r.getInt(1)==0)
        {
          return false;
        }
        else     
        {
         return true;
        }
     }
     catch(Exception e)
     {
          new Message("Error", "estClient");
     }
     return false;
}
//------------------------------------------------------------------------------ 

//------------------------------------------------------------------------------ 
public static String[] informationClient(String cin)
{  
        ResultSet r;
        String[] tab=new String[6];
        try
   	{
            if(estClient(cin))
            {
                String s="select * from client where cin='"+cin+"'";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        tab[0]=r.getString(1);
                        tab[1]=r.getString(2);
                        tab[2]=r.getString(3);
                        tab[3]=r.getInt(4)+""; 
                }
            }
        }
   	catch(Exception e)
        { 
          new Message("Error", "Information Client");
        }
       return tab;
}
public static String[] informationClient(String jour,String heure,int numTable)
{  
        ResultSet r;
        String[] tab=new String[5];
        try
   	{
            
                String s="select num ,client.cin,nom,prenom,tel from reservation ,client,tableclient where client.cin=reservation.cin and numReservation=num and  jour='"+jour+"' and heure='"+heure+"' and numTable="+numTable;
                r= con.getS().executeQuery(s);
                if(r.next())
                {
                        tab[0]=r.getInt(1)+"";
                        tab[1]=r.getString(2);
                        tab[2]=r.getString(3);
                        tab[3]=r.getString(4);
                        tab[4]=r.getInt(5)+""; 
                }
        }
        catch(Exception e)
        { 
         new view.Message("Erreur", "Information Client");
        }
       return tab;
} 

//------------------------------------------------------------------------------

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
}
