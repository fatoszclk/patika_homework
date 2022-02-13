import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=0, r=0;
        int n_fak=1, r_fak=1, n_r_fak=1;
        Scanner input = new Scanner(System.in);

        System.out.print("N Değerini Giriniz");
        n=input.nextInt();

        System.out.print("R Değerini Giriniz");
        r=input.nextInt();

        if(n<r){
            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır.");
        }else{
            for (int i =1; i<=n; i++)
                n_fak = n_fak * i;

            for (int i =1; i<=r; i++)
                r_fak = r_fak * i;

            for (int i =1; i<=n-r; i++)
                n_r_fak = n_r_fak * i;

            int kombinasyon = n_fak / (r_fak * n_r_fak);

            System.out.println(n + "'in " + r + "'li kombinasyonu:" + kombinasyon);
        }

    }
}
