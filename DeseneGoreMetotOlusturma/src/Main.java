import java.util.Scanner;
public class Main {
    static int direction = 0;
    static void desen(int num,int max_num)
    {
        System.out.print(num + " ");

        if(num==max_num && direction ==1) {
            direction = 0;
            return;
        }
        else if(num<=0)
            direction = 1;

        if(direction == 0) {
            desen(num-5, max_num);
        }
        else {
            desen(num+5, max_num);
        }
    }

    public static void main(String[] args) {
        int sayi = 0;
        System.out.print("N Sayısı: ");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        desen(sayi,sayi);

    }
}
