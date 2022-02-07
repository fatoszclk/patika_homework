import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ucret = 0, kdv_ucreti = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplama yapılacak tutarı giriniz:");
        ucret = input.nextDouble();

        if(ucret <= 1000 && ucret >0){

            kdv_ucreti = ucret * 0.18; //Kdv orani 0.18'dir.
        }else{
            kdv_ucreti = ucret * 0.08; //Kdv orani 0.08'dir.
        }
        System.out.println("KDV'siz Fiyat " + ucret);
        System.out.println("KDV'li Fiyat " + (kdv_ucreti + ucret));
        System.out.println("KDV tutarı " + kdv_ucreti);
    }
}
