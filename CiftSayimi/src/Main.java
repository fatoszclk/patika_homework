import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k=0, total=0, counter=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        k = input.nextInt();

        for(int i=0; i<=k; i++){
            if(i%3==0 && i%4==0){
                total+=i;
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması:" + (total / counter));
    }
}
