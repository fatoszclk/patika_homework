import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0, i=1, sayi = 0, kucukMu=Integer.MAX_VALUE, buyukMu=Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz:");
        counter = input.nextInt();
        do{
            System.out.print(i + ". Sayıyı Giriniz: ");
            sayi = input.nextInt();

            if(sayi<kucukMu)
                kucukMu = sayi;
            if(sayi>buyukMu)
                buyukMu = sayi;

            i++;

        }while(i<=counter);

        System.out.println("En büyük sayı: " + buyukMu);
        System.out.println("En küçük sayı: " + kucukMu);


    }
}
