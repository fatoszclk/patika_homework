import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int armut_kilo = 0, elma_kilo = 0, domates_kilo = 0, muz_kilo = 0, patlican_kilo = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? :");
        armut_kilo = input.nextInt();

        System.out.print("Elma kaç kilo? :");
        elma_kilo = input.nextInt();

        System.out.print("Domates kaç kilo? :");
        domates_kilo = input.nextInt();

        System.out.print("Muz kaç kilo? :");
        muz_kilo = input.nextInt();

        System.out.print("Patlıcan kaç kilo? :");
        patlican_kilo = input.nextInt();

        total = armut*armut_kilo + elma_kilo*elma + domates_kilo*domates +
                muz*muz_kilo + patlican_kilo*patlican;

        System.out.println("Toplam tutar: " + total);
    }
}
