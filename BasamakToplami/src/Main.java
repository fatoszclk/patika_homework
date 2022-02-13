import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();

        while (number != 0) {
            total += number%10;
            number /= 10;
        }

        System.out.println(total);
    }
}