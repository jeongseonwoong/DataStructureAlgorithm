package string.ex2;

import java.util.Scanner;

public class ex2_1 {
    public static String solution(String str){
        StringBuilder str2= new StringBuilder();
        for (char x:str.toCharArray()) {
            if(x>=65 && x<=90){
                x+=32;
            }else if(x>=97 && x<=122){
                x-=32;
            }
            str2.append(x);
        }
        return str2.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
