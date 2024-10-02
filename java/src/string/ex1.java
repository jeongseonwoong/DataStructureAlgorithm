package string;

import java.util.Scanner;

public class ex1 {

    public static int solution(String str, char c){
        int count=0;
        str = str.toUpperCase();
        for(char x: str.toCharArray()){
            if(x==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str,c));
    }
}
