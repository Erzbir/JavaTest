package practise;

public class Test_11 {
    public static void main(String[] args) {
        System.out.print("输入层数:");
        int floor = PrintPatten.input.nextInt();
        printPatten(floor);
    }

    private static void printPatten(int floor) {
        int floor_2 = floor >> 1;
        for (int i = 1; i <= floor_2; i++) {
            PrintPatten.printSpace(floor_2 + 1, i);
            PrintPatten.printCrossAsterisk(i);
            System.out.println();
        }
        if (floor % 2 != 0) {
            for (int i = 0; i <= floor - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = floor_2; i >= 1; i--) {
            PrintPatten.printSpace(floor_2 + 1, i);
            PrintPatten.printCrossAsterisk(i);
            System.out.println();
        }
    }
}
