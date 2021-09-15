import java.util.Scanner;
public class TimZobel_FS93_Lernsituation_4_Prüfziffer 
{
    public static void main(String[] args) {
        String[][] personen = {
                { "Klaus", "Meyer", "Schlossallee. 4", "12345 Janzweitweg" },
                { "Franz", "Schmitz", "Elisenstr. 18", "98765 Posenuckel" },
                { "Heinz", "Kunz", "Badstr. 1", "34567 Hintertupfingen" }};
        String[] person = new String[4];
        person[0] = "Elli";
        person[1] = "Schulze";
        person[2] = "Parkstr. 14";
        person[3] = "09876 Imwald";
        personen[2] = person;

        for (int i = 0; i < personen.length; i++) {
            for (int j = 0; j < personen[i].length; j++) {
                System.out.println(personen[i][j]);
            }
            System.out.println();
        }
    }
} 
    
