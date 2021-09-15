import java.util.Scanner;
public class ArraysUebungAufgabe4
{
  public static void main (String[] args)
  { 
    Scanner scan = new Scanner(System.in);
  
    int gesuchteZahl = 0;
    
    int[] zahlenArray1 = {1,5,5,7,3,11,22,23,27};
    
    System.out.println("Bitte gesucht Zahl eingeben: ");
    gesuchteZahl = scan.nextInt();
    System.out.println(" ");
    
    for (int a=0; a<zahlenArray1.length; a++) 
    {
      System.out.println(a + 1 + ".Zahl\t" + zahlenArray1[a]);
    } 
    
    System.out.println("");
    
    for (int i = 0; i<zahlenArray1.length; i++) 
    {      
      if (gesuchteZahl == zahlenArray1[i]) {
        
        System.out.println("Ausgabe: Gefunden!");
        System.out.println("Gefunden an Stelle: " + (i+1) + " bzw. auf dem Index: " + i);
        return;
      }
    } 
             
    System.out.println("Ausgabe: Nicht gefunden!");
  }
}
        
  
        
      
