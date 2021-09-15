import java.util.Scanner;
public class TimZobel_FS93_Lernsituation4_Prüfziffer
{
  public static void main(String[] args) 
  {
    Scanner einlesen = new Scanner (System.in);
    
    long[] prüfziffern = {};
    prüfziffern = new long[12];
    
    long[] prüfziffernReverse = {};
    prüfziffernReverse = new long[12];
    
    long zwischenGerade = 0;
    
    long zwischenGerade1 = 0;
    
    long zwischenUngerade = 0;
    
    long zwischenUngerade1 = 0;
    
    long zwischen = 0;       
    
    int k = 0;
    
    int ziffer = 0;
  
    long testZahl = einlesen.nextLong();
  
    int nummer = 0;
    while (testZahl / Math.pow( 10, nummer) > 1) {
      nummer++;
      
    } // end of while
    for (int j = nummer - 1; j >= 0; j--) {
      //System.out.println( (int) (testZahl / Math.pow(10, j) % 10));
      ziffer = (int) (testZahl / Math.pow(10, j) % 10);
   
      prüfziffern[j] = ziffer;
      
      System.out.println(prüfziffern[j]);
    
    } // end of for
    
    System.out.println("Ausgabe Array komplett");
   
    String prüfziffernString = java.util.Arrays.toString(prüfziffern);
    
    System.out.println(prüfziffernString);
   
    System.out.println("Ausgabe der einzelnen Ziffern");
    
     for (k = 0; k < prüfziffern.length ; k++ ) {
      System.out.println(prüfziffern[k]);
      
    } // end of for      
    
    System.out.println("Ausgabe der einzelnen Ziffern in Reverse Order");
    
    for (k = prüfziffern.length - 1; k >= 0 ; k-- ) {
      
      System.out.println(prüfziffern[k]);
      prüfziffernReverse[k] = prüfziffern[k]; 
    } // end of for
    
    System.out.println("last test");
     for (k = 0; k < prüfziffern.length ; k++ ) {
      System.out.println(prüfziffern[k]);
      
    } // end of for                                                         
      
    System.out.println("");
    System.out.println("");
    
    System.out.println("Array Reverse abspeichern");
     
        int j = prüfziffern.length; 
        for (int i = 0; i < prüfziffern.length; i++) { 
            prüfziffernReverse[j - 1] = prüfziffern[i]; 
            j = j - 1; 
        }
    
            System.out.println("Reversed array is: \n"); 
        for ( k = 0; k < prüfziffern.length; k++) {      
      if (k % 2 == 1) {
        zwischenGerade1 = prüfziffernReverse[k] * 3;
        zwischenGerade = zwischenGerade + zwischenGerade1;
        System.out.println(zwischenGerade1);
      } // end of if     
      if (k % 2 != 1) {
        zwischenUngerade1 = prüfziffernReverse[k] * 1;
        zwischenUngerade = zwischenUngerade + zwischenUngerade1;
        System.out.println(zwischenUngerade1);
      } // end of if
        } 
  
    System.out.println("");
      
    System.out.println(zwischenGerade);
    System.out.println(zwischenUngerade);
    
    long zwischenGesamt = zwischenGerade + zwischenUngerade;
    
    System.out.println("");
    
    System.out.println(zwischenGesamt);

    System.out.println("");
    System.out.println("");
    
    zwischenGesamt = zwischenGesamt % 10;
    
    System.out.println(10 - zwischenGesamt);
    
    zwischenGesamt = 10 - zwischenGesamt;
    
    System.out.println("Programm");
    
    System.out.println("");
    System.out.println("");
    System.out.println("Eingegebene Zahl am Anfang: " + testZahl);
   
    String testZahlErgebnis = "";
    
  
    System.out.println("Die gesuchte Prüfnummer lautet: " + zwischenGesamt);
    
    System.out.println("");
    System.out.println("");
    System.out.println("Der komplette EAN13 Code lautet also: " + String.valueOf(testZahl) + String.valueOf(zwischenGesamt));
    }
 }
