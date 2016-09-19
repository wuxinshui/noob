package org.noob.codewars.train.learn.prac160919;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by FujiRen on 2016/9/19.
 * Task
 * Given a string, S, of length N that is indexed from  0 to N-1 , print its even-indexed and odd-indexed characters as space-separated strings on a single line (see the Sample below for more detail).
 * Sample Input
 * <p>
 * 2
 * Hacker
 * Rank
 * <p>
 * Sample Output
 * <p>
 * Hce akr
 * Rn ak
 * <p>
 */
public class Even_indexedOdd_ndexed {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        List<String> list=new ArrayList<>();
        for(int i=0;i<T;i++){
            String str=sc.next();
            list.add(str);
        }
        for(int j=0;j<list.size();j++){
            print(list.get(j).toString().toCharArray());
        }
    }
    private static void print(char[] string){
        StringBuilder evenSb=new StringBuilder();
        StringBuilder oddSb=new StringBuilder();
        for(int i=0;i<string.length;i++){
            if(i%2==0){
                evenSb.append(string[i]);
            }else{
                oddSb.append(string[i]);
            }
        }
        System.out.print(evenSb.toString()+" ");
        System.out.print(oddSb.toString());
        System.out.println();
    }

}
