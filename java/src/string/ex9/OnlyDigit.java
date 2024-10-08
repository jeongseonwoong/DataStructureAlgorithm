package string.ex9;

import java.util.Scanner;

public class OnlyDigit {

    public static void solution(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(char x:str.toCharArray()){
            if(Character.isDigit(x)){
                stringBuilder.append(x);
            }
        }
        System.out.println(Integer.parseInt(stringBuilder.toString()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        solution(next);
    }
}
