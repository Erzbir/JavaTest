package practise;

public class Test_37 {
    public static void main(String[] args) {
        double a = 100, b = 0;
        double c = 0.05 / 12;
        for (int i = 0; i < 6; i++) {
            b = a + a * c;
            a = b;
            a += 100;
        }
        System.out.printf("%.2f", b);
    }
}
