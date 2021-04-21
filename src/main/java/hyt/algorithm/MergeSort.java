package hyt.algorithm;

/**
 * @Author huyouting
 * @Date 2021/3/15 9:56
 * @Description:
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {1, 5, 4, 7, 8, 3, 6, 9, 11};
        sort(a, 0, a.length - 1);
        print(a);
    }

    static void sort(int[] a, int left, int right) {
        if (left == right) {
            return;
        }
        //分成两半
        int mid = left + (right - left) / 2;
        //左边排序
        sort(a, left, mid);
        //右边排序
        sort(a, mid + 1, right);
        merge(a, left, mid + 1, right);
    }

    private static void merge(int[] a, int leftPtr, int rightPtr, int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while (i <= mid && j <= rightBound) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
                k++;
            } else {
                temp[k] = a[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= rightBound) {
            temp[k++] = a[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            a[leftPtr + m] = temp[m];
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
