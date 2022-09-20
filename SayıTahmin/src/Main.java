import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);
        int right=0, selected = 0;
        int[] wrongArr = new int[5];
        boolean isWin=false, isWrong = false;

        Scanner input = new Scanner(System.in);
        while(right<5){
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();
            if(selected<0 || selected>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
                if(!isWrong){
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaparsanız hakkınızdan düşülecektir!");
                }else{
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hak : " + (5 -right));
                }
            }else{
                if(selected == number){
                    isWin = true;
                    System.out.println("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı: "+ number);
                    break;
                }else{
                    wrongArr[right] = selected;
                    right++;
                    System.out.println("Hatalı sayı girdiniz!");
                    if(selected > number){
                        System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                    }else{
                        System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                    }
                    System.out.println("Kalan hakkınız : " + (5-right));
                }
            }
        }
        if(!isWin && isWrong){
            System.out.println("Kaybettniz!");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrongArr));
        }
    }
}
