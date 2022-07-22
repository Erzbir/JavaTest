package practise;

public class Test_23 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isNarcissistic(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNarcissistic(int num) {
        int sum = 0, n = num;
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        return num == sum;
    }
}