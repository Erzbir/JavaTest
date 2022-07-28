package demo;

class Demo46 {
    public static void main(String[] args) {
        System.out.print(calculate());
    }

    public static double calculate() {
        double sum = 0;
        for (int i = 0; i <= 10000; i++) {
            double divide = 1;
            for (int j = 1; j <= i; j++) {
                divide *= j;
            }
            sum += 1 / divide;
        }
        return sum;
    }
}