import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi=0, counter=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz:");
        sayi = input.nextInt();

        for(int i =1; i<sayi; i*=4){
            System.out.println(4 + "^" + counter + " = " + i);
            counter++;
        }
        counter = 0;
        for(int i =1; i<sayi; i*=5){
            System.out.println(5 + "^" + counter + " = " + i);
            counter++;
        }

    }
}
