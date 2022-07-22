package practise;

public class Test_15 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            String str = String.valueOf(i);
            int num = reversNum(i);
            if (i * Integer.parseInt(String.valueOf(str.charAt(0))) == num) {
                System.out.println(i);
            }
        }
    }

    public static int reversNum(int num) {
        String str = String.valueOf(num);
        int n = num;
        int result = 0;
        for (int j = 0; j < str.length(); j++) {
            result *= 10;
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
