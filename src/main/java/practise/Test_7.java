package practise;

public class Test_7 {
    public static void main(String[] args) {
        System.out.print("输入层数:");
        int floor = PrintPatten.input.nextInt();
        printPatten(floor);
    }

    private static void printPatten(int floor) {
        for (int i = 1; i <= floor; i++) {
            PrintPatten.printSpace(floor, i);
            PrintPatten.printAsterisk(i);
            System.out.println();
        }
    }
}
