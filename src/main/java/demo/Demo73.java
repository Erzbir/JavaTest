package demo;

class Demo73 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int count = 100;
        int n = 0;
        while (count > 0) {
            if (!isPalindrome(n) && isPrimeNum(n)) {
                int temp = reverse(n);
                if (isPrimeNum(temp)) {
                    System.out.print(n + "\t");
                    count--;
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
            }
            n++;
        }
    }

    public static boolean isPalindrome(int n) {
        if (n <= 10) {
            return false;
        }
        String s = String.valueOf(n);
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2 - n % 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int result = 0;
        while (n != 0) {
            result += n % 10;
            result *= 10;
            n /= 10;
        }
        return result / 10;
    }

}