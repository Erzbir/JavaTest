package practise;

public class Test_6 {
    public static void main(String[] args) {
        int floor = PrintPatten.input.nextInt();
        for (int i = 1; i <= floor; i++) {
            PrintPatten.printAsterisk(i);
            System.out.println();
        }
    }
}

// PrintPatten 是我自己定义的类, 定义在Main.java中



