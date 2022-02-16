import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int basamak = 0;
        System.out.print("Basamak sayısı: ");
        Scanner input = new Scanner(System.in);
        basamak = input.nextInt();
        for(int j = 0; j<basamak;j++)
        {
            for(int k=0;k<j;k++)
                System.out.print(" ");

            for(int i=2*(basamak-j)-1;i>0;i--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
