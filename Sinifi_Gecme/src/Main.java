import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat_puan, fizik_puan, turkce_puan, kimya_puan, muzik_puan;
        double ortalama = 0;
        double counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat_puan = input.nextInt();
        if(mat_puan>0 && mat_puan<100){
            ortalama += mat_puan;
            counter++;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik_puan = input.nextInt();
        if(fizik_puan>0 && fizik_puan<100){
            ortalama += fizik_puan;
            counter++;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        turkce_puan = input.nextInt();
        if(turkce_puan>0 && turkce_puan<100){
            ortalama += turkce_puan;
            counter++;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya_puan = input.nextInt();
        if(kimya_puan>0 && kimya_puan<100){
            ortalama += kimya_puan;
            counter++;
        }

        System.out.print("Muzik notunuzu giriniz:");
        muzik_puan = input.nextInt();
        if(muzik_puan>0 && muzik_puan<100){
            ortalama += muzik_puan;
            counter++;
        }

        if(counter==0)
            System.out.println("Geçersiz işlem");
        else {
            ortalama = ortalama / counter;
            if (ortalama > 55.0) {
                System.out.println("Geçtiniz");
            } else {
                System.out.println("Kaldınız");
            }
            System.out.println("Ortalamanız " + ortalama);
        }
    }
}
