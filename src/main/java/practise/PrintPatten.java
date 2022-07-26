package practise;

public class PrintPatten {
    public static void printSpace(int floor, int i) {
        for (int j = 0; j < floor - i; j++) {
            System.out.print(" ");
        }
    }

    public static void printAsterisk(int i) {
        for (int m = 0; m < 2 * i - 1; m++) {
            System.out.print("*");
        }
    }

    public static void printDiamond(int i) {
        for (int j = 0; j < 2 * i - 1; j++) {
            if (j == 0 || j == 2 * i - 2 || j == i && i < 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }


    public static void printCrossAsterisk(int i) {
        if (i > 2) {
            for (int m = 0; m < 2; m++) {

                System.out.print("*");
                for (int j = 0; j < i - 2; j++) {
                    System.out.print(" ");
                }
                if (m < 1) {
                    System.out.print(("*"));
                }
                for (int j = 0; j < i - 2; j++) {
                    System.out.print(" ");
                }
            }
        } else {
            for (int m = 0; m < 2 * i - 1; m++) {
                System.out.print("*");

            }
        }
    }
}

