package practise;

public class Test_41 {
    public static void main(String[] args) {
        System.out.println("0 剪刀, 1 石头, 2 布:");
        int a = PrintPatten.input.nextInt();
        int b = (int) (Math.random() * 3);
        System.out.println(b);
        if (a == b) {
            System.out.println("平局");
        } else if (a == 0 && b == 2 || a == 1 && b == 0 || a == 2 && b == 1) {
            System.out.println("赢");
        } else {
            System.out.println("输");
        }
    }
}
