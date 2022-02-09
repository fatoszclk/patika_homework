import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ay = 0, gun = 0;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı sayı cinsinden giriniz: ");
        ay = input.nextInt();


        if (ay <= 12 && ay > 0)
        {
            System.out.print("Doğduğunuz günü giriniz: ");
            gun = input.nextInt();

            if (ay == 1) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 21)
                        System.out.println("Oğlak");
                    else
                        System.out.println("Kova");
                } else
                    isError = true;
            } else if (ay == 2) {
                if (gun > 0 && gun <= 28) {
                    if (gun <= 19)
                        System.out.println("Kova");
                    else
                        System.out.println("Balık");
                } else
                    isError = true;
            } else if (ay == 3) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 20)
                        System.out.println("Balık");
                    else
                        System.out.println("Koç");
                } else
                    isError = true;
            } else if (ay == 4) {
                if (gun > 0 && gun <= 30) {
                    if (gun <= 20)
                        System.out.println("Koç");
                    else
                        System.out.println("Boğa");
                } else
                    isError = true;
            } else if (ay == 5) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 21)
                        System.out.println("Boğa");
                    else
                        System.out.println("İkizler");
                } else
                    isError = true;
            } else if (ay == 6) {
                if (gun > 0 && gun <= 30) {
                    if (gun <= 22)
                        System.out.println("İkizler");
                    else
                        System.out.println("Yengeç");
                } else
                    isError = true;
            } else if (ay == 7) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 23)
                        System.out.println("Yengeç");
                    else
                        System.out.println("Aslan");
                } else
                    isError = true;
            } else if (ay == 8) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 22)
                        System.out.println("Aslan");
                    else
                        System.out.println("Başak");
                } else
                    isError = true;
            } else if (ay == 9) {
                if (gun > 0 && gun <= 30) {
                    if (gun <= 22)
                        System.out.println("Başak");
                    else
                        System.out.println("Terazi");
                } else
                    isError = true;
            } else if (ay == 10) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 22)
                        System.out.println("Terazi");
                    else
                        System.out.println("Akrep");
                } else
                    isError = true;
            } else if (ay == 11) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 21)
                        System.out.println("Akrep");
                    else
                        System.out.println("Yay");
                } else
                    isError = true;
            } else if (ay == 12) {
                if (gun > 0 && gun <= 31) {
                    if (gun <= 22)
                        System.out.println("Yay");
                    else
                        System.out.println("Oğlak");
                } else
                    isError = true;
            }
        }
        else
            isError = true;

        if(isError)
            System.out.println("Hatalı giriş yaptınız");

    }
}
