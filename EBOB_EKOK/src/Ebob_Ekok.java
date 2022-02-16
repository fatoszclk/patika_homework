import java.util.Scanner;

public class Ebob_Ekok {

    public static void main(String[] args) {
        int bir = 0, iki = 0, count = 0, ebob = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        bir = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        iki = input.nextInt();
        if(bir > iki )
            count = iki;
        else
            count = bir;
        while(true)
        {
            if(count<2)
            {
                System.out.println("EBOB yok");
                break;
            }
            else if(bir%count == 0 && iki%count == 0)
            {
                ebob = count;
                break;
            }
            count--;
        }
        System.out.println("EBOB:" + ebob);
        System.out.println("EKOK: " + (bir*iki)/ebob);
    }
}
