package demo;

/**
 * @Author:HENG
 * @Date:2022/7/1 16:59
 */
public class Demo39 {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while (num <= 1000) {
            if (num % 5 == 0 ^ num % 6 == 0) {
                System.out.print(num + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }
}


