package practise;

import java.util.Scanner;

public class Test_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入第一个数的值:");
        double num_1 = scan.nextDouble();
        System.out.print("输入第二个数的值:");
        double num_2 = scan.nextDouble();
        scan.nextLine();
        System.out.print("输入运算符:");
        char operate = scan.nextLine().charAt(0);
        System.out.println("结果为:" + calculator(num_1, num_2, operate));
        scan.close();
    }

    private static double calculator(double num_1, double num_2, char operate) {
        switch (operate) {
            case '+':
                return num_1 + num_2;
            case '-':
                return num_1 - num_2;
            case '*':
                return num_1 * num_2;
            case '/':
                return num_1 / num_2;
            case '%':
                return num_1 % num_2;
            default:
                System.out.println("error enter");
                return 0;
        }
    }
}
