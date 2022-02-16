import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz:");
        n=input.nextInt();

        for (double i = 1; i<=n; i++){
            total += 1/i;
        }
        System.out.println(total);
    }
}
