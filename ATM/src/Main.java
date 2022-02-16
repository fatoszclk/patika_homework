import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username = null, password = null;
        int count = 3;
        Scanner input = new Scanner(System.in);
        double withdraw = 1500.0;
        int selection = 0;

        while(count > 0)
        {
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Merhaba FT Bankasına Hoşgeldiniz! ");
                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz..");
                    System.out.println("1 - Para Yatırma");
                    System.out.println("2 - Para Çekme");
                    System.out.println("3 - Bakiye Sorgula");
                    System.out.println("4 - Çıkış Yap");
                    selection = input.nextInt();
                    switch(selection)
                    {
                        case 1:
                            System.out.print("Para Miktarı: ");
                            int money = input.nextInt();
                            withdraw += money;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int cash = input.nextInt();
                            if(cash  > withdraw)
                                System.out.println("Yetersiz bakiye");
                            else
                                withdraw -= cash;

                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + withdraw);
                            break;
                        case 4:
                            System.out.println("Allah'a Ismarladık!");
                            break;
                    }
                }while(selection != 4);
                break;
            }
            else
            {
                count--;
                System.out.println("Hatalı kullanıcı adı ve ya şifre girdiniz. Tekrar deneyiniz");

                if(count==0)
                    System.out.println("Hesabınız bloke olmuştur, bankanız ile iletişime geçiniz.");
                else
                    System.out.println("Kalan hakkınız: " + count);

            }
        }
    }
}
