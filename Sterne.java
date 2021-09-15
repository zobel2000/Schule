import java.util.Scanner;
public class Sterne
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);

    String z = "#";
    for (int c = 1; c < 50; c++) 
    {
      System.out.println(z);
      z = z + ".#";
    }
  }
}
