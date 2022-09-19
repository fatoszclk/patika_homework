import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrar = new int[dizi.length];
        int[] tekrar_sayi = new int[dizi.length];
        int counter = 0, startIndex = 0;
        Arrays.fill(tekrar_sayi,-1);

        System.out.println("Dizi : "+ Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları ");

        for(int i=0; i<dizi.length-1; i++){
            counter = 1;
            for(int j=i+1; j<dizi.length; j++) {
                if(dizi[i] == dizi[j]){
                    counter++;
                }
            }
            if(!isFind(tekrar,dizi[i])){
                tekrar[startIndex]=dizi[i];
                tekrar_sayi[startIndex]=counter++;
                startIndex++;
            }
        }

        for(int i = 0; i<tekrar.length; i++) {
            if(tekrar_sayi[i]!=-1)
                System.out.println(tekrar[i]+ " sayısı " + tekrar_sayi[i] + " kere tekrar edildi.");
        }
    }
}
