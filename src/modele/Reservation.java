

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


public class Reservation 
{
   public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
public static  void ajouter(String jour,String heure,int nbPersonne,int nbTable,String cin)
{
    	try
   	{
   	String r="insert into reservation  VALUES (?,?,?,?,?,?);";
	PreparedStatement ps = con.getC().prepareStatement(r);
        ps.setString(1, null);
	ps.setString(2, jour);
        ps.setString(3, heure);
        ps.setInt(4, nbTable );
        ps.setInt(5, nbPersonne);
        ps.setString(6, cin);
        ps.executeUpdate();
        
   	}
   	catch(Exception e)
    	{ 
   	   
	}
         
}
public static  int dernierReservation()
{int nb=0;
    	try
   	{
   	String req="select max(num) from reservation ";
	ResultSet r = con.getS().executeQuery(req);
        r.next();
        nb=r.getInt(1);
        
   	}
   	catch(Exception e)
    	{ 
   	    
	}
     return nb;    
}
public static  boolean estReservation(int num)
{int nb=0;
    	try
   	{
   	String req="select count(num) from reservation where num="+num;
	ResultSet r = con.getS().executeQuery(req);
        r.next();
        nb=r.getInt(1);
        
            
   	}
   	catch(Exception e)
    	{ 
   	    
	}
        if(nb==0) return false;
         return true;    
}
//------------------------------------------------------------------------------
public static DefaultTableModel afficher()
{  
      
       String[] col={"Num Reservation","Date","Heure","Nombre Personne","Nombre Table","Etat","Cin"};
       String[][] row;
       DefaultTableModel m;
       ResultSet  r;
       
       
       int num;
       String date;
       String heure;
       int nbPersonne;
       int nbTable;
       String etat;
       String cin;
       row=null;
       m=new DefaultTableModel(row,col);
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM reservation ");
        while(r.next())
   	{
        num = r.getInt(1);
	date=r.getString(2);
	heure=r.getString(3);
        nbPersonne=r.getInt(4);
        nbTable=r.getInt(5);
        etat=r.getString(6);
        cin=r.getString(7);
        
        Object[] tab ={num,date,heure,nbPersonne,nbTable,etat,cin};
        m.addRow(tab);
   	} 
        }
   	catch(Exception e)
        { 
            
        }
        return m;
}
//------------------------------------------------------------------------------
public static String[] afficher(int num)   
{  
    
       ResultSet  r;
       String[] tab=new String[9] ; 
        
        try
   	{
   	r= con.getS().executeQuery("SELECT * FROM reservation,client where reservation.cin=client.cin and num="+num );
        r.next();
   	
        tab[0] = r.getInt(1)+"";
	tab[1]=r.getString(2);
	tab[2]=r.getString(3);
        tab[3]=r.getInt(4)+"";
        tab[4]=r.getInt(5)+"";
        tab[5]=r.getString(6);
        tab[6]=r.getString(8)+" "+r.getString(9);
        tab[7]=r.getString(10);
        
         
        }
   	catch(Exception e)
        { 
            new Message("Receptionniste", "Format Incorrecte");
	   
        }
        return tab;
}
public static int nombreReservation()
    {  
       ResultSet r;
        int nb=0;
        try
   	{
            r= con.getS().executeQuery("SELECT count(*) FROM reservation");
            r.next();
            nb=r.getInt(1);
       } 
        
       catch(Exception e){}
       return nb;
    } 

public static void supprimerReservationNonRespacte()   
{  
    
          ResultSet  r;
          int num;
          int jour;
          int heure;
          Vector v=new Vector();
          int jourSystem=Date.from(Instant.now()).getDay();
          int heureSystem=Date.from(Instant.now()).getHours();
          int minuteSystem=Date.from(Instant.now()).getMinutes();
        try
   	{
   	r= con.getS().executeQuery("SELECT num,jour,heure FROM reservation  " );
        while(r.next())
        {
                num = r.getInt(1);
                jour=Verif.numeroJour(r.getString(2));
                heure=Integer.parseInt(r.getString(3).substring(0, 2));

                
                if(jourSystem==0)
                {
                  if(jour>jourSystem) v.add(num);
                  else if(jour==jourSystem&&heureSystem>heure)  v.add(num);
                  else if(jour==jourSystem&&heureSystem==heure&&minuteSystem>30)  v.add(num);
                }
                else
                {
                   if(jour<jourSystem)  v.add(num);
                   else if(jour==jourSystem&&heureSystem>heure)  v.add(num);
                   else if(jour==jourSystem&&heureSystem==heure&&minuteSystem>30)  v.add(num);
                }

        } 
        
        for(int i=0;i<v.size();i++)
        {
            TableClient.supprimer((Integer)v.elementAt(i));
            supprimer((Integer)v.elementAt(i));
        }
        }
   	catch(Exception e)
        { 
            new Message("Erreur", e.getMessage());
	   
        }
        
}
//------------------------------------------------------------------------------
public static void  supprimer(int numReservation)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("delete from reservation  where num="+numReservation+" ;");
  	}
  	catch(Exception e)
    	{ 
            new view.Message("ERROR", "Suppression de Reservation");
            System.out.print(e.getMessage());
            
	   
	}
    }
//------------------------------------------------------------------------------

}
