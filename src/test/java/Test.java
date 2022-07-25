class Solution {

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }

    public static double myPow(double x, int n) {
        double ans = 1.0;
        int i = n;
        while (i != 0) {
            if (i % 2 != 0) {
                ans *= x;
            }
            x *= x;
            i >>= 1;
        }
        return n < 0 ? 1 / ans : ans;
    }
}