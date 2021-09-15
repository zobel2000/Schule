import java.util.Scanner;
public class Symbol
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    String a = "?";
    for (int b = 1; b <= 100; b++) 
    {
      System.out.print(b);      
      System.out.println(a);
      a = a + "?";
      System.out.println("");
    } 
  }
}    
