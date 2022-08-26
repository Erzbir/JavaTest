package demo;

public class Demo83 {
    public static void main(String[] args) {
        System.out.println(gcd(16, 24, 32, 40, 48));
    }

    public static int gcd(int... numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        for (int k = min; k >= 1; k--) {
            boolean flag = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % k != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return k;
            }
        }
        return 1;
    }
}