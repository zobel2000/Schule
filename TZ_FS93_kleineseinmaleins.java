import java.util.Scanner;
public class TZ_FS93_kleineseinmaleins
{
  public static void main (String[] args)
  {
    int zahl1 = 0;
    int zahl2 = 0;
       
    while(zahl1 <10) 
    {
      zahl1 = zahl1 +1;
      zahl2 = 0;
      while (zahl2 <10)
      {
        zahl2 = zahl2 +1;
        System.out.print("  "+zahl1*zahl2);
      }
      System.out.println();
    }
  }
}      
          
