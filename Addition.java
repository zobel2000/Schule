import java.util.Scanner;

public class Addition {
   public static void main(String[] args) {
    double zahl1 = 0.0, zahl2 = 0.0, erg= 0.0;
    
        //Programmhinweise
    Programmhinweis();
    
    //Eingaben
    
    zahl1 = Eingabe1();
     
    zahl2 = Eingabe2();
        
    //Verarbeitung
    
    double ergebnis = Verarbeitung(zahl1, zahl2);
      
    
    // Ausgaben
    
    Ausgabe(ergebnis, zahl1, zahl2);
  
    }

  
  public static void Programmhinweis () {
    System.out.println(" Hinweis: ");
    System.out.println(" Das Programm addiert 2 eingegebene Zahlen. ");
    }
  
  
  
  //Eingabe
  
  public static double Eingabe1 () { 
    Scanner scan = new Scanner(System.in);
    System.out.println(" 1. Zahl: ");
    double zahl1 = scan.nextDouble();
    return zahl1;
    }
  public static double Eingabe2 () { 
    Scanner scan = new Scanner(System.in);
    System.out.println(" 2. Zahl: ");
    double zahl2 = scan.nextDouble(); 
    return zahl2;         
    }
  
  //3.Verarbeitung
  
  public static double Verarbeitung (double zahl1, double zahl2) {
  
    double erg = zahl1 + zahl2;
    
    return erg;
    }
  
  
  public static void Ausgabe(double ergebnis, double zahl1, double zahl2) {
    
     System.out.println(" Ergebnis der Addition ");
     System.out.println(ergebnis + " = " + zahl1 + " + " + zahl2);
    
    }
}
