package string.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ex4_1 {
    public static ArrayList<String> solution(List<String> stringList){
        ArrayList<String> returnList = new ArrayList<>();
        for(String s : stringList){
            StringBuilder tmp = new StringBuilder(s);
            tmp.reverse();
            returnList.add(tmp.toString());
        }
        return returnList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            stringList.add(sc.next());
        }
        solution(stringList).forEach(s -> System.out.println(s));
    }
}
