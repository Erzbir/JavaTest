package practise;

public class Test_35 {
    public static void main(String[] args) {
        System.out.print("输入高:");
        double h = PrintPatten.input.nextDouble();
        System.out.print("输入半径:");
        double r = PrintPatten.input.nextDouble();
        double s = 2 * Math.PI * r * (r + h);
        double v = Math.PI * Math.pow(r, 2) * h;
        System.out.println(s + " " + v);
    }
}
