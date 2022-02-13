import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Döngüden çıkmak için negatif değer girilmelidir!");
        do{
            System.out.print("Sayı Giriniz:");
            n=input.nextInt();
            if(n%4==0) {
                total += n;
            }

        }while(n>0);
        System.out.println("Toplam: " + total);
    }
}
