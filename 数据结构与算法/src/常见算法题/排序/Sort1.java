package 常见算法题.排序;

/**
 * @Author: Dazhou Li
 * @Description:
 * @CreateDate: 2019/3/31 0031 21:35
 */
public class Sort1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 2, 4, 6, 8, 10, 12, 14, 13, 16, 17, 13, 45};
        //冒泡排序
        //bubbleSort(array);
        //直接插入排序
        //insertSort(array);
        //简单选择排序
        //selectSort(array);
        //希尔排序
        shellSort(array);
    }

    //冒泡排序
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.print("冒泡排序结果是： ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    //直接插入排序
    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        System.out.print("直接插入排序结果是： ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    //简单选择排序
    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.print("简单选择排序结果是： ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    //希尔排序
    private static void shellSort(int[] array) {
        //增量gap，并逐步缩小增量
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int j = i;
                while (j - gap >= 0 && array[j - gap] > array[j]) {
                    int temp = array[j - gap];
                    array[j - gap] = array[j];
                    array[j] = temp;
                    j -= gap;
                }
            }
        }
        System.out.print("希尔排序结果是： ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

}
