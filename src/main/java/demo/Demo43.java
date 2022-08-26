package demo;

/**
 * @Author:HENG
 * @Date:2022/7/1 17:34
 */
public class Demo43 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int k = 1; k <= 8 - i; k++) {
                System.out.print("    ");
            }
            for (int j = 1 - i; j <= i - 1; j++) {
                System.out.printf("%4.0f", Math.pow(2, Math.abs(Math.abs(j) - i + 1)));
            }
            System.out.println();
        }
    }
}
