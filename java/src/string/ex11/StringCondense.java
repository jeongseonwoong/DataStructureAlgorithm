package string.ex11;

import java.util.Scanner;

public class StringCondense {
    public static void solution(String str){
        char preChar = 'a';
        int count=1;
        for(char c : str.toCharArray()){
            if(c==preChar){
                count++;
            }else{
                if(count>1){
                    System.out.print(count);
                    count=1;
                }
                System.out.print(c);
            }
            preChar = c;
        }
        if(count>1){
            System.out.print(count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next());
    }

}
