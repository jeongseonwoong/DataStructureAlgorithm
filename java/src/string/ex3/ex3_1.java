package string.ex3;

import java.util.Scanner;

public class ex3_1 {
    public static String solution(String str) {
        String longest="";
        int m=Integer.MIN_VALUE;
        String[] sArray = str.split(" ");
        for(String s : sArray){
            if(s.length()>m){
                m=s.length();
                longest=s;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(solution(string));
    }
}
