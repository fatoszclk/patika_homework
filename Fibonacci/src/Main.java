import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleman = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı fibonacci sayısı hesaplamak istiyorsunuz:");
        eleman = input.nextInt();
        int[] fibo = new int[eleman];

        for(int i = 0; i<fibo.length; i++){
            if(i == 0){
                fibo[0] = 0;
            }
            else if(i == 1) {
                fibo[1] = 1;
            }else if(i>1) {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            System.out.print(fibo[i] + " ");
        }
    }
}
