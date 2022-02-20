import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        boolean returnValue = false;
        int temp = number, reverseNumber = 0, lastNumber = 0;
        while(temp!=0){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber *10) + lastNumber;
            temp = temp / 10;
        }
        if(number == reverseNumber)
            returnValue = true;
        else
            returnValue = false;

        return returnValue;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        number = input.nextInt();
        System.out.println(isPalindrom(number));
    }
}
