package array.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibo {
    public static int fibo(int n){
        if(n>1){
             return fibo(n-1) + fibo(n-2);
        }else if(n==1){
            return 1;
        }else{
            return 0;
        }
    }
    public static int solution(int n){

        return fibo(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
