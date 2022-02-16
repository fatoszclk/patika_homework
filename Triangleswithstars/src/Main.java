import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = input.nextInt();

        for (int i = 0; i<=2*n; i++){
            if(i<=n) {
                for (int j=0; j<(n-i); j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
            }
            else if(i>n) {
                for (int j = 1; j <= (i-n); j++){
                    System.out.print(" ");
                }
                for (int l = (2 * (2*n-i) + 1); l>0; l--) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
