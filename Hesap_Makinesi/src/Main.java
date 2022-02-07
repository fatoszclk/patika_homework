import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1. Toplama \n2. Çıkarma \n3.Çarpma \n4.Bölme");
        System.out.print("Seçiminiz nedir?");
        select = input.nextInt();

        switch (select){
            case 1:
                sonuc = n1 + n2;
                System.out.println("Toplam: " + sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println("Çıkarma: " + sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println("Çarpma: " + sonuc);
                break;
            case 4:
                if(n2!=0) {
                    sonuc = n1 / n2;
                    System.out.println("Bölme: " + sonuc);
                }
                else
                    System.out.println("Bir sayı sıfıra bölünemez");
                break;
            default:
                System.out.println("Yanlş seçim yaptınız. Tekrar deneyiniz");
        }


    }
}
