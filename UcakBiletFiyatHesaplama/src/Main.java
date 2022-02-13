import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km = 0, age=0, yolculuk_tipi=0;
        float fee_per_km= (float) 0.10;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz:");
        km=input.nextInt();

        System.out.print("Yaşınızı giriniz:");
        age=input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-> Tek yön, 2->Gidiş Dönüş):");
        yolculuk_tipi=input.nextInt();

        if(km > 0 && age > 0 && (yolculuk_tipi<3 || yolculuk_tipi >0)) {
            double fee = km * fee_per_km;
            if (age < 12)
                fee = fee * 0.5;
            else if (age >= 12 && age <= 24)
                fee = fee * 0.9;
            else if (age >= 65)
                fee = fee * 0.7;

            if (yolculuk_tipi == 2) {
                fee = fee * 0.8;
                fee = fee * 2;
            }
            System.out.println("Toplam tutar: " + fee + " TL");
        }
        else
            System.out.println("Hatalı Veri Girdiniz!");

    }
}
