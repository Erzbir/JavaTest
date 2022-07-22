package practise;

public class Test_19 {
    public static void main(String[] args) {
        long num = 123456789L;
        for (long i = 1; i < 1000; i++) {
            if (isContain(num, i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isContain(long num, long n) {
        long temp = num * n;
        String temp_str = String.valueOf(temp);
        boolean flag = true;
        for (int j = 1; j < 9; j++) {
            if (!temp_str.contains(String.valueOf(j))) {
                return false;
            }
        }
        return !temp_str.contains(String.valueOf(0));
    }
}
