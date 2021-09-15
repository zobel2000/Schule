import java.util.Scanner;
public class TZ_FS93_A01
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    for (int a = 1; a <= 20; a++)
    {
      System.out.print(" " + a);
    } 
    
    System.out.println();
    System.out.println();
    
    for (int b = 100; b >= 1; b--)
    {
      System.out.print(" " + b);
    }
    
    System.out.println();
    System.out.println();
    
    int g = 100;
    while (g >= 1)
    {
      System.out.print(" " + g);
      g--;
    }    
    
    System.out.println();
    System.out.println();
    
    for (int c = 1; c <= 80; c++)
    {
      if (c % 2 != 0) continue;
      System.out.print(" " + c);
    }  
    
    System.out.println();
    System.out.println();
    
    for (int d = 1; d <= 10; d++)
    {
      System.out.print(d * d);
    }              
  }
}      
