package practise;

import java.util.Scanner;

public class Test_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入第几个月:");
        int n = scan.nextInt();
        System.out.println(getRabbits(n));
        System.out.println(getRabbits_2(n));
        scan.close();
    }

    private static long getRabbits(int n) {
        if (n <= 4) {
            return 1;
        }
        return getRabbits(n - 1) + getRabbits(n - 4);
    }

    private static long getRabbits_2(int n) {
        long[] array = new long[n];
        if (n < 4) {
            return 1;
        }
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;

        for (int i = 4; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 4];
        }
        return array[array.length - 1];
    }
}


// 1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20    // 月份

// 1  1  1  2  3  4  5  6  7  10  14  19  26  33  41  50    // 总数
