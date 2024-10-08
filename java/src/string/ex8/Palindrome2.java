package string.ex8;

import java.util.Scanner;

public class Palindrome2 {

    public static Boolean solution(String str) {
        int start=0;
        int end=str.length()-1;
        str=str.toLowerCase();
        while(start<end){
            while(!Character.isLetter(str.charAt(start))){
                start++;
            }
            while(!Character.isLetter(str.charAt(end))){
                end--;
            }
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if(solution(string)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
