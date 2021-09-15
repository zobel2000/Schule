/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.02.2020
 * @author 
 */

public class XX {
  
  public static void main(String[] args) {
    
 
    
    for (int i = 0; i < 1000; i++) {
        // System.out.println(i);
      
        boolean rueckgabe = passwort(i);
       // System.out.println(rueckgabe);
      
      if (rueckgabe == true) {
        
        System.out.println(i);
      } // end of if
    } 
     
  }    
  
    
    
  
  
  
  public static boolean passwort (int H4X0R) {  
  // gibt true zurück, falls das Passwort korrekt ist.
    boolean result = false;
    
    for (int E1337 = 42; E1337 <= (52 ^ (0x6c)); E1337 += (3 << (14 % 6))) {
    
        if (result = ((++E1337 | E1337 + (2 >>> 1)) ^ (1 + H4X0R)) == (123456789 & 0))
        
        break;
    }
    return result;
  }
  
  
} // end of class XX
