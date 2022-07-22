package practise;

public class Temp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 1, 5, 6, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int key = arr[left];
        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            while (i < j && key >= arr[i]) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        return i;
    }

    public static void quickSort(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int pivot = partition(arr, i, j);
        quickSort(arr, i, pivot - 1);
        quickSort(arr, pivot + 1, j);
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}



