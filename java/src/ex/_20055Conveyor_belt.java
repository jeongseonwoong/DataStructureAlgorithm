package ex;

import java.util.Arrays;
import java.util.Scanner;

public class _20055Conveyor_belt {
    public static int solution(int N, int K, int[] belt){
        boolean[] robots = new boolean[N];
        int cnt=0;
        Arrays.fill(robots,false);
        while(isOk(belt, K)){
            int tmp=belt[belt.length-1];
            for(int i = belt.length-1; i > 0 ; i--){
                belt[i] = belt[i-1];
            }
            belt[0]=tmp;

            for(int i= robots.length -1; i > 0; i--){
                robots[i] = robots[i-1];
            }
            robots[robots.length-1] = false;
            robots[0]=false;

            for(int i = robots.length-1; i > 0 ; i--){
                if(robots[i-1] &&!robots[i] && belt[i]>0){
                    robots[i] = robots[i-1];
                    robots[i-1] = false;
                    belt[i]--;
                }
            }

            if(belt[0]>0){
                robots[0]=true;
                belt[0]--;
            }

            cnt++;
        }
        return cnt;
    }
    public static boolean isOk(int[] belt,int K){
        int count=0;
        for (int j : belt) {
            if (j == 0) {
                count++;
            }
            if (count >= K)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] belt = new int[2*N];
        for(int i = 0; i < 2*N; i++){
            belt[i] = sc.nextInt();
        }
        System.out.println(solution(N, K, belt));
    }

}
