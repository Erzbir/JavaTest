package practise;

public class Test_16 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            int n = i;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                sum += n % 10;
                n /= 10;
            }
            if (i / 11 == sum) {
                System.out.println(i);
            }
        }
    }
}
