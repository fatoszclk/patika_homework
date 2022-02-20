import java.util.Scanner;
public class Main {
    static void asalMi(int num, int mod)
    {
        if(num == mod)
        {
            System.out.println(num + " ASAL sayıdır");
            return;
        }
        else if(num%mod == 0)
        {
            System.out.println(num + " ASAL sayı değildir !");
            return;
        }

        asalMi(num,mod+1);

    }

    public static void main(String[] args) {
        int sayi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        asalMi(sayi,2);

    }
}
