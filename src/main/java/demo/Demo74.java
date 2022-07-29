package demo;

import java.util.ArrayList;
import java.util.List;

class Demo74 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        Object[] arr = mesonNum();
        for (Object l : arr) {
            System.out.println(l);
        }
    }

    public static Object[] mesonNum() {
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i <= 31; i++) {
            long x = (long) Math.pow(2, i) - 1;
            if (isPrimeNum(x)) {
                arr.add(x);
            }
        }
        return arr.toArray();
    }

    public static boolean isPrimeNum(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (n >> 1) - n % 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}