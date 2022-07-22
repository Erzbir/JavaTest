package practise;

public class Test_24 {
    public static void main(String[] args) {
        System.out.print("输入整数:");
        int num = PrintPatten.input.nextInt();
        System.out.print("输入项数:");
        int n = PrintPatten.input.nextInt();
        long result = sum(n, num);
        System.out.println(result);
    }

    private static long sum(int a, int b) {
        if (b > 1) {
            return a + sum(a, b - 1) * 10;
        } else return a;
    }
}
