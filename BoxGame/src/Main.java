public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 24, 120, 100, 5);
        Fighter f2 = new Fighter("Veli", 15, 85, 85, 10);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
