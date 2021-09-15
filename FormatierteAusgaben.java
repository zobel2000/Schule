import java.util.Scanner;
public class FormatierteAusgaben
{
  public static void main (String[] args)
  {
    System.out.printf("Hallo");
    
    System.out.printf("Hallo %s, %s und %s", "Ole", "Oke", "Len");
    
    System.out.printf("Hallo %S und %S", "Ole", "Ella");
    
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println();
    
    System.out.printf("Hallo %d", 44);
    
    System.out.printf("Hallo %6d", 44);
    
    System.out.printf("Hallo %1d", 44);
    
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println();
    
    System.out.printf("Hallo %f", 44.43534);
    
    System.out.printf("Hallo %10.2f", 44.43534);
    
    System.out.printf("Hallo %2.3f", 44.43534);
    
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println();
                                                     
    System.out.printf("%10.2f EUR\n", 111.2222);
    System.out.printf("%10.2f EUR\n", 4.0);
    System.out.printf("%10.2f EUR\n", 1000000.55);
    System.out.printf("%10.2f EER\n", 97.34);
    
    
  }
}    
