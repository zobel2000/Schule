import java.util.Scanner;
public class TZ_FS93_Lernsituation1_kleines1x1
{
  public static void main (String[] args)
  {
    int zaehler1 = 0;
    int zaehler2 = 0;
    
    System.out.println("\t" + "Das kleine 1x1!");
    System.out.println();
        
    while(zaehler1 <10) 
    {
      zaehler1 = zaehler1 +1;
      zaehler2 = 0;
      while (zaehler2 <10)
      {
        zaehler2 = zaehler2 +1;
        System.out.print("\t"+zaehler1*zaehler2);
      }
      System.out.println();
    }
  }
}      
          
