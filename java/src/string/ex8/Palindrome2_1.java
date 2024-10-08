package string.ex8;

import java.util.Scanner;

public class Palindrome2_1 {
    public static void solution(String s){
        s = s.toLowerCase().replaceAll("[^a-z]","");
        StringBuilder sb = new StringBuilder(s);
        String s2= sb.reverse().toString();
        if(s.equals(s2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);
    }
}
