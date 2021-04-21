package hyt.algorithm;

/**
 * @Author huyouting
 * @Date 2021/3/12 14:39
 * @Description:
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] a = {5, 13, 3, 6, 19, 8, 1, 15, 7, 9, 4, 2, 11, 16};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        //间隔
        for (int gap = 4; gap > 0; gap /= 2) {
            //插入排序
            int j;
            //注意是i++，不是i+gap
            for (int i = gap; i < a.length; i++) {
                int temp = a[i];
                for (j = i - gap; j >= gap - 1 && a[j] > temp; j = j - gap) {
                    a[j + gap] = a[j];
                }
                a[j + gap] = temp;
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
