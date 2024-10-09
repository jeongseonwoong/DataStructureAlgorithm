package string.ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class Code {
    public static String solution(int num, String str){
        String answer = "";
        for(int i = 0; i < num; i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int binary = Integer.parseInt(tmp,2);
            System.out.println(binary);
            answer+=(char)binary;
            str=str.substring(7);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(),sc.next()));
    }
}
