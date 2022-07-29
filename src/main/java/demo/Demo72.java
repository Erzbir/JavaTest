package demo;

class Demo72 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int count = 0;
        int n = 0;
        while (count < 100) {
            if (isPrimeNum(n) && isPalindrome(n)) {
                System.out.print(n + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            n++;
        }
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
}