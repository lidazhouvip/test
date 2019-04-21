package 常见算法题.排序;

import java.util.Arrays;

/**
 * @Author: Dazhou Li
 * @Description:快速排序
 * @CreateDate: 2019/4/1 0001 21:15
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 22, 56, 87, 94, 22, 88};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
        if(left>=right){
            return;
        }
        dealPivot(array,left,right);
        int pivot=right-1;
        int i=left;
        int j=right-1;
        while (true){
            while (array[++i]<array[pivot]){}
            while (j>i && array[--j]>array[pivot]){}
            if (i<j){
                swap(array,i,j);
            }else {
                break;
            }
        }
        if (i<right){
            swap(array,i,right-1);
        }
        quickSort(array,left,i-1);
        quickSort(array,i+1,right);
    }

    private static void dealPivot(int[] array, int left, int right) {
        int mid=(left+right)/2;
        if (array[left]>array[right]){
            swap(array,left,right);
        }
        if (array[left]>array[mid]){
            swap(array,left,mid);
        }
        if (array[mid]>array[right]){
            swap(array,mid,right);
        }
        swap(array,mid,right-1);
    }

    private static void swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
