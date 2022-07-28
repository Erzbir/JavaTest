package demo;

class Demo47 {
    public static void main(String[] args) {
        perfectNum();
    }

    public static void perfectNum() {
        for (int i = 1; i < 10000; i++) {
            if (isPerfectNum(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum ==  n;
    }
}