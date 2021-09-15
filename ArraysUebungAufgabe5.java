import java.util.Scanner;
public class ArraysUebungAufgabe5
{
  public static void main (String[] args)
  {
    int[] werteA = {9, 3, 1, 7, 2};
    int[] werteB = {2, 6, 4, 8, 1};
    
    int gesuchteZahl = 0;
    
    System.out.println("Reihe A: ");
    for (int q = 0; q < werteA.length; q++)
    {
      System.out.print(werteA[q] + ", ");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Reihe B: ");
    for (int w = 0; w < werteB.length; w++)
    {
      System.out.print(werteB[w] + ", ");
    }              
    System.out.println("");
    System.out.println("");
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Bitte eine Zahl eingeben: ");
    gesuchteZahl = scan.nextInt();
    
    System.out.println("");
    
    System.out.println("Reihe A:");
    for (int a = 0; a < werteA.length; a++) 
    {
      if (gesuchteZahl == werteA[a]) 
      {
        
        System.out.println("");
        System.out.println("Zahl in Reihe A gefunden an Stelle: " + (a+1) + " bzw. auf dem Index: " + a);
        
      }
      else 
      {
        
        System.out.println("");
        System.out.println("Zahl nicht an Stelle: " + (a+1) + " bzw. auf dem Index: " + a + " Gefunden.");
        
      }  
    } 
    
    System.out.println("");
    System.out.println("");
    
    System.out.println("Reihe B:");
    for (int b = 0; b < werteB.length; b++) 
    {
      if (gesuchteZahl == werteB[b]) 
      {
        
        System.out.println("");
        System.out.println("Zahl in Reihe B gefunden an Stelle: " + (b+1) + " bzw. auf dem Index: " + b);
        
      } 
      else 
      {
        
        System.out.println("");
        System.out.println("Zahl nicht an Stelle: " + (b+1) + " bzw. auf dem Index: " + b + " Gefunden.");
        
      } 
    } 
  }   
}
  
                  
