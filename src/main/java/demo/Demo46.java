package demo;

/**
 * @Author:HENG
 * @Date:2022/7/4 8:08
 */
public class Demo46 {
    public static void main(String[] args) {
        double e = 1;
        double item = 1;
        for (int i = 1; i <= 1000; i++) {
            item *= i;
            e += 1.0 / item;
        }
        System.out.println(e);
    }
}