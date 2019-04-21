package 常见算法题.排序;

import java.util.Arrays;

/**
 * @Author: Dazhou Li
 * @Description:
 * @CreateDate: 2019/4/1 0001 21:45
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 2, 4, 6, 8, 10, 43, 67, 88, 54, 21, 98, 58};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int[] temp = new int[array.length];
        mergeSort(array, 0, array.length - 1, temp);
    }

    private static void mergeSort(int[] array, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(array, left, mid, temp);
        mergeSort(array, mid + 1, right, temp);
        merge(array, left, mid, right, temp);
    }

    private static void merge(int[] array, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (array[i] < array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = array[i++];
        }
        while (j <= right) {
            temp[t++] = array[j++];
        }
        t=0;
        while (left <= right) {
            array[left++] = temp[t++];
        }

    }

}
