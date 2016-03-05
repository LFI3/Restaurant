
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;



public class Utilisateur 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String cin,String nom,String prenom,String tel,String login,String password,String role)
{
    	try
   	{
   	String r="insert into utilisateur  VALUES (?,?,?,?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
	ps.setString(1, cin);
        ps.setString(2, nom);
        ps.setString(3, prenom);
        ps.setString(4, tel);
        ps.setString(5, login);
        ps.setString(6, password);
        ps.setString(7, role);
	ps.executeUpdate(); 
   	}
   	catch(Exception e)
    	{ 
   	    JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," l'utilisateur est deja inscrit !");
	    out.println(e);
	}
}
//------------------------------------------------------------------------------  
public static boolean estUtilisateur(String login)
{
     try
     {
     String s="select count(*) from utilisateur where login='"+login+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
        {
                
                return false;
        }
     else     
        {
         JOptionPane jop = new JOptionPane();
	 showMessageDialog(null,"utilisateur existe !");
        return true;
        }
     }
     catch(Exception e)
     {
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'estutilisateur' !");
	    out.println(e); 
     }
     return false;
}
public static boolean estUtilisateur(String login,String password)
{
     try
     {
     String s="select count(*) from utilisateur where login='"+login+"' and  password='"+password+"'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     if(r.getInt(1)==0)
     {return false;}
     else     
     {return true;}
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'estutilisateur' !");
     }
     return false;
}
//------------------------------------------------------------------------------ 
public static String[] informationClient(String login,String password)
{  
        ResultSet r;
        String[] tab=new String[7];
        try
   	{
            if(estUtilisateur(login,password))
            {
                String s="select * from utilisateur where login='"+login+"' and password='"+password+"'";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        tab[0]=r.getString(1);
                        tab[1]=r.getString(2);
                        tab[2]=r.getString(3);
                        tab[3]=r.getInt(4)+""; 
                        tab[4]=r.getString(5);
                        tab[5]=r.getString(6);
                        tab[6]=r.getString(7);
                }
            }
        }
   	catch(Exception e)
        { 
        JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'informationUtilisateur' !");
	    out.println(e); 
        }
       return tab;
} 
//------------------------------------------------------------------------------

   public static void  supprimer(int num)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from utilisateur  where numEtudiant="+num+" ;");
  	}
  	catch(Exception e)
    	{ 
   	    JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," ERROR 'supprimer' !");
	    out.println(e);
	}
    }
}
