package practise;

public class Test_53 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6, 5, 7, 46, 7, 545, 7, 45, 9, 1};
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
        int new_length = duplicateRemoval(arr);
        for (int j = 0; j < new_length; j++) {
            System.out.print(arr[j] + "  ");
        }
    }

    // 使用快慢指针原地删除
    private static int duplicateRemoval(int[] arr) {
        int index = 0;
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    private static void quickSort(int[] arr, int left, int right) {
        int i = left, j = right;
        int key = arr[left];
        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            while (i < j && key >= arr[i]) {
                i++;
            }
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, i + 1, right);
        }

    }
}