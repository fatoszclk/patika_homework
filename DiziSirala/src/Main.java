import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Dizinin boyutu n: ");
        number = input.nextInt();
        int[] arr = new int[number];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i=1; i<=number; i++){
            System.out.print(i + ". Elemanı : ");
            arr[i-1] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Sıralama : " );
        for(int i:arr){
            System.out.print(i + " ");
        }

    }
}
