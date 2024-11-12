package zigzeg;

import java.util.Arrays;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = sc.nextInt();
        solution(N,number);
    }

    enum Direction {
        UP,LEFT,RIGHT,DOWN
    }

    public static void solution(int n, int number){
        int[][] map = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(map[i],0);
        }
        int middle = n/2;
        int row = middle;
        int col = middle;

        int rIndex = 0,cIndex =0;
        Direction direction = Direction.UP;
        int cnt=1;
        while(cnt<=Math.pow(n,2)){
            if(direction == Direction.UP /*&& row - 1 >= 0 && map[row-1][col] == 0*/){
                if(number == cnt){
                    rIndex = row+1;
                    cIndex = col+1;
                }
                map[row--][col] = cnt++;
                if(cnt==Math.pow(n,2)){break;}
                if(col + 1 < n && map[row][col+1] == 0)
                    direction = Direction.RIGHT;
            }
            if(direction == Direction.RIGHT /*&& col + 1 < n && map[row][col+1] == 0*/){
                if(number == cnt){
                    rIndex = row+1;
                    cIndex = col+1;
                }
                map[row][col++] = cnt++;
                if(cnt==Math.pow(n,2)){break;}
                if(row + 1 < n && map[row+1][col] == 0)
                    direction = Direction.DOWN;
            }
            if(direction == Direction.DOWN /*&& row + 1 < n && map[row + 1][col] == 0*/){
                if(number == cnt){
                    rIndex = row+1;
                    cIndex = col+1;
                }
                map[row++][col] = cnt++;
                if(cnt==Math.pow(n,2)){break;}
                if(col -1 >=0 && map[row][col-1] == 0)
                    direction = Direction.LEFT;
            }
            if(direction == Direction.LEFT /*&& col - 1 >=0  && map[row][col-1] == 0*/){
                if(number == cnt){
                    rIndex = row+1;
                    cIndex = col+1;
                }
                map[row][col--] = cnt++;
                if(cnt==Math.pow(n,2)){break;}
                if(row - 1 >= 0 && map[row-1][col] == 0)
                    direction = Direction.UP;
            }
        }
        map[row][col]=cnt;
        if(number == cnt){
            rIndex = row+1;
            cIndex = col+1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(rIndex + " " + cIndex);


    }
}
