import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat_puan, fizik_puan, turkce_puan, kimya_puan, tarih_puan, muzik_puan;
        double ortalama = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat_puan = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik_puan = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce_puan = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya_puan = input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih_puan = input.nextInt();

        System.out.print("Muzik notunuzu giriniz:");
        muzik_puan = input.nextInt();

        ortalama = (mat_puan + fizik_puan + turkce_puan + kimya_puan + tarih_puan + muzik_puan) / 6.0;
        System.out.println("Ortalama puanınız " + ortalama);
        if(ortalama >= 60.0){
            System.out.println("Geçtiniz");
        }
        else {
            System.out.println("Kaldınız");
        }
    }
}
