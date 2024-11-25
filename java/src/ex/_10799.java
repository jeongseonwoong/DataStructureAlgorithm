package ex;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class _10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

    public static void solution(String str){
        Stack<Character> stack = new Stack<>();
        int tmp=0;
        int sum=0;
        char previousChar='c';
        for(char c : str.toCharArray()){
            if(c == '('){
                stack.add('(');
            }
            if(c == ')'){
                stack.pop();
                if(previousChar == '('){
                    sum+=stack.size();
                }else{
                    sum++   ;
                }
            }
            previousChar = c;
        }
        System.out.println(sum);
    }
}
