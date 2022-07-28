package demo;

public class Demo39 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrimeNum(i)) {
                count++;
                System.out.print(i + " ");
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n / 2 - n % 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


