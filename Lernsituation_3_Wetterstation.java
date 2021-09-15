import java.util.Scanner;
public class Lernsituation_3_Wetterstation 
{
  public static void main(String[] args) 
  {
    double zahl1 = -15.55, zahl2 = -2.55, zahl3 = -11.44, zahl4 = -8.6, zahl5 = -14.4, zahl6 = -5.17, zahl7 = 1.48;
    double zahl8 = -3.47, zahl9 = 2.00, zahl10 = 2.14, zahl11 = 4.05, zahl12 = 7.45, zahl13 = 3.25, zahl14 = 5.04;
    double zahl15 = 11.4, zahl16 = 7.67, zahl17 = 8.64, zahl18 = 13.28, zahl19 = 6.87, zahl20 = 15.54, zahl21 = 12.45;
    double zahl22 = 16.55, zahl23 = 20.42, zahl24 = 22.38, zahl25 = 19.58, zahl26 = 18.85, zahl27 = 23.84, zahl28 = 24.42;
    double zahl29 = 25.54, zahl30 = 28.35, zahl31 = 30.16, zahl32 = 32.44, zahl33 = 26.55, zahl34 = 22.13, zahl35 = 16.64;
    double zahl36 = 13.33, zahl37 = 16.45, zahl38 = 17.34, zahl39 = 15.33, zahl40 = 11.13, zahl41 = 15.16, zahl42 = 11.44;
    double zahl43 = 6.55, zahl44 = 2.13, zahl45 = 6.64, zahl46 = 3.33, zahl47 = 6.45, zahl48 = -1.34, zahl49 = 5.33, zahl50 = -11.15;
    
    System.out.println("Die Temperaturen liegen bei: " + zahl1 +", "+ zahl2 +", "+ zahl3 +", "+ zahl4 +", "+ zahl5 +", "+ zahl6 +", "+ zahl7 +", "+ zahl8 +", "+ zahl9 +", "+ zahl10 +", "+ zahl11 +", "+ zahl12 +", "+ zahl13 +", "+ zahl14 +", "+ zahl15 +", "+ zahl16 +", "+ zahl17 +", "+ zahl18 +", "+ zahl19 +", "+ zahl20 +", "+ zahl21 +", "+ zahl22 +", "+ zahl23 +", "+ zahl24 +", "+ zahl25 +", "+ zahl26 +", "+ zahl27 +", "+ zahl28 +", "+ zahl29 +", "+ zahl30 +", "+ zahl31 +", "+ zahl32 +", "+ zahl33 +", "+ zahl34 +", "+ zahl35 +", "+ zahl36 +", "+ zahl37 +", "+ zahl38 +", "+ zahl39 +", "+ zahl40 +", "+ zahl41 +", "+ zahl42 +", "+ zahl43 +", "+ zahl44 +", "+ zahl45 +", "+ zahl46 +", "+ zahl47 +", "+ zahl48 +", "+ zahl49 +", "+ zahl50 + " Grad!");
    System.out.println("");
    
    //Durchschnitttemperatur
    
    double Summe = zahl1 + zahl2 + zahl3 + zahl4 + zahl5 + zahl6 + zahl7 + zahl8 + zahl9 + zahl10 + zahl11 + zahl12 + zahl13 + zahl14 + zahl15 + zahl16 + zahl17 + zahl18 + zahl19 + zahl20 + zahl21 + zahl22 + zahl23 + zahl24 + zahl25 + zahl26 + zahl27 + zahl28 + zahl29 + zahl30 + zahl31 + zahl32 + zahl33 + zahl34 + zahl35 + zahl36 + zahl37 + zahl38 + zahl39 + zahl40 + zahl41 + zahl42 + zahl43 + zahl44 + zahl45 + zahl46 + zahl47 + zahl48 + zahl49 + zahl50;
    
    double AZ = 50;
    
    double DT = Summe / AZ;
    
    System.out.println("Die Durchschnittstemperatur beträgt " + DT + " Grad");
    System.out.println("");
    
    //Höchsttemperatur/Tiefsttemperatur
    
    System.out.println("Die höchste Temperatur liegt bei: " + Math.max(zahl1, Math.max(zahl2, Math.max(zahl3, Math.max(zahl4, Math.max(zahl5, Math.max(zahl6, Math.max(zahl7, Math.max(zahl8, Math.max(zahl9, Math.max(zahl10, Math.max(zahl11, Math.max(zahl12, Math.max(zahl13, Math.max(zahl14, Math.max(zahl15, Math.max(zahl16, Math.max(zahl17,Math.max(zahl18, Math.max(zahl19, Math.max(zahl20, Math.max(zahl21, Math.max(zahl22, Math.max(zahl23, Math.max(zahl24, Math.max(zahl25, Math.max(zahl26, Math.max(zahl27, Math.max(zahl28, Math.max(zahl29, Math.max(zahl30, Math.max(zahl31, Math.max(zahl32, Math.max(zahl33, Math.max(zahl34, Math.max(zahl35, Math.max(zahl36, Math.max(zahl37, Math.max(zahl38, Math.max(zahl39, Math.max(zahl40, Math.max(zahl41, Math.max(zahl42, Math.max(zahl43, Math.max(zahl44, Math.max(zahl45, Math.max(zahl46, Math.max(zahl47, Math.max(zahl48, Math.max(zahl49, zahl50))))))))))))))))))))))))))))))))))))))))))))))))) + " Grad!");
    System.out.println("");
    
    System.out.println("Die niedrigste Temperatur liegt bei: " + Math.min(zahl1, Math.min(zahl2, Math.min(zahl3, Math.min(zahl4, Math.min(zahl5, Math.min(zahl6, Math.min(zahl7, Math.min(zahl8, Math.min(zahl9, Math.min(zahl10, Math.min(zahl11, Math.min(zahl12, Math.min(zahl13, Math.min(zahl14, Math.min(zahl15, Math.min(zahl16, Math.min(zahl17, Math.min(zahl18, Math.min(zahl19, Math.min(zahl20, Math.min(zahl21, Math.min(zahl22, Math.min(zahl23, Math.min(zahl24, Math.min(zahl25, Math.min(zahl26, Math.min(zahl27, Math.min(zahl28, Math.min(zahl29, Math.min(zahl30, Math.min(zahl31, Math.min(zahl32, Math.min(zahl33, Math.min(zahl34, Math.min(zahl35, Math.min(zahl36, Math.min(zahl37, Math.min(zahl38, Math.min(zahl39, Math.min(zahl40, Math.min(zahl41, Math.min(zahl42, Math.min(zahl43, Math.min(zahl44, Math.min(zahl45, Math.min(zahl46, Math.min(zahl47, Math.min(zahl48, Math.min(zahl49, zahl50))))))))))))))))))))))))))))))))))))))))))))))))) + " Grad!");
    System.out.println("");
    
    //größter Temperatursprung
  
    double z12 = Math.abs(zahl1 - zahl2), z23 = Math.abs(zahl2 - zahl3), z34 = Math.abs(zahl3- zahl4), z45 = Math.abs(zahl4 - zahl5), z56 = Math.abs(zahl5- zahl6), z67 = Math.abs(zahl6 - zahl7), z78 = Math.abs(zahl7- zahl8), z89 = Math.abs(zahl8 - zahl9), z910 = Math.abs(zahl9 - zahl10);
    double z1011 = Math.abs(zahl10 - zahl11), z1112 = Math.abs(zahl11 - zahl12), z1213 = Math.abs(zahl12 - zahl13), z1314 = Math.abs(zahl13 - zahl14), z1415 = Math.abs(zahl14 - zahl15), z1516 = Math.abs(zahl15 - zahl16), z1617 = Math.abs(zahl16 - zahl17), z1718 = Math.abs(zahl17 - zahl18), z1819 = Math.abs(zahl18 - zahl19), z1920 = Math.abs(zahl19 - zahl20);
    double z2021 = Math.abs(zahl20 - zahl21), z2122 = Math.abs(zahl21 - zahl22), z2223 = Math.abs(zahl22 - zahl23), z2324 = Math.abs(zahl23 - zahl24), z2425 = Math.abs(zahl24 - zahl25), z2526 = Math.abs(zahl25 - zahl26), z2627 = Math.abs(zahl26 - zahl27), z2728 = Math.abs(zahl27 - zahl28), z2829 = Math.abs(zahl28 - zahl29), z2930 = Math.abs(zahl29 - zahl30);
    double z3031 = Math.abs(zahl30 - zahl31), z3132 = Math.abs(zahl31 - zahl32), z3233 = Math.abs(zahl32 - zahl33), z3334 = Math.abs(zahl33 - zahl34), z3435 = Math.abs(zahl34 - zahl35), z3536 = Math.abs(zahl35 - zahl36), z3637 = Math.abs(zahl36 - zahl37), z3738 = Math.abs(zahl37 - zahl38), z3839 = Math.abs(zahl38 - zahl39), z3940 = Math.abs(zahl39 - zahl40);
    double z4041 = Math.abs(zahl40 - zahl41), z4142 = Math.abs(zahl41 - zahl42), z4243 = Math.abs(zahl42 - zahl43), z4344 = Math.abs(zahl43 - zahl44), z4445 = Math.abs(zahl44 - zahl45), z4546 = Math.abs(zahl45 - zahl46), z4647 = Math.abs(zahl46 - zahl47), z4748 = Math.abs(zahl47 - zahl48), z4849 = Math.abs(zahl48 - zahl49), z4950 = Math.abs(zahl49 - zahl50);
    
    //System.out.println(""+z12+", "+z23+", "+z34+", "+z45+", "+z56+", "+z67+", "+z78+", "+z89+", "+z910+", "+z1011+", "+z1112+", "+z1213+", "+z1314+", "+z1415+", "+z1516+", "+z1617+", "+z1718+", "+z1819+", "+z1920+", "+z2021+", "+z2122+", "+z2223+", "+z2324+", "+z2425+", "+z2526+", "+z2627+", "+z2728+", "+z2829+", "+z2930+", "+z3031+", "+z3132+", "+z3233+", "+z3334+", "+z3435+", "+z3536+", "+z3637+", "+z3738+", "+z3839+", "+z3940+", "+z4041+", "+z4142+", "+z4243+", "+z4344+", "+z4445+", "+z4546+", "+z4647+", "+z4748+", "+z4849+", "+z4950);
    
    System.out.println("Der größte Temperatursprung beträgt: " + Math.max(z12, Math.max(z23, Math.max(z34, Math.max(z45, Math.max(z56, Math.max(z67, Math.max(z78, Math.max(z89, Math.max(z910, Math.max(z1011, Math.max(z1112, Math.max(z1213, Math.max(z1314, Math.max(z1415, Math.max(z1516, Math.max(z1617, Math.max(z1718, Math.max(z1819, Math.max(z1920, Math.max(z2021, Math.max(z2122, Math.max(z2223, Math.max(z2324, Math.max(z2425, Math.max(z2526, Math.max(z2627, Math.max(z2728, Math.max(z2829, Math.max(z2930, Math.max(z3031, Math.max(z3132, Math.max(z3233, Math.max(z3334, Math.max(z3435, Math.max(z3536, Math.max(z3637, Math.max(z3738, Math.max(z3839, Math.max(z3940, Math.max(z4041, Math.max(z4142, Math.max(z4243, Math.max(z4344, Math.max(z4445, Math.max(z4546, Math.max(z4647, Math.max(z4748, Math.max(z4849, z4950)))))))))))))))))))))))))))))))))))))))))))))))) + " Grad!");
  }
}      
