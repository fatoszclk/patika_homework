import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password,answer, new_password, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        username=input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        password=input.nextLine();

        if(username.equals("patika") && password.equals("java1234"))
            System.out.println("Giriş yaptınız.");
        else if(username.equals("patika") && !password.equals("java1234")) {
            System.out.print("Şifreniz yanlış! Sıfırlamak ister misiniz? (Y/N)");
            answer = input.nextLine();
            if(answer.equals("Y")) {
                System.out.print("Şifreyi giriniz:");
                new_password = input.nextLine();
                if(new_password.equals("java1234") || new_password.equals(password))
                    System.out.println("Şifre oluşturulamadı.");
                else
                    System.out.println("Şifre değiştirildi.");
            }
            else
                System.out.println("Tekrar deneyiniz");
        }
        else
            System.out.println("Tekrar deneyiniz");
    }
}
