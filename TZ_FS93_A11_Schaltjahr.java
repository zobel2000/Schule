import java.util.Scanner;
public class TZ_FS93_A11_Schaltjahr
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    int jahr = 0;
    
    System.out.println("Bitte eine Jahreszahl eingeben.");
    
    jahr = einlesen.nextInt();
    
    if (jahr <= 1582)
    {
      if (jahr % 4 == 0)
      {
      System.out.println("Schaltjahr");
      }
      if (jahr % 4 != 0)
      {
      System.out.println("kein Schaltjahr");  
      }
    }
    if (jahr > 1582)
    {
      if (jahr % 400 == 0)
      {
        if (jahr % 100 == 0)
        {
          if (jahr % 4 == 0)
          {
          System.out.println("Schaltjahr");
          }
          if (jahr % 4 != 0)
          {
          System.out.println("kein Schaltjahr");
          }
        }
        if (jahr % 100 != 0)
        {
          if (jahr % 4 == 0)
          {
          System.out.println("Schaltjahr");
          }
          if (jahr % 4 != 0)
          {
          System.out.println("kein Schaltjahr");
          }
        }        
      }  
      if (jahr % 400 != 0)
      {
        if (jahr % 100 == 0)
        {
          if (jahr % 4 == 0)
          {
          System.out.println("Schaltjahr");
          }
          if (jahr % 4 != 0)
          {
          System.out.println("kein Schaltjahr");
          }
        }
        if (jahr % 100 != 0)
        {
          if (jahr % 4 == 0)
          {
          System.out.println("Schaltjahr");
          }
          if (jahr % 4 != 0)
          {
          System.out.println("kein Schaltjahr");
          }
        }
      }
    }
  }
}
         
        
          
      
