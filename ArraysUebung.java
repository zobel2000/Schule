import java.util.Scanner;
public class ArraysUebung
{
  public static void main (String[] args)
  {
    int[] meinArray;
    
    meinArray = new int[101];
    
    for (int b = 1; b < 101; b++)
    {
      meinArray[b]=b;
    }
    
    for (int i = 1; i < meinArray.length; i++)
    {
      System.out.println(i+")\t"+ meinArray[i]);
    }      
    
  }
}  

