package practise;

public class Test_22 {
    public static void main(String[] args) {
        for (int i = 1; i < 99; i = i + 2) {
            if (Test_4.isPrimeNumber(i) && Test_4.isPrimeNumber(i + 2)) {
                System.out.println(i + "," + (i + 2));
            }
        }
    }
}