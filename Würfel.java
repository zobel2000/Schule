import java.util.Random;
import java.util.Scanner;
public class Würfel 
{
  public static void main(String[] args) 
  {
    Random zufall = new Random();
    int Würfel;
    for (int i = 0; i < 1000; i++) 
    {
      Würfel = 1 + zufall.nextInt(6);
      System.out.println(i + 1 + ". Wurf: " + Würfel);
    }
  }
}    
