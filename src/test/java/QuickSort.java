import org.jetbrains.annotations.NotNull;

class QuickSort {
    public static void main(String[] args) {
        int[] arr = {60, 55, 48, 37, 10, 90, 84, 36};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void swap(int @NotNull [] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

    }

    public static void quickSort(int @NotNull [] arr, int left, int right) {
        int i = left;
        int j = right;
        int key = arr[left];

        while (i < j) {
            while (i < j && arr[j] <= key) {    // 降序;   arr[j] >= key 为升序
                j--;
            }
            while (i < j && arr[i] >= key) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        //一次快排结束
        //把与枢轴key相同的元素移到枢轴最终位置周围
        arr[left] = arr[i];
        arr[i] = key;
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, j + 1, right);
        }
    }


    // 之后的代码都为优化快速排序

    public static void insertSort(int[] arr, int left, int right) {
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j > left; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static int SelectPivotMedianOfThree(int @NotNull [] arr, int low, int high) {
        int mid = low + ((high - low) >> 1);//计算数组中间的元素的下标
        //三数取中法
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

    private static void quickSort_2(int[] arr, int low, int high) {
        int first = low;
        int last = high;

        int left = low;
        int right = high;

        int leftLen = 0;
        int rightLen = 0;

        if (high - low + 1 < 10) {
            insertSort(arr, low, high);
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
        quickSort_2(arr, first, low - 1 - leftLen);
        quickSort_2(arr, low + 1 + rightLen, last);
    }


}
