package practise;

public class Test_39 {
    public static void main(String[] args) {
        System.out.print("输入今天的日期:");
        int num = PrintPatten.input.nextInt();
        System.out.print("输入天数:");
        int num2 = PrintPatten.input.nextInt();
        int temp = num2;
        String[] week = {"周天", "周一", "周二", "周三", "周四", "周五", "周六"};
        while (temp > 6) {
            temp -= 7;
        }
        System.out.println("今天是:" + week[num] + "\n" + num2 + "天过后是:" + week[temp]);
    }
}
