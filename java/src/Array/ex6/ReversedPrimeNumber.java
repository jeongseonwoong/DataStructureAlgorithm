package array.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversedPrimeNumber {
    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int result=0;
            while(tmp > 0){
                int t = tmp % 10;
                tmp = tmp / 10;
                result = result*10 +t;
            }
            boolean flag = true;
            if(result == 1) flag = false;
            for(int j=2;j<=Math.sqrt(result);j++){
                if(result % j == 0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                answer.add(result);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] arr = new int[times];
        for (int i = 0; i < times; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i : solution(times, arr))
            System.out.print(i + " ");
    }
}
