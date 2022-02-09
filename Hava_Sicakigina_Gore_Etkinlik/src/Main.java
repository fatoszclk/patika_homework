import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat = 0;
        Scanner input =  new Scanner(System.in);
        System.out.print("Sıcaklık değeri giriniz: ");

        heat = input.nextInt();

        if(heat < 5 )
        {
            System.out.println("Kayağa gidebilirsiniz..");
        }
        else
        {
            if(heat > 25)
            {
                System.out.println("Yüzmeye gidebilirsiniz..");
            }
            else
            {
                if(heat >= 15)
                    System.out.println("Piknik yapmaya gidebilirsiniz..");

                if( heat >= 10 && heat <=15)
                    System.out.println("Sinemaya gidebilirsiniz..");
            }

        }


    }
}
