package 笔试题;

import java.util.Scanner;

//求三个数最大公约数
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        String str=sc2.nextLine();

        int[] array = new int[n];
        String[] arr = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(arr[i]);
        }
        System.out.println(func(array));
    }

    private static int func(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (gcdfunc(array[i], gcdfunc(array[j], array[k]))==1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static int gcdfunc(int a, int b) {
        if (a <= 0 || b <= 0) {
            return 0;
        }

        int R;
        while ((R = a % b) > 0) {
            a = b;
            b = R;
        }
        return b;
    }

}
