package demo;

public class Demo36 {
    public static void main(String[] args) {
        for (int i = 2, j = 0; j < 50; i++) {
            if (isPrimeNum(i)) {
                System.out.print(i + "\t");
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }

    public static boolean isPrimeNum(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= (num >> 1) - num % 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
