package hyt.algorithm;

/**
 * @Author huyouting
 * @Date 2021/3/16 10:13
 * @Description:
 */
public class QuickSort {

    public static void main(String[] args) {
        //int[] a = {1, 2, 3, 8, 7, 6};
        //int[] a = {1, 2, 3, 8, 1, 7, 6};
        //int[] a = {7, 3, 2, 8, 1, 9, 5, 4, 6,10};
        //int[] a = {7, 3, 2, 8, 1, 9, 5, 4, 6,0};
        //int[] a = {7, 3, 2, 8, 1, 9, 5, 4, 6, 10};
        //int[] a = {7, 3, 2, 6, 8, 1, 9, 5, 4, 6, 10,6};
        //int[] a = {4, 6};
        int[] a = {7, 3, 2, 10, 8, 1, 9, 5, 4, 6};
        sort(a, 0, a.length - 1);
        print(a);

    }

    static void sort(int[] a, int leftBound, int rightBound) {
        if (leftBound >= rightBound) {
            return;
        }
        int mid = partition(a, leftBound, rightBound);
        sort(a, leftBound, mid - 1);
        sort(a, mid + 1, rightBound);
    }

    static int partition(int[] a, int leftBound, int rightBound) {
        int pivot = a[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while (left <= right) {
            while (left <= right && a[left] <= pivot) {
                left++;
            }
            while (left <= right && a[right] > pivot) {
                right--;
            }

            System.out.println("before swap: left->" + left + " right->" + right);

            if (left < right) {
                swap(a, left, right);
            }

            System.out.print("--");
            print(a);
            System.out.println();
        }
        swap(a, left, rightBound);

        return left;
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
