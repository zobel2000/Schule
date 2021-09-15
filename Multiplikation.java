import java.util.Scanner;
public class Multiplikation
{
  public static void main(String[] args) 
  {
    double zahl1 = 2.36;
    double zahl2 = 7.87; 
    
    double ergebnis =  multiplikation(zahl1, zahl2);
    
    System.out.println(ergebnis);    
  }
  
  public static double multiplikation(double a, double b) 
  {
    double gesamt = a*b;
    
    return gesamt;
  }
}    
