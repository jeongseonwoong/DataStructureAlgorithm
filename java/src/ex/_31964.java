package ex;

import java.util.Scanner;

public class _31964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] houses = new int[N];
        int[] housesTime = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            housesTime[i] = sc.nextInt();
        }
        solution(N,houses,housesTime);
    }

    public static void solution(int N, int[] houses, int[] housesTime) {

        int defaultTime = Math.max(houses[N-1],housesTime[N-1]);
        int time = 2*houses[N-1];
        for(int i = 0; i < N; i++) {
            if(houses[i]<=housesTime[i]){

                if(housesTime[i] > defaultTime + houses[N-1]-houses[i]){
                    time += housesTime[i] - (defaultTime + houses[N-1]-houses[i]);
                }
            }
        }
        System.out.println(time);
    }
}
