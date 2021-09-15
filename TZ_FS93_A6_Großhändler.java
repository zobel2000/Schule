import java.util.Scanner;
public class TZ_FS93_A6_Großhändler
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    double Bestellwert = 0 , Rabatt = 0;
    
    System.out.println("Bitte Bestellwert angeben:  ");
    
    Bestellwert = einlesen.nextDouble();  
    
    if (Bestellwert >= 0 && Bestellwert <= 100){
      System.out.println("Sie bekommen 10% Rabatt.");
      
      System.out.println("Und müssen nur noch " + (Bestellwert - (0.1 * Bestellwert))  + " Euro bezahlen.");}
    
    else if (Bestellwert > 100 && Bestellwert <= 500){
      System.out.println("Sie bekommen 15% Rabatt.");
      
      System.out.println("Und müssen nur noch " + (Bestellwert - (0.15 * Bestellwert)) + " Euro bezahlen.");}
    
    else if (Bestellwert > 500){
      System.out.println("Sie bekommen 20% Rabatt.");
      
      System.out.println("Und müssen nur noch " + (Bestellwert - (0.2 * Bestellwert)) + " Euro bezahlen.");}
    
    if (Bestellwert < 0){
      System.out.println("Bitte positiven Bestellwert eingeben");}
  }
}   
