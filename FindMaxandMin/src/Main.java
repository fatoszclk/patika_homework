import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        number = input.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);

        int min = number;
        int max = number;
        boolean isOk=true;

        for (int i=list.length-1; i>=0; i--) {
            if (list[i] < number && isOk == true) {
                min = list[i];
                isOk=false;
            }
        }
        isOk=true;
        for (int i=0; i< list.length; i++) {
            if (list[i] > number && isOk == true) {
                max = list[i];
                isOk=false;
            }
        }
        System.out.println("Girilen sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + max);

    }
}