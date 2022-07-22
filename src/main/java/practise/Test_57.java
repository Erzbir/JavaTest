package practise;

import java.util.Scanner;

public class Test_57 {
    public static void main(String[] args) {
        isEquals();
    }

    private static int getRandomInt() {
        return (int) (Math.random() * 100);
    }

    private static void isEquals() {
        Scanner scan = new Scanner(System.in);
        int num_1 = -1;
        int num_2 = getRandomInt();
        System.out.println(num_2);
        while (num_2 != num_1) {
            num_1 = scan.nextInt();
            if (num_1 == num_2) {
                System.out.println("猜对了");
            } else if (num_1 > num_2) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
        scan.close();
    }

}