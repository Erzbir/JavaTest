package practise;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 4, 1, 0, 2, 9, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // j对应的下标才是最下值
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
        }
    }

    public static void selectSort_2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, i, j);
                }
            }
        }
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
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
                swap(arr, i, j);
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, j + 1, right);
        }

    }

    private static void InsertSort(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static int SelectPivotMedianOfThree(int[] arr, int low, int high) {
        int mid = low + ((high - low) >> 1);//计算数组中间的元素的下标

        //使用三数取中法选择枢轴
        if (arr[mid] > arr[high])//目标: arr[mid] <= arr[high]
        {
            swap(arr, mid, high);
        }
        if (arr[low] > arr[high])//目标: arr[low] <= arr[high]
        {
            swap(arr, low, high);
        }
        if (arr[mid] > arr[low]) //目标: arr[low] >= arr[mid]
        {
            swap(arr, mid, low);
        }
        //此时，arr[mid] <= arr[low] <= arr[high]
        return arr[low];
        //low的位置上保存这三个位置中间的值
        //分割时可以直接使用low位置的元素作为枢轴，而不用改变分割函数了
    }

    private static void QSort(int[] arr, int low, int high) {
        int first = low;
        int last = high;

        int left = low;
        int right = high;

        int leftLen = 0;
        int rightLen = 0;

        if (high - low + 1 < 10) {
            InsertSort(arr, low, high);
            return;
        }

        //一次分割
        int key = SelectPivotMedianOfThree(arr, low, high);//使用三数取中法选择枢轴

        while (low < high) {
            while (high > low && arr[high] >= key) {
                if (arr[high] == key)//处理相等元素
                {
                    swap(arr, right, high);
                    right--;
                    rightLen++;
                }
                high--;
            }
            arr[low] = arr[high];
            while (high > low && arr[low] <= key) {
                if (arr[low] == key) {
                    swap(arr, left, low);
                    left++;
                    leftLen++;
                }
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = key;

        //一次快排结束
        //把与枢轴key相同的元素移到枢轴最终位置周围
        int i = low - 1;
        int j = first;
        while (j < left && arr[i] != key) {
            swap(arr, i, j);
            i--;
            j++;
        }
        i = low + 1;
        j = last;
        while (j > right && arr[i] != key) {
            swap(arr, i, j);
            i++;
            j--;
        }
        QSort(arr, first, low - 1 - leftLen);
        QSort(arr, low + 1 + rightLen, last);
    }

}