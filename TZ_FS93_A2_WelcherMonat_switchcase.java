import java.util.Scanner;
public class TZ_FS93_A2_WelcherMonat_switchcase
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    int zahl = 0;
    
    System.out.println("Zahl zwischen 1 und 12 Eingeben:  ");
    
    zahl = einlesen.nextInt();
    
    switch (zahl){
      case 1:  
        System.out.println("Januar mit 31 Tagen");
        break;
        
      case 2:
        System.out.println("Februar mit 28 Tagen");
        break;
        
      case 3:
        System.out.println("März mit 31 Tagen");
        break;
        
      case 4:
        System.out.println("April mit 30 Tagen");
        break;
        
      case 5:
        System.out.println("Mai mit 31 Tagen");
        break;
        
      case 6:
        System.out.println("Juni mit 30 Tagen");
        break;
        
      case 7:
        System.out.println("Juli mit 31 Tagen");
        break;
        
      case 8:
        System.out.println("August mit 31 Tagen");
        break;
        
      case 9:
        System.out.println("September mit 30 Tagen");
        break;
        
      case 10:
        System.out.println("Oktober mit 31 Tagen");
        break;
        
      case 11:
        System.out.println("November mit 30 Tagen");
        break;
        
      case 12:
        System.out.println("Dezember mit 31 Tagen");
        break;
        
      default:
        System.out.println("Bitte eine Zahl zwischen 1 und 12 eintragen!");
    }           
  }                    
}

     
