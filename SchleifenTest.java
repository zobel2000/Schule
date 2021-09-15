import java.util.Scanner;
public class SchleifenTest
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    //Zählschleife 
    for (int i = 0; i <= 300; i++)
    {
      System.out.println(i);
    }
    
                            System.out.println();
                            System.out.println();
    
    //Kopfgesteuerte Schleife - while
    int c = 0;
    while (c <= 300)
    {
      System.out.println(c);
      c++;
    }
    
                            System.out.println();
                            System.out.println();
    
    //Kopfgesteuerte Schleife - while
    int a=0, b=600;
    while (a<300 && b>300)
    { 
      a++;
      b--;
      System.out.println("a: " + a + " " + "b: " + b);
    }
    
                             System.out.println();
                             System.out.println();
    
    //Kopfgesteuerte Scleife - break
    int h=0;
    while (true)
    {
      System.out.println(h);
      h++;
      if (h == 300) break;
    }
    
                             System.out.println();
                             System.out.println();
                                            
    //Kopfgesteuerte Schleife - continue
    int e = 0;
    while (e <= 300)
    {
      e++;
      if (e == 2) continue;
      System.out.println(e);
    }  
    
                            System.out.println();
                            System.out.println();
    
    //Fußgesteurte Schleife;
    int d = 0;
    do 
    {
      System.out.println(d);
      d++;
    }
    while (d <= 300);             
  }
}      
