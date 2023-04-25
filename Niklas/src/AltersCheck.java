import java.util.Scanner;

public class AltersCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib dein Alter ein. Deine Alter müss mindestens 19 ein um in den Club zu kommen :");

        int Alter = sc.nextInt();

        if(Alter > 19) {
            System.out.println("Du darfst eintreten.");
        } else if (Alter == 19) {
            System.out.println("Glück gehabt. Du darfst trotzdem eintreten.");
        } else {
            System.out.println("Tut mir leid du bist noch zu Jung.");
        }
    }
}
