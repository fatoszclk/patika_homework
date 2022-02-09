import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int ilk = 0,iki = 0,son = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Girilen 3 adet sayı küçükten büyüğe göre sıralancaktır..");
        System.out.print("Birinci sayıyı giriniz: ");
        ilk = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        iki = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        son = input.nextInt();

        if(ilk < iki && ilk < son )
        {
            if(iki<son)
                System.out.println("a < b < c");
            else
                System.out.println("a < c < b");
        }
        else if(iki < ilk && iki < son)
        {
            if(ilk < son)
                System.out.println("b < a < c");
            else
                System.out.println("b < c < a");
        }
        else if(son < ilk && son < iki)
        {
            if(ilk < iki)
                System.out.println("c < a < b");
            else
                System.out.println("c < b < a");
        }
    }
}
