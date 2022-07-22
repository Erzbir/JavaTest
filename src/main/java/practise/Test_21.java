package practise;

public class Test_21 {
    public static void main(String[] args) {
        if (isTrue()) {
            System.out.println("能被整除, 成立");
        }
    }

    private static boolean isTrue() {
        boolean flag = true;
        for (int i = 9; i < 100000; i++) {
            int n = bitDifference(i);
            if (n % 9 != 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static int bitDifference(int num) {
        int sum = 0;
        int n = num;
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            sum += n % 10;
            n /= 10;
        }
        return num - sum;
    }
}