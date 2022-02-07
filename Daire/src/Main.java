import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaricap=0, pi=3.14, merkez_aci = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Daireye ait yarıçap bilgisini girini:");
        yaricap = input.nextDouble();
        System.out.print("Daireye ait merkez açı bilgisini girini:");
        merkez_aci = input.nextDouble();

        double alan = ((pi * yaricap * yaricap) * merkez_aci) / 360.0;
        System.out.println("Verilen bilgilere göre alan " + alan);
    }
}
