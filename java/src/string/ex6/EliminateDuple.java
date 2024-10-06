package string.ex6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EliminateDuple {
    public static String solution(String str){
        StringBuilder newString = new StringBuilder();
        for(char s :str.toCharArray()){
            if(!newString.toString().contains(String.valueOf(s))){
                newString.append(s);
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
