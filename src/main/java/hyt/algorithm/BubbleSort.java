package hyt.algorithm;

/**
 * @Author huyouting
 * @Date 2021/3/12 11:44
 * @Description:
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--){
            for (int j = 0; j < 8; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
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
