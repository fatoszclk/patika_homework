import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy = 0, kilo=0;
        double indeks = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz: " + indeks);

    }
}
