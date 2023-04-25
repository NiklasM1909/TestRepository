import java.util.Scanner;
import java.text.*;

public class AktienTest {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib deinen Kaufpreis ein:");

        double KaufPreis = sc.nextDouble();
        int Tag = 1;
        double VerkaufsPreis = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {
            System.out.println("Gib den Aktienkurs für den heutigen Tag an " + Tag + " (Jede negative Nummer : ");
            VerkaufsPreis = sc.nextDouble();

            if (VerkaufsPreis < 0.0) break;
            double Gewinn = VerkaufsPreis - KaufPreis;

            if (Gewinn > 0.0) {
                System.out.println("Nach dem Tag " + Tag + ", hast du "
                + df.format(Gewinn) + " pro Aktie gemacht");
            }
            else if (Gewinn < 0.0) {
                System.out.println("Nach dem Tag " + Tag + ", hast du "
                        + df.format(-Gewinn) + " pro Aktie verloren");
            }
            else {
                System.out.println("Nach dem Tag " + Tag + ", hast du" +
                        "keinen Geweinn erziehlt");
            }
            Tag += 1;

        }
        sc.close();

    }
}
