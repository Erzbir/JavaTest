package demo;

public class Demo44 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 98; i++) {
            sum = (double) i / (i + 2);
        }
        System.out.println(sum);
    }
}
