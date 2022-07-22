package practise;

public class Test_25 {
    public static void main(String[] args) {
        System.out.println(sum(2, 1, 20));
    }

    private static double sum(double a, double b, int n) {
        if (n < 2) {
            return a / b;
        } else {
            return a / b + sum(a + b, a, n - 1);
        }
    }
}
