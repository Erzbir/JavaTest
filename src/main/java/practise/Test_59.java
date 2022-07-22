package practise;

import java.util.Scanner;

public class Test_59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入一个数:");
        Object[] arr = countTimes(scan.nextInt());
        System.out.printf("出现 1 的次数为: %s, 转换成二进制数为: %s", arr[1].toString(), arr[0].toString());
    }

    public static Object[] countTimes(int num) {
        if (num <= 0) {
            return new Object[]{-1, -1};
        }
        int temp, count = 0, n = 0;
        int binary = 0;
        while (num > 0) {
            temp = num % 2;
            binary += temp * (int) Math.pow(10, n++);
            num /= 2;
            if (temp == 1) {
                count++;
            }
        }
        return new Object[]{binary, count};
    }
}

