import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean durum = true;
        for(int i = 2; i<100; i++){
            durum = true;
            for(int k=2; k<i; k++){
                if(i%k==0)
                    durum &= false;
                else
                    durum &= true;
            }
            if(durum==true)
                System.out.print(i + " ");
        }
    }
}
