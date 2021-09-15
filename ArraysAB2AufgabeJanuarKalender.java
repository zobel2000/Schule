import java.util.Scanner;
public class ArraysAB2AufgabeJanuarKalender
{
  public static void main (String[] args)
  {
    int[][] Kalender = {{1,2,3,4,5},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
    
    for (int a = 0; a < Kalender.length; a++) 
    {
      for (int b = 0; b < Kalender[a].length; b++) 
      {
        System.out.println(a + 1 + "_" + b + ": " + Kalender[a][b]);
        System.out.println("");
        
        //System.out.println("Tag: " + (a + 1) + ",Stunde: " + (b + 1));
      } 
    }
  }
}    
