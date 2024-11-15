package array.ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridMaxSum {

    public static void solution(int[][]map){
        int max=0;
        int[] rowSum = new int[map.length];
        int[] colSum = new int[map[0].length];
        int[] crowSum = new int[2];
        int sum;
        for(int i = 0; i < map.length; i++){
            sum =0;
            for(int j = 0; j < map[i].length; j++){
                sum+=map[i][j];
            }
            if(sum > max){
                max = sum;
            }
            rowSum[i] = sum;
        }


        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                colSum[j] += map[i][j];
                if(colSum[j] > max){
                    max = colSum[j];
                }
            }
        }
        int col=0;
        int row=0;
        sum=0;
        while(row <= map.length-1 && col <= map.length-1){
            sum+=map[row++][col++];
        }
        if(sum > max){
            max = sum;
        }
        crowSum[0]=sum;

        col=map.length-1;
        row=0;
        sum=0;
        while(row <= map.length-1 && col <= map.length-1){
            sum+=map[row++][col--];
        }
        if(sum > max){
            max = sum;
        }
        crowSum[1]=sum;

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        solution(map);

    }
}
