import java.util.Scanner;
public class TZ_FS93_SchleifenArbeitsblatt
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    /*Aufgabe1*/
    for (int i = 1; i < 10; i++)
    {
      if (i == 1) continue;
      System.out.println(i);        
    }
    
    
    
    System.out.println("Zahl 1: ");
    int zahl1 = einlesen.nextInt();
    
    System.out.println("Zahl 2: ");
    int zahl2 = einlesen.nextInt();
    
    System.out.println();
    
    while (zahl1 < zahl2)
    {
      zahl1++;
      if (zahl1 == zahl2) break;
      System.out.println(zahl1);   
    }
    
    
    
    int a = 0;
    while (a < 4)
    {
      a++;
      if (a == 2) continue;
      System.out.println(a);
    }
    
    
    
    /*Aufgabe2-Sterne*/
    String z = "*";
    for (int c = 1; c < 100; c++) 
    {
      System.out.println(z);
      z = z + "*";
    }
    
    
    
    /*Aufgabe3*/
    for (int b = 0; b <= 20; b++)
    {
      if (b % 2 != 0) continue;
      System.out.println(b);
    } 
    
    
    
    /*Aufgabe3 - PhilsVariante*/
    System.out.println("Wert 1:");
    int wert1 = einlesen.nextInt();
    
    System.out.println("Wert 2:");
    int wert2 = einlesen.nextInt();
    
    System.out.println();

    while (wert1 < wert2)
    {
      if (wert1 % 2 == 0) wert1 = wert1 + 1;
      System.out.println(wert1);
      wert1++;
      
      if (wert1 % 2 == 1)
      System.out.println(wert1);
      wert1++;
      
      if (wert1 == wert2) break;
    }
    
    
    
    /*Aufgabe9-3Werte*/
    System.out.println("Zahl 1: ");
    int y = einlesen.nextInt();
    
    System.out.println("Zahl 2: ");
    int x = einlesen.nextInt();
    
    System.out.println();
    
    System.out.println("(1)Quadratzahl, (2)Kubikzahl, (3)Kehrwert");
    System.out.println("(1) " + y*y + " " + "(2) " + y*y*y + " " + "(3) " + 1.0/ y);
    System.out.println("(1) " + x*x + " " + "(2) " + x*x*x + " " + "(3) " + 1.0/ x);
    
  }
}              
  
    
