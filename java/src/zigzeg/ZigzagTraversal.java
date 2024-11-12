package zigzeg;

import java.util.Arrays;
import java.util.Scanner;

public class ZigzagTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String str;
        char[] rabbitsJumps = new char[K];
        str = sc.next();
        for(int i=0; i<K; i++){
            rabbitsJumps[i] = str.charAt(i);
        }
        solution(N,K,rabbitsJumps);
    }

    enum Direction {
        RIGHT,LEFTDOWN,DOWN,RIGHTUP
    }

    public static void solution(int N, int K,char[] rabbitsJumps) {
        int cnt = 1;
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(map[i], 0);
        }
        int row = 0;
        int col = -1;
        RabbitMovement.Direction direction = RabbitMovement.Direction.RIGHT;
        while (cnt <= Math.pow(N, 2)) {
            if (col == N - 1 && cnt <= Math.pow(N, 2)) {
                map[++row][col] = cnt++;
                direction = RabbitMovement.Direction.DOWN;
            }
            if (row == N - 1 && cnt <= Math.pow(N, 2)) {
                map[row][++col] = cnt++;
                direction = RabbitMovement.Direction.RIGHT;
            }
            if (row == 0 && cnt <= Math.pow(N, 2)) {
                map[row][++col] = cnt++;
                direction = RabbitMovement.Direction.DOWN;
            }
            if (col == 0 && cnt <= Math.pow(N, 2)) {
                map[++row][col] = cnt++;
                direction = RabbitMovement.Direction.RIGHT;
            }
            if (direction == RabbitMovement.Direction.RIGHT && col != N - 1 && row != 0 && cnt <= Math.pow(N, 2)) {
                map[--row][++col] = cnt++;
            }
            if (direction == RabbitMovement.Direction.DOWN && row != N - 1 && col != 0 && cnt <= Math.pow(N, 2)) {
                map[++row][--col] = cnt++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
