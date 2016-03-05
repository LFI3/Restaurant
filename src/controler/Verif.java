
package controler;

import java.time.Instant;
import java.util.Date;


public class Verif 
{
    
    public static boolean estPlein(String[] tab)
    {
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i].equals("")) return false;
        }
        return true;
    }
      public static boolean verifCinTel(String ch)
     {
        if(ch.length()==8)
        {
            return verifEntier( ch);
        }
        return false;
    }
       public static boolean verifEntier(String ch)
     {
       
                    for(int i=0;i<ch.length();i++)
                {
                    if(ch.charAt(i)>'9'||ch.charAt(i)<'0') return false;
                }
                return true;
       
    }
     public static boolean cestAujourdhuit(String ch)
     {
        int n=Date.from(Instant.now()).getDay();
        String jour="";
        switch(n)
        {
            case 1:jour="Lundi" ;break;
                case 2:jour="Mardi" ;break;
                  case 3:jour="Mercredi" ;break;
                      case 4:jour="Jeudi" ;break;
                          case 5:jour="Vendredi" ;break;
                              case 6:jour="Samedi" ;break;
                                  case 0:jour="Dimanche" ;break;
        
        
        }    
        if(ch.equals(jour)) return true;   
        return false;    
    }
     public static int numeroJour(String jour)
     {
     
        
            if( jour.equals("Lundi"))return 1 ;
            else if( jour.equals("Mardi"))return 2 ;
            else if( jour.equals("Mercredi"))return 3 ;
            else if( jour.equals("Jeudi"))return 4 ;
            else if( jour.equals("Vendredi"))return 5 ;
            else if( jour.equals("Samedi"))return 6 ;
            else return 0 ;
    }
     public static boolean cestMaintenant(String ch)
     {
        int heureSystem=Date.from(Instant.now()).getHours();
        int heureClient=Integer.parseInt(ch.charAt(0)+""+ch.charAt(1));
        
        if((heureSystem==heureClient)||(heureSystem+1==heureClient)) return true;   
        return false;    
            
      
    }
     public static boolean existe(int[] tab ,int n)
     {
        for(int i=0;i<tab.length;i++)
        {
        if(tab[i]==n) return true;
        }
        return false;
     }
     public static void afficher(int[] tab )
     {
        for(int i=0;i<tab.length;i++)
        {
          System.out.print(tab[i]+" ");
        }
         System.out.println();
     }
     public static boolean t1danst2(int[] t1,int[] t2 )
     {int nb=0;
        for(int i=0;i<t1.length;i++)
        {
         for(int j=0;j<t2.length;j++)
        {
            if(t1[i]==t2[j])
            {
                nb ++; 
            }
        }
        }
         if(nb==t1.length)
             return true;
            return false;
     }
     
     public static void main(String[] args)
     {
     
        
        System.out.println(modele.Table.nombreTableOccupe());
     }
     
     
}
