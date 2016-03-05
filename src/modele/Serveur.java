
package modele;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import view.Message;


public class Serveur 
{
   public static  Connexion con=new Connexion();
  

//------------------------------------------------------------------------------ 
public static Vector tableDeService(String cin)
{  
        ResultSet r;
        Vector v=new Vector();
        try
   	{
           
                String s="select num from `table` where cin='"+cin+"'";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                        v.addElement(r.getInt(1));
                }
           
        }
   	catch(Exception e)
        { 
          new Message("Error", e.getMessage());
          System.out.print(e.getMessage());
        }
       return v;
}
public static String donneCin(String login,String password)
{  
        ResultSet r;
       
        try
   	{
           
                String s="select cin from `Utilisateur` where login='"+login+"' and password='"+password+"'";
                r= con.getS().executeQuery(s);
                while(r.next())
                {
                      return  r.getString(1);
                }
           
        }
   	catch(Exception e)
        { 
          new Message("Error", e.getMessage());
          System.out.print(e.getMessage());
        }
       return " ";
}

//------------------------------------------------------------------------------

}
