package demo;

class Demo75 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int count = 1;
        while (count <= 1000) {
            if (isPrimeNum(count) && isPrimeNum(count + 2)) {
                System.out.printf("%s\t%s\n", count, count + 2);
            }
            count++;
        }
    }

    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (n >> 1) - n % 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}