package practise;

public class Test_38 {
    public static void main(String[] args) {
        System.out.print("输入两位数:");
        int a = (int) (Math.random() * 10);
        int n = PrintPatten.input.nextInt();
        String c = String.valueOf(n);
        String d = String.valueOf(a);
        String index1 = String.valueOf(c.charAt(0));
        String index2 = String.valueOf(c.charAt(1));
        if (n == a) {
            System.out.println("获得一万美元");
        } else if (d.contains(index1) && d.contains(index2) && !index1.equals(index2)) {
            System.out.println("获得三千美元");
        } else if (d.contains(index1) || d.contains(index2)) {
            System.out.println("获得一千美元");
        } else {
            System.out.println("没有获得");
        }
    }
}
