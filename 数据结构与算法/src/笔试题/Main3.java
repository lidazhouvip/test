package 笔试题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String str = input.nextLine();
        String[] s = str.split(" ");
        int n = Integer.parseInt(s[0]);
        for(int i = 0;i< n;i++){
            String a = s[i+1];
            while(a.length()>8){
                list.add(a.substring(0,8));
                a=a.substring(8);
            }
            for(int j = a.length();j<8;j++){
                a+=0;
            }
            list.add(a);
        }

        Collections.sort(list);
        String ss = "";
        for(int i =0;i<list.size();i++){
            ss+=(list.get(i)+" ");
        }

        System.out.println(ss.trim());
    }

}
