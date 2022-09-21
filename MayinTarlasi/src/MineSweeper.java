import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int column;
    int row;
    int numberOfMine;

    public MineSweeper(int row, int column){
        this.row = row;
        this.column = column;
        this.numberOfMine = (row*column)/4;
    }

    public void createMine(String[][] field, int numberOfMine){
        Random random_number = new Random();
        int number, row_, column_;
        for(int i=0; i<numberOfMine; i++){
            number = random_number.nextInt(this.row*this.column);
            row_ = number/(this.row);
            column_ = number%(this.row);
            if(field[row_][column_].equals("*")){
                i--;
            }else{
                field[row_][column_]="*";
            }
        }

    }
    public void print(String[][] field) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("==============================");
    }

    public boolean checkIfMine(String[][] fieldwithmine, int row_mem, int col_mem){
        if(fieldwithmine[row_mem][col_mem].equals("*")){
            System.out.println("Game Over!!");
            return true;
        }
        return false;
    }

    public void howMineIsThere(String[][] fieldwithmine, String[][] field, int row_mem, int col_mem){
        int count =0;
        if(row_mem-1>=0 && fieldwithmine[row_mem-1][col_mem] == "*"){
            count++;
        }
        if(row_mem+1<field.length && fieldwithmine[row_mem+1][col_mem] == "*"){
            count++;
        }
        if(col_mem-1>=0 && fieldwithmine[row_mem][col_mem-1] == "*"){
            count++;
        }
        if(col_mem+1<field[0].length && fieldwithmine[row_mem][col_mem+1] == "*"){
            count++;
        }
        if(row_mem-1>=0 && col_mem-1>=0 && fieldwithmine[row_mem-1][col_mem-1] == "*"){
            count++;
        }
        if(row_mem+1<field.length && col_mem+1<field[0].length && fieldwithmine[row_mem+1][col_mem+1] == "*"){
            count++;
        }
        if(row_mem-1>=0 && col_mem+1<field[0].length && fieldwithmine[row_mem-1][col_mem+1] == "*"){
            count++;
        }
        if(row_mem+1<field.length && col_mem-1>=0 && fieldwithmine[row_mem+1][col_mem-1] == "*"){
            count++;
        }

        field[row_mem][col_mem]=Integer.toString(count);
    }

    public void run() {
        String[][] fieldwithmine = new String[this.row][this.column];
        String[][] field = new String[this.row][this.column];
        int row_mem, col_mem;
        boolean isMine=false;
        Scanner input = new Scanner(System.in);

        for(int i=0; i<row; i++){
            Arrays.fill(field[i], "-");
            Arrays.fill(fieldwithmine[i], "-");
        }
        createMine(fieldwithmine, this.numberOfMine);
        System.out.println("Mayınların Konumu");
        print(fieldwithmine);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        print(field);
        int count=0;
        while(!isMine && (count + numberOfMine < this.row * this.column)) {
            System.out.print("Satır Giriniz : ");
            row_mem = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col_mem = input.nextInt();
            if(row_mem>=this.row || col_mem>=this.column){
                System.out.println("Sınır değerleri aştınız! Oyun bitti!");
                break;
            }
            isMine = checkIfMine(fieldwithmine, row_mem, col_mem);
            if(!isMine){
                howMineIsThere(fieldwithmine, field, row_mem, col_mem);
                if(count + numberOfMine + 1 == this.row * this.column){
                    System.out.println("Oyunu kazandınız !");
                }
                print(field);
            }else{
                break;
            }
            count++;
        }
    }
}
