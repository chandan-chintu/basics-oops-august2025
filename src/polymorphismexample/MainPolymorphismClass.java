package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        PerformSum performSum = new PerformSum();

        performSum.sum(23,32);
        performSum.sum(23.45,12.22);
        performSum.sum(22,55,66);
        performSum.sum(21.44f,11.33f);
        performSum.sum(23,45.66);
    }
}
