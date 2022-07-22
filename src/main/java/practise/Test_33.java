package practise;

public class Test_33 {
    public static void main(String[] args) {
        System.out.print("输入层数:");
        int floor = PrintPatten.input.nextInt();
        int floor_1 = floor >> 1;
        for (int i = 1; i <= floor_1; i++) {
            PrintPatten.printSpace(floor_1, i - 1);
            PrintPatten.printDiamond(i);
            System.out.println();
        }
        if (floor % 2 != 0) {
            for (int i = 0; i < floor; i++) {
                if (i == 0 || i == floor - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = floor_1; i >= 1; i--) {
            PrintPatten.printSpace(floor_1, i - 1);
            PrintPatten.printDiamond(i);
            System.out.println();
        }

    }
}
