package demo;

public class Demo36 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count < 50) {
            boolean flag = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
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