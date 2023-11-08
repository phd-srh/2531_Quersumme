import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        System.out.print("Die Quersumme der Zahl " + zahl + " = ");
        int summe = 0;
        while ( zahl > 0 ) {
            int ziffer = zahl % 10;
            System.out.print(ziffer);
            summe = summe + ziffer;
            zahl = zahl / 10;
            if (zahl > 0) System.out.print(" + ");
        }
        System.out.println(" = " + summe);
    }
}
