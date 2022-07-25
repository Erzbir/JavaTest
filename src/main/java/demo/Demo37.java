package demo;

import java.util.Scanner;

public class Demo37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        String[] temp2 = temp.split(" ");
        int[] temp3 = new int[temp2.length];
        for (int i = 0; i < temp3.length; i++) {
            temp3[i] = Integer.parseInt(temp2[i]);
        }
        double[] arr = count(temp3);
        assert arr != null;
        System.out.println("The number of positives is " + arr[0]);
        System.out.println("The number of negative is " + arr[1]);
        System.out.println("The number of total is " + arr[2]);
        System.out.println("The number of positives is " + arr[3]);

    }

    public static double[] count(int... num) {
        if (num.length <= 0) {
            return null;
        }
        int sum = 0;
        int positive = 0;
        int negative = 0;
        int length = num.length;
        for (int j : num) {
            sum += j;
            if (j > 0) {
                positive++;
            } else if (j < 0) {
                negative++;
            } else {
                length--;
            }
        }
        return new double[]{positive, negative, sum, (double) sum / length};
    }
}
