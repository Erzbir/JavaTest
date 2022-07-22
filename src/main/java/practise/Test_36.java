package practise;

public class Test_36 {
    public static void main(String[] args) {
        System.out.print("输入一个整数:");
        int num = PrintPatten.input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
