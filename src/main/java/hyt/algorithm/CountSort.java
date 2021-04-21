package hyt.algorithm;

import java.util.Arrays;

/**
 * @Author huyouting
 * @Date 2021/3/17 10:15
 * @Description:
 */
public class CountSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
        int[] result = sort(a);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] a) {
        int[] result = new int[a.length];

        int[] count = new int[10];

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        System.out.println(Arrays.toString(count));

//        for (int i = 0, j = 0; i < count.length; i++) {
//            while (count[i]-- > 0) {
//                result[j++] = i;
//            }
//        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        System.out.println(Arrays.toString(count));

        for (int i = a.length - 1; i >= 0; i--) {
            result[--count[a[i]]] = a[i];
        }

        return result;
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
