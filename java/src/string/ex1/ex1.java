package string.ex1;

import java.util.Scanner;

public class ex1 {

    public static int solution(String str, char c){
        int count=0;
        str = str.toUpperCase();
        /*foreach 함수의 뒤에는 iterator를 제공하는 collection framework들만 들어올 수 있음.
         String을 collection framework인 Array로 변환해주기 위해 string.toCharArray()를 해준다.*/
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
