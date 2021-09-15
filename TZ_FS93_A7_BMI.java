import java.util.Scanner;
public class TZ_FS93_A7_BMI
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    double Gewicht = 0 , Größe = 0 , G = 0, BMI = 0;
    
    System.out.println("Bitte Ihr Gewicht in kg angeben.");
    Gewicht = einlesen.nextDouble();
    
    System.out.println("Bitte Ihre Größe in m angeben.");
    Größe = einlesen.nextDouble();
    
    System.out.println("Bitte Geschlecht angeben: 1 für Männlich, 2 für Weiblich");
    G = einlesen.nextDouble();
    
    BMI = Gewicht / (Größe * Größe);
    System.out.println("Ihr BMI beträgt:  " + BMI);
    
    if (G == 1)
    {
      if (BMI < 20)
      {
        System.out.println("Untergewicht");
      }
      if (BMI > 25)
      {
        System.out.println("Übergewicht");
      }
      else 
      {
        System.out.println("Normalgewicht");
      }  
    }  
    if (G == 2)
    {
      if (BMI < 19)
      {
        System.out.println("Untergewicht");
      }
      if (BMI > 24)
      {
        System.out.println("Übergewicht");
      }
      else
      {
        System.out.println("Normalgewicht");
      }
    }
    if (G > 2)
    {
      System.out.println("Ungültiges Geshlecht");
    }  
  }
}    
