package string.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static String solution(String str) {
        String longest="";
        StringBuilder builder = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isLetter(x)){
                builder.append(x);
            }else{
                if(longest.length()<builder.length()){
                    longest=builder.toString();
                }
                builder.delete(0, builder.length());
            }
        }
        if(longest.length()<builder.length()){
            longest=builder.toString();
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(solution(string));
    }
}
