public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(20);

        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.reset();
        counter.printValue();
    }
}
