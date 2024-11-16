package array.ex10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Peak {
    public static class Pair<X,Y>{
        public X x;
        public Y y;

        Pair(X x, Y y){
            this.x = x;
            this.y = y;
        }

    }
    public static int solution(int[][] map, int n){
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(1,1));
        int result=0;
        while(!queue.isEmpty()){
            int cnt = 0;
            Pair<Integer,Integer> curC = queue.poll();
            int currentNum = map[curC.x][curC.y];

            if(map[curC.x+1][curC.y] < currentNum){
                cnt++;
            }

            if(map[curC.x-1][curC.y] < currentNum){
                cnt++;
            }

            if (map[curC.x][curC.y + 1] < currentNum) {
                cnt++;
            }

            if(map[curC.x][curC.y-1] < currentNum){
                cnt++;
            }

            if(map[curC.x][curC.y+1]!=0){
                queue.add(new Pair<>(curC.x,curC.y+1));
            }else{
                if(curC.x+1<map.length-1){
                    queue.add(new Pair<>(curC.x+1,1));
                }

            }

            if(cnt==4){
                result++;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n+2][n+2];
        for(int i=0;i<n+2;i++){
            Arrays.fill(map[i],0);
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(map,n));
    }
}
