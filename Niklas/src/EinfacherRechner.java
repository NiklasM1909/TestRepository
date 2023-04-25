import java.util.Scanner;

public class EinfacherRechner {
    public static void main(String[] args) {

        Scanner Eingabe = new Scanner(System.in);

        double ersteZahl;
        double zweiteZahl;

        char operator;

        System.out.println("Gib die erste Zahl ein");
        ersteZahl = Eingabe.nextDouble();

        System.out.println("Gib die zweite Zahl ein");
        zweiteZahl = Eingabe.nextDouble();

        System.out.println("Gib eine Rechenoperator ein");
        operator = Eingabe.next().charAt(0);

        if (operator == '*') {
            System.out.println(ersteZahl * zweiteZahl);
        } else if (operator == '/') {
            System.out.println(ersteZahl / zweiteZahl);
        } else if (operator == '+') {
            System.out.println(ersteZahl + zweiteZahl);
        } else if (operator == '-') {
            System.out.println(ersteZahl - zweiteZahl);
        } else {
            System.out.println("Ungültige Eingabe");
        }
    }
}