package practise;

public class Test_20 {
    public static void main(String[] args) {
        for (int denominator = 2; denominator < 141; denominator++) {
            for (int numerator = 1; numerator < denominator; numerator++) {
                if (numerator * denominator == 140) {
                    if (isSimplest(numerator, denominator) && isHaveCommonFactor(numerator, denominator)) {
                        System.out.println(numerator + "/" + denominator);
                    }
                }

            }
        }
    }

    public static boolean isHaveCommonFactor(int num_1, int num_2) {
        for (int i = 2; i < num_2; i++) {
            if (num_1 % i == 0 && num_2 % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSimplest(int num_1, int num_2) {
        if (num_1 == 1 && num_2 == 2) {
            return true;
        }
        return num_2 % num_1 != 0;
    }
}