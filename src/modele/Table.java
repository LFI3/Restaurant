
package modele;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;




public class Table 
{
   public static  Connexion con=new Connexion();
//------------------------------------------------------------------------------  
 public static void modifier(int num,String etat)
{
     try
     {
     String s="UPDATE `table` SET `num`=num,`etat`='"+etat+"',`cin`=cin WHERE num="+num;
     con.getS().executeUpdate(s);
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null,"modifier");
     }
    
}
public static int[] TableOccupe()
{
   int nb=nombreTableOccupe();
   int[] tab=new int[nb];
   int i=0;
    try
     {
      String s="SELECT * FROM restaurant.`table` where etat='occupe'";
     ResultSet r=con.getS().executeQuery(s);
     while(r.next())
     {
       
       tab[i]=r.getInt(1);
       i++;
      
      }
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null,"TableOccupe");
     }
    return tab;
}
   
   public static Vector TableOccupee(String cin)
    {
  
    Vector v=new Vector();
  
    try
     {
      String s="SELECT * FROM restaurant.`table` where etat='occupe' and cin='"+cin+"'";
     ResultSet r=con.getS().executeQuery(s);
     while(r.next())
     { v.addElement(r.getInt(1));
      }
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null,"TableOccupe");
     }
    return v;
}
public static int nombreTableOccupe()
{
   int nb=0;
    try
     {
     String s="SELECT count(*) FROM restaurant.`table` where etat='occupe'";
     ResultSet r=con.getS().executeQuery(s);
     r.next();
     nb=r.getInt(1);
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," nombreTableParEtat");
             System.out.println(e.getMessage());
     }
    return nb;
}
public static int[] TableReserve(String jour,String heure)
{        
    int[] tab=new int[nombreTableReserve(jour, heure)];
    int i=0;
    try
     {
     String s="select numTable from reservation,tableclient where num=numReservation and jour=? and heure=?";
     PreparedStatement ps = con.getC().prepareStatement(s);
     ps.setString(1, jour);
     ps.setString(2, heure);
     ResultSet r= ps.executeQuery();
     while(r.next())
     {
      tab[i]=r.getInt(1);
      i++;
     }
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null," TableReserve ");
            System.out.println(e.getMessage());
     }
    return tab;
}
public static int[] TableDisponible(String jour,String heure)
{        
    int[] disponible=new int[nombreTableDisponible(jour, heure)];
    int[] reserve=TableReserve( jour, heure);
    int i=0;
    
    for(int num=1;num<=16;num++)
    {
      if(!controler.Verif.existe(reserve, num)){disponible[i]=num; i++;} 
    }
    return disponible;
}
public static int nombreTableReserve(String jour,String heure)
{        
   
    int nb=0;
    try
     {
     String s="select count(numTable) from reservation,tableclient where num=numReservation and jour=? and heure=?";
     PreparedStatement ps = con.getC().prepareStatement(s);
	ps.setString(1, jour);
        ps.setString(2, heure);
       ResultSet r= ps.executeQuery();
       r.next();
     nb=r.getInt(1);
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null,"nombreTableReserve");
            System.out.println(e.getMessage());
     }
    return nb;
}
public static int nombreTableDisponible(String jour,String heure)
{        
  return 16-nombreTableReserve( jour, heure);
}
  
}
