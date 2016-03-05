

package modele;

import controler.Verif;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Instant;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import view.Message;


public class Menu 
{
   public static  Connexion con=new Connexion();
  


//------------------------------------------------------------------------------
public static DefaultTableModel afficher()
{  
      
       String[] col={"Numero","Type","Nom","Prix"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       
       int num;
       String type;
       String nom;
       int prix;
       
       
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM menu ");
        while(r.next())
   	{
        num = r.getInt(1);
	type=r.getString(2);
	nom=r.getString(3);
        prix=r.getInt(4);
       
        Object[] tab ={num,type,nom,prix};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e)
        { 
            
        }
        return m;
}

 
//------------------------------------------------------------------------------

}
