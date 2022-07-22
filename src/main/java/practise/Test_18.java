package practise;

public class Test_18 {
    public static void main(String[] args) {
        for (int i = 10000; i < 100000; i++) {
            int numA = i * 10 + 7;
            int numB = i + 7 * 100000;
            if (5 * numA == numB) {
                System.out.println(i);
            }
        }
    }
}
