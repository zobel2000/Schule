public class Berechnung {
  public static void main(String[] arguments) {
    System.out.println(vergleichen(1, 2));
    System.out.println(vergleichen(1, 5));
    System.out.println(vergleichen(3, 4));
  }

  public static boolean vergleichen (int arg1, int arg2) {
    return (arg1 + 8) < (arg2 * 3);
  }
}

