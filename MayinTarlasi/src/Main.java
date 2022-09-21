import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;

        System.out.print("Oyun için total satır sayısını giriniz : ");
        row = input.nextInt();
        System.out.print("Oyun için total sütun sayısını giriniz : ");
        column = input.nextInt();

        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}
