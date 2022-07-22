package practise;

import java.util.Scanner;

public class Test_49 {
    public static void main(String[] args) {
        System.out.print("输入x, y:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.close();
        if (isIn(x, y)) {
            System.out.println("在三角形内");
        } else {
            System.out.println("不在三角形内");
        }
    }

    public static boolean isIn(double x, double y) {
        if (x < 0 || y < 0) {
            return false;
        }
        return y < 100 && x < 200;
    }
}
