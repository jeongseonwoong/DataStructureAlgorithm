package string.ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSpecificString {

    public static char[] solution(String str){
        int last = str.length()-1;
        int first = 0;
        char[] charArray = str.toCharArray();
        while(first<last){
            if(!Character.isLetter(charArray[first]))
                first++;
            else if(!Character.isLetter(charArray[last]))
                last--;
            else{
                char temp = charArray[first];
                charArray[first] = charArray[last];
                charArray[last] = temp;
                first++;
                last--;
            }
        }
        return charArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }
}
