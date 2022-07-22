package practise;

public class Test_2 {
    public static void main(String[] args) {
        int num;
        System.out.print("输入一个数:");
        num = PrintPatten.input.nextInt();
        if ((num & 1) == 0) {
            System.out.println("偶数");
            System.out.print("是3的倍数的数:");
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("奇数");
            System.out.print("是5的倍数的数:");
            for (int i = 1; i <= num; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
