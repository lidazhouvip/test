package 笔试题;

import java.util.Scanner;

/**
 * @Author: Dazhou Li
 * @Description:求两个数最大公约数
 * @CreateDate: 2019/4/3 0003 10:04
 */
public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //法一：辗转相除法：6%8=6
        System.out.println(gcdfunc(a,b));
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
