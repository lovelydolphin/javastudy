package hyt.algorithm;

/**
 * @Author huyouting
 * @Date 2021/3/12 14:01
 * @Description:
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        sort(a);
        print(a);
    }

    /**
     * 类似冒泡排序，每次比较
     *
     * @param a
     */
    static void sort1(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }
    }

    /**
     * 找出插入位置，其他数据往后移
     *
     * @param a
     */
    static void sort(int[] a) {
        int j;
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (j = i - 1; j >= 0 && a[j] > temp; j=j-1) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
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
