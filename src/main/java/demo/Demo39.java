package demo;

public class Demo39 {
    public static void main(String[] args) {
       printDivided();
    }

    public static void printDivided() {
        for (int i = 100, j = 0; i < 1000; i++) {
            if (canDivided(i)) {
                System.out.print(i + "\t");
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean canDivided(int num) {
        return num % 5 == 0 && num % 6 == 0;
    }
}
