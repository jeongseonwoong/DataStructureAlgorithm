package array.ex8;

import java.util.Arrays;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr){
        int[] count = new int[arr.length];
        Arrays.fill(count,1);
        for(int i= 0; i < arr.length-1; i++){
            for(int j= i+1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    count[i]++;
                }
            }
        }

        for(int i= arr.length-1; i >= 1; i--){
            for(int j = i-1; j >= 0; j--){
                if(arr[j] > arr[i]){
                    count[i]++;
                }
            }
        }

        for(int i : count){
            System.out.print(i + " ");
        }
    }
}
