package array.ex5;

import java.util.Scanner;

public class Eratostenes {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void solution(int num){
        int count = 0;
        for(int i = 2; i < num; i++){
            if(isPrime(i)) count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }
}
