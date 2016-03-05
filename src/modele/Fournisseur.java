
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import view.Message;


public class Fournisseur 
{
   public static  Connexion con=new Connexion();
  

//------------------------------------------------------------------------------ 
public static String[] informationFournisseur(String cin,int numP)
{  
        ResultSet r;
        String[] tab=new String[6];
        try
   	{
            
                String s="select cin,nom,prenom,tel,email,prix from fournisseur ,produitfournisseur where cin=numF and cin='"+cin+"' and numP="+numP;
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        tab[0]=r.getString(1);
                        tab[1]=r.getString(2);
                        tab[2]=r.getString(3);
                        tab[3]=r.getInt(4)+""; 
                        tab[4]=r.getString(5);
                        tab[5]=r.getString(6); 
                }
            
        }
   	catch(Exception e)
        { 
          new Message("Error", "informationFournisseur");
        }
       return tab;
}

//------------------------------------------------------------------------------
public static String[] listeFournisseur(int num )
{  
        ResultSet r;
        String[] tab=new String[nombreListeFournisseur(num)];
        int i=0;
        try
   	{
            
                String s="select cin from fournisseur,produitfournisseur where cin=numF and  numP="+num+"";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        tab[i]=r.getString(1);i++;
                       
                }
            
        }
   	catch(Exception e)
        { 
          new Message("Error", "informationFournisseur");
        }
       return tab;
}
 public static int nombreListeFournisseur(int num )
{  
        ResultSet r;
        int nb=0;
        try
   	{
            
                String s="select count(cin) from fournisseur,produitfournisseur where cin=numF and  numP="+num+"";
                r= con.getS().executeQuery(s);
                r.next();
                nb=r.getInt(1);
            
        }
   	catch(Exception e)
        { 
          new Message("Error", "informationFournisseur");
        }
       return nb;
}
  
   
}
