package 常见算法题.排序;

import java.util.Arrays;

/**
 * @Author: Dazhou Li
 * @Description:堆排序
 * @CreateDate: 2019/4/3 0003 21:55
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = {
                4, 6, 8, 5, 9, 23, 4, 5, 21, 67, 43, 98, 65, 23, 1, 7, 9, 43, 65, 23, 11, 66, 33, 77, 81, 20, 50
        };
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
        for (int j = array.length - 1; j > 0; j--) {
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void adjustHeap(int[] array, int i, int length) {
        int temp = array[i];
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if (k + 1 < length && array[k] < array[k + 1]) {
                k++;
            }
            if (array[k] > temp) {
                array[i] = array[k];
                i = k;
            } else {
                break;
            }
        }
        array[i] = temp;
    }
}
