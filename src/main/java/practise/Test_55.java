package practise;

public class Test_55 {
    public static void main(String[] args) {
        int[] nums = {4, 8, 9, 1, 3, 2, 5, 4, 7, 8, 10};
        insertSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }

    }

    private static boolean isOddNumber(int num) {
        if (num == 1) {
            return false;
        }
        return (num & num - 1) == 0;
    }

    //使用插入排序的思想进行排序
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (!isOddNumber(arr[j]) && isOddNumber(arr[j - 1])) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}