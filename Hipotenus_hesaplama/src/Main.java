import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = 0, b= 0, c = 0;
        double cevre = 0, alan = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("a kenarına ait uzunluğu giriniz:");
        a = input.nextDouble();

        System.out.print("b kenarına ait uzunluğu giriniz:");
        b = input.nextDouble();

        System.out.print("c kenarına ait uzunluğu giriniz:");
        c = input.nextDouble();

        cevre = (a + b + c) / 2;
        alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));
        System.out.println("Verilen üçgenin çevresi: " + 2*cevre);
        System.out.println("Verilen üçgenin alanı: " + alan);
    }
}
