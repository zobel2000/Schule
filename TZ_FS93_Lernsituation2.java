import java.util.Scanner;
public class TZ_FS93_Lernsituation2
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    int i = 1; 
    boolean Prim = true; 
      while (i < 100){
        for (int j = 2; j < i-1; j++)
        {  
          if (i%j == 0)
          {            
          Prim = false;
          }
        }
        if (Prim)
        {
        System.out.println(i);
        }
        else
        {
        Prim = true;
        }
      i++;
    }
  }
}
