

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


public class Produit 
{
   public static  Connexion con=new Connexion();
  


//------------------------------------------------------------------------------
public static DefaultTableModel afficher()
{  
      
       String[] col={"Num Produit","Nom Produit","Unite","Quantite","Quantite Min"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       
       int num;
       String nom;
       String unite;
       int quantite;
       int quantiteMin;
       
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM produit ");
        while(r.next())
   	{
        num = r.getInt(1);
	nom=r.getString(2);
	unite=r.getString(3);
        quantite=r.getInt(4);
        quantiteMin=r.getInt(5);
      
        
        Object[] tab ={num,nom,unite,quantite,quantiteMin};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e)
        { 
            
        }
        return m;
}
public static void ajouterQuantite(int num,int q)
{  
      
      
        try
   	{
   	con.getS().executeUpdate("UPDATE `produit` SET `num`=num,`nom`=nom,`unite`=unite,`quantite`=quantite+"+q+",`quantiteMin`=quantiteMin WHERE num="+num);
        }
   	catch(Exception e)
        { 
          System.out.println(e.getMessage());
        }
       
}
//------------------------------------------------------------------------------
public static DefaultTableModel afficherMin()
{  
      
       String[] col={"Num Produit","Nom Produit","Unite","Quantite","Quantite Min"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       
       int num;
       String nom;
       String unite;
       int quantite;
       int quantiteMin;
       
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM produit where quantite<=quantiteMin");
        while(r.next())
   	{
        num = r.getInt(1);
	nom=r.getString(2);
	unite=r.getString(3);
        quantite=r.getInt(4);
        quantiteMin=r.getInt(5);
      
        
        Object[] tab ={num,nom,unite,quantite,quantiteMin};
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
