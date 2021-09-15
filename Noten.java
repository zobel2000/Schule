import java.util.Scanner;
public class Noten
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    int Note = 0;
    
    System.out.println("Bitte die Note angeben.");
    
    Note = einlesen.nextInt();
    
    switch (Note)
    {
      case 1:
        System.out.println("Sehr gut");
        break;
      case 2:
        System.out.println("Gut");
        break;
      case 3:
        System.out.println("Befriedigend");
        break;
      case 4:
        System.out.println("Ausreichend");
        break;
      case 5:
        System.out.println("Mangelhaft");
        break;
      case 6:
        System.out.println("Ungenügend");
        break;
      default:
        System.out.println("Bitte richtige Note angeben!");
      }
  }  
}    
