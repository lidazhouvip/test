package 笔试题;

import java.util.LinkedList;
import java.util.Scanner;

//拆分数组
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while (sc2.hasNextLine()) {
            String str = sc2.nextLine();
            if (str.equals("") || str == null){
                break;
            }
                list.add(str);
        }
        splitArray(list,n);
    }

    private static void splitArray(LinkedList<String> list,int n) {
        String s = "";
        while (!list.isEmpty()) {
            String str2 = list.peekFirst();
            String[] array = str2.split(",");
            if (array.length > n) {
                for (int i = 0; i < n; i++) {
                    s += array[i] + ",";
                }
                String s1 = "";
                for (int i = n; i < array.length - 1; i++) {
                    s1 += array[i] + ",";
                }
                s1 += array[array.length - 1];
                list.removeFirst();
                list.add(s1);
                continue;
            }
            if (array.length == n) {
                for (int i = 0; i < n; i++) {
                    s += array[i] + ",";
                }
                list.removeFirst();
                continue;
            }
            if (array.length < n) {
                for (int i = 0; i < array.length; i++) {
                    s += array[i] + ",";
                }
                list.removeFirst();
                continue;
            }
        }
        String[] array = s.split(",");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1]);
    }
}
