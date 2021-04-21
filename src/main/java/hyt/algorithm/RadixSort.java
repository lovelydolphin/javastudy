package hyt.algorithm;

import java.util.Arrays;

/**
 * @Author huyouting
 * @Date 2021/3/17 11:13
 * @Description:
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] a = {421, 240, 115, 532, 305, 430, 124};
        int[] result = sort(a);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] a) {
        int[] result = new int[a.length];
        int[] count = new int[10];

        for (int i = 0; i < 3; i++) {
            int division = (int) Math.pow(10, i);
            System.out.println(division);
            for (int j = 0; j < a.length; j++) {
                int num = a[j] / division % 10;

                System.out.println(num + "");

                count[num]++;
            }
            System.out.println();
            System.out.println(Arrays.toString(count));

            for (int m = 1; m < count.length; m++) {
                count[m] = count[m] + count[m - 1];
            }

            System.out.println(Arrays.toString(count));

            for (int n = a.length-1; n >=0 ; n--) {
                int num =a[n]/division%10;
                result[--count[num]]=a[n];
            }

            System.arraycopy(result,0,a,0,a.length);
            Arrays.fill(count,0);
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
