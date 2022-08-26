package demo;

/**
 * @Author:HENG
 * @Date:2022/7/1 17:14
 */
public class Demo41 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <= 7 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1 - i; j <= i - 1; j++) {
                System.out.print(Math.abs(j) + 1 + " ");
            }
            System.out.println();
        }
    }
}