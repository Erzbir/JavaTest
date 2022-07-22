package practise;

import java.util.Scanner;

public class Test_45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入两个圆的圆心和各自的半径值:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double r1 = scan.nextDouble();
        double r2 = scan.nextDouble();
        if (isIn(x1, y1, r1, x2, y2, r2) == 3) {
            System.out.println("包含");
        } else if (isIn(x1, y1, r1, x2, y2, r2) == 2) {
            System.out.println("相交");
        } else {
            System.out.println("相离");
        }
    }

    private static int isIn(double x1, double y1, double r1, double x2, double y2, double r2) {
        double l = Math.pow(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2), 0.5);
        if (l <= Math.abs(r2 - r1)) {
            return 1;
        } else if (l <= Math.abs(r1 + r2)) {
            return 2;
        }
        return 3;
    }
}
