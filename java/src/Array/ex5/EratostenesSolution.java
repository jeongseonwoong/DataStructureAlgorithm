package array.ex5;

import java.util.Arrays;
import java.util.Scanner;

public class EratostenesSolution {
    public static void solution(int n){
        int[] arr = new int[n+1];
        Arrays.fill(arr,0);
        int count = 0;
        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                count ++;
                for(int j=1; j*i<=n; j++){
                    arr[j*i]=1;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }
}
