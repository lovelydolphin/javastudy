package hyt.algorithm;

/**
 * @Author huyouting
 * @Date 2021/3/12 10:37
 * @Description:
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            System.out.println("minPos: " + minPos);

            swap(arr, i, minPos);

            System.out.println("经过第" + i + "次循环之后，数组的内容");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
