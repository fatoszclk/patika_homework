import java.util.Scanner;
public class Main {
    static int powerCalc(int base, int power)
    {
        if(power == 0)
            return 1;
        else
        {

            return base * powerCalc(base, power-1);
        }
    }

    public static void main(String[] args) {
        int base = 0, power = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        power = input.nextInt();
        System.out.println("Sonuç: " + powerCalc(base,power));

    }
}
