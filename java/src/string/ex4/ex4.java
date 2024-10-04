package string.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ex4 {

    public static void solution(List<String> stringList){
        for (String string : stringList) {
            Stack<Character> stack = new Stack<>();
            for(char x: string.toCharArray()){
                stack.add(x);
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            stringList.add(sc.next());
        }
        solution(stringList);
    }
}
