package practise;

public class Test_1 {
    public static void main(String[] argv) {
        double a;
        double b;
        double c;
        System.out.print("enter the first side: ");
        a = PrintPatten.input.nextDouble();
        System.out.print("enter the second side: ");
        b = PrintPatten.input.nextDouble();
        System.out.print("enter the lase side: ");
        c = PrintPatten.input.nextDouble();
        double p = (a + b + c) / 2;
        double S;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("三角形面积: %f", S);
    }
}
