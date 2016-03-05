

package modele;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


import view.Message;


public class TableClient 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(int numReservation,int numTable)
{
    	try
   	{
   	String r="insert into tableclient  VALUES (?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
        ps.setInt(1, numReservation);
	ps.setInt(2, numTable);
        ps.executeUpdate();
        }
   	catch(Exception e)
    	{ 
          new Message("ERROR", "Ajouter Table Client");
   	}
}
//------------------------------------------------------------------------------
public static  void ajouter(int numReservation,int[] numTable)
{
    	for(int i=0;i<numTable.length;i++)
        {
          ajouter( numReservation, numTable[i]);
        }
}
public static  void ajouter(int numReservation,Vector v)
{
    	for(int i=0;i<v.size();i++)
        {
          ajouter( numReservation,(Integer)v.elementAt(i));
        }
}
//------------------------------------------------------------------------------
public static int[] TablesDeReservation (int num)
{
   int nb=nombreTablesDeReservation(num);
   int[] tab=new int[nb];
   int i=0;
    try
     {
      String s="SELECT numTable FROM tableclient where  numReservation="+num ;
     ResultSet r=con.getS().executeQuery(s);
     while(r.next())
     {
       
       tab[i]=r.getInt(1);
       i++;
      
      }
     }
     catch(Exception e)
     {
            new Message("ERROR", "TablesDeReservation");
            System.out.print(e.getMessage());
     }
    return tab;
}
//------------------------------------------------------------------------------
   
public static void  supprimer(int numReservation)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from tableclient  where numReservation="+numReservation+" ;");
  	}
  	catch(Exception e)
    	{ 
            new view.Message("ERROR", "Suppression de Reservation");
	   System.out.print(e.getMessage());
	}
    }
//------------------------------------------------------------------------------
public static int nombreTablesDeReservation (int num)
{
   int nb=0;
   
    try
     {
      String s="SELECT count(numTable) FROM tableclient where numReservation="+num ;
      ResultSet r=con.getS().executeQuery(s);
      r.next();
      nb=r.getInt(1);
     
     }
     catch(Exception e)
     {
            JOptionPane jop = new JOptionPane();
	    showMessageDialog( null,"TableOccupe");
     }
    return nb;
}
}
