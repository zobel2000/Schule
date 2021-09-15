import java.util.Scanner;
public class Arrays
{
  public static void main (String[] args)
  {
    int[] zahlen = {1,6,3,7,2,2,4,8};
    //              0 1 2 3 4 5 6 7
    for (int i=0; i<zahlen.length; i++) 
    {
      System.out.println(i + 1 + ". Zahl:      \t" + zahlen[i]);
    }     
  }
}       
