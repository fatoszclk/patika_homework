public class Main {
    static int Fibonacci(int number){
        int returnValue = 0;
        if(number == 0)
            return 0;
        else if(number == 1)
            return 1;
        else
            return Fibonacci(number - 1) + Fibonacci(number - 2);
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(8));
    }
}
