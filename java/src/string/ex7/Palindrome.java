package string.ex7;

import java.util.Scanner;

public class Palindrome {
    public static Boolean solution(String str){
        str=str.toLowerCase();
        Boolean flag =Boolean.TRUE;
        int start =0;
        int end= str.length()-1;
        while(start < end){
            if(str.charAt(start)!=str.charAt(end))
                flag =false;
            start++;
            end--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(solution(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
