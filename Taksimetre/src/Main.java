import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double acilis = 10.0;
        double gidilen_km = 0, tutar = 0;
        double ucret = 2.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen km bilgisini giriniz:");
        gidilen_km = input.nextDouble();

        tutar = acilis + gidilen_km * ucret;

        if(tutar <= 20.0)
            System.out.println("Ucret 20 TL");
        else
            System.out.println("Ucret " + tutar + " TL");

    }
}
