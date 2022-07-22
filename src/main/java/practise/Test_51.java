package practise;

import java.util.Scanner;

public class Test_51 {
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[10];
    int sum = 0;
    double aver = 0;

    public static void main(String[] args) {
        Test_51 temp = new Test_51();
        temp.input();
        temp.sumAndAver();
        temp.display();
        System.out.println(temp.sum + "  " + temp.aver);
        int temp1 = temp.scan.nextInt();
        int temp2 = temp.scan.nextInt();
        temp.input(temp1, temp2);
        temp.display();
        temp.sumAndAver();
        System.out.println(temp.sum + "  " + temp.aver);
    }

    private void display() {
        for (int j : this.arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private void input(int... length) {
        if (length.length > 0) {
            expandArray(this.arr.length + length.length);
            for (int i = this.arr.length - length.length, j = 0; j < length.length; i++, j++) {
                this.arr[i] = length[j];
            }
        } else {
            for (int i = 0; i < this.arr.length; i++) {
                this.arr[i] = scan.nextInt();
            }
        }
    }

    private void sumAndAver() {
        for (int j : arr) {
            this.sum += j;
        }
        this.aver = (double) sum / arr.length;
    }

    private void expandArray(int length) {
        int[] arr2 = new int[length];
        System.arraycopy(this.arr, 0, arr2, 0, arr.length);
        this.arr = arr2;
    }
}