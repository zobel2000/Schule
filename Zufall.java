import java.util.Random;
import java.util.Scanner;
public class Zufall 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
    int gesuchteZahl = 0;
    
    System.out.println(" ");
    System.out.println("Bitte eine Zahl eigeben: ");
    gesuchteZahl = scan.nextInt();
    System.out.println(" ");
    
    Random zufall = new Random(); // Objekt zufall vom Typ Random wird erstellt
    int ganzeZahl;
    for (int i = 0; i < 1000; i++)  
    {
      ganzeZahl = 1 + zufall.nextInt(1000); 
      System.out.println(i + 1 + ". ganze Zufallszahl:  \t" + ganzeZahl);
      
      if (gesuchteZahl == ganzeZahl) 
      {
        System.out.println("Zahl Gefunden!");
        System.out.println("An Position " + (i+1) + " bzw. auf Index: " + i);
        return;
      }
    }  
    
    System.out.println("Zahl nicht Gefunden!"); 
  }
}  
