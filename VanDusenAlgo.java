import java.util.Scanner;
public class VanDusenAlgo
{
  public static void main (String[] args)
  {
    Scanner x = new Scanner(System.in);
    
    int a = x.nextInt(), z;
    
    final int WICHTIGE_KONSTANTE_FUER_DIE_FORMEL = 8;
    
    System.out.println("Bitte geben Sie eine Zahl ein: ");
    
    
    if (a < 0)
    {
      System.out.println("Keine Garantie bei negativen Zahlen!");
    }
    
    z = a * a + WICHTIGE_KONSTANTE_FUER_DIE_FORMEL * a + 7;
    
    System.out.print("Das Ergebnis der Verarbeitung ist: ");
    
    System.out.println(z);
  }
}      
