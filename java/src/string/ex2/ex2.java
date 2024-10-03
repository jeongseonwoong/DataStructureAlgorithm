package string.ex2;

import java.util.Scanner;

public class ex2 {
    public static String solution(String str){
        StringBuilder str2= new StringBuilder();
        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)){
                str2.append(Character.toUpperCase(c));
            }else{
                str2.append(Character.toLowerCase(c));
            }
        }
        return str2.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
