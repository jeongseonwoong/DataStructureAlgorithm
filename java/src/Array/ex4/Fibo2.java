package array.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibo2 {
    public static void solution(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        if(n>=1) arr.add(1);
        if(n>=2) arr.add(1);

        for(int i=2;i<n; i++){
            int nextFibo = arr.get(i -1) + arr.get(i-2);
            arr.add(nextFibo);
        }

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
