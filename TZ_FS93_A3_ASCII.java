import java.util.Scanner;
public class TZ_FS93_A3_ASCII
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    int aufgabe = 0;
    
    System.out.println("Zahl zwischen 0 und 255 eingeben");
    
    aufgabe = einlesen.nextInt();
    
    char ascii = (char) aufgabe;
    
         
    if (aufgabe <= 255)
    {
      System.out.println("Die Zahl " + aufgabe + " enstpricht dem ASCII-Zeichen: " + ascii);
    }
    
    else if (aufgabe < 0)
    {
      System.out.println("Die Zahl " + aufgabe + " enstpricht dem ASCII_Zeichen: " + ascii);
    }
    
    else 
    {
      System.out.println("ERROR");
    }
  }
}              
