import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0,muko = 0;
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        for(int i=1;i<num;i++)
        {
            if(num%i == 0)
                muko += i;
        }
        if(muko == num)
            System.out.println(num + " Mükemmel sayıdır");
        else
            System.out.println(num + " Mükemmel sayı değildir");

    }
}
