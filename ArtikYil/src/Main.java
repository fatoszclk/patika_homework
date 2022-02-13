import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil=0;
        boolean artikMi = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz:");
        yil = input.nextInt();

        if(yil % 100 == 0 && yil % 400 == 0)
            artikMi = true;
        else if(yil % 100 != 0 && yil % 4 == 0)
            artikMi = true;
        else
            artikMi = false;

        if(artikMi)
            System.out.println(yil + " bir artık yıldır !");
        else
            System.out.println(yil + " bir artık yıl değildir !");
    }
}
