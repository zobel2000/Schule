import java.util.Scanner;
public class TimZobel_FS93_Lernsituation_4_Prüfziffer_Test 
{
  public static void main(String[] args) 
  {  
    Scanner einlesen = new Scanner(System.in);
    
    double a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0;
    
    System.out.println("Bitte die 1. Zahl des EAN-Code eingeben: ");
    a = einlesen.nextInt();
    
    System.out.println("Bitte die 2. Zahl des EAN-Code eingeben: ");
    b = einlesen.nextInt();
    
    System.out.println("Bitte die 3. Zahl des EAN-Code eingeben: ");
    c = einlesen.nextInt();
    
    System.out.println("Bitte die 4. Zahl des EAN-Code eingeben: ");
    d = einlesen.nextInt();
    
    System.out.println("Bitte die 5. Zahl des EAN-Code eingeben: ");
    e = einlesen.nextInt();
    
    System.out.println("Bitte die 6. Zahl des EAN-Code eingeben: ");
    f = einlesen.nextInt();
    
    System.out.println("Bitte die 7. Zahl des EAN-Code eingeben: ");
    g = einlesen.nextInt();
    
    System.out.println("Bitte die 8. Zahl des EAN-Code eingeben: ");
    h = einlesen.nextInt(); 
                                                
    System.out.println("Bitte die 9. Zahl des EAN-Code eingeben: ");
    i = einlesen.nextInt();
    
    System.out.println("Bitte die 10. Zahl des EAN-Code eingeben: ");
    j = einlesen.nextInt();
    
    System.out.println("Bitte die 11. Zahl des EAN-Code eingeben: ");
    k = einlesen.nextInt();
    
    System.out.println("Bitte die 12. Zahl des EAN-Code eingeben: ");
    l = einlesen.nextInt(); 
    
    b = b*3;
    d = d*3;
    f = f*3;
    h = h*3;
    j = j*3;
    l = l*3;
    
    double z = a + b + c + d + e + f + g + h + i + j + k + l;
    
    double y = z % 10;
    
    double x = 10 - y;
    
    System.out.println("");
    System.out.println("Die Prüfziffer beträgt: " + x);
  }    
}  
    
