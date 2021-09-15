import java.util.Scanner;
public class TZ_FS93_A1_WelcherMonat_ifelse
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    int zahl = 0;
    
    System.out.println("Zahl zwischen 1 und 12 Eingeben:  ");
    
    zahl = einlesen.nextInt();
    
    if (zahl == 1){
      System.out.println("Januar mit 31 Tagen");}
    
    if (zahl == 2){
      System.out.println("Februar mit 28 Tagen");}
    
    if (zahl == 3){
      System.out.println("Mai mit 31 Tagen");}
    
    if (zahl == 4){
      System.out.println("April mit 30 Tagen");}
    
    if (zahl == 5){
      System.out.println("März mit 31 Tagen");}
    
    if (zahl == 6){
      System.out.println("Juni mit 30 Tagen");}
    
    if (zahl == 7){
      System.out.println("Juli mit 31 Tagen");}
    
    if (zahl == 8){
      System.out.println("August mit 31 Tagen");}
    
    if (zahl == 9){
      System.out.println("September mit 30 Tagen");}
    
    if (zahl == 10){
      System.out.println("Oktober mit 31 Tagen");}
    
    if (zahl == 11){
      System.out.println("November mit 30 Tagen");}
    
    if (zahl == 12){
      System.out.print("Dezember mit 31 Tagen");}
    
    if (zahl > 12){
      System.out.println("Die angegebene Zahl entspricht nicht den angeforderten Kriterien!");}
    
    if (zahl < 1){
      System.out.println("Die angegebene Zahl entspricht nicht den angeforderten Kriterien!");}                
  }                    
}

     
