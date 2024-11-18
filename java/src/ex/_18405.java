package ex;

import java.util.*;

public class _18405 {
    public static class Pair<X,Y,T>{
        X x;
        Y y;
        T t;
        public Pair(X x, Y y, T t){
            this.x = x;
            this.y = y;
            this.t = t;
        }

        public X getX(){
            return x;
        }

        public Y getY(){
            return y;
        }

        public T getT(){
            return t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int second = sc.nextInt();
        int row= sc.nextInt();
        int col= sc.nextInt();
        int time=0;
        int[][] visited = new int[n][n];
        while(time++ < second){
            visited = solution(map, k, row, col,second,visited);
        }
        System.out.println(map[row-1][col-1]);
    }

    public static int[][] solution(int[][]map, int k, int row, int col, int second, int[][] visited){
        PriorityQueue<Pair<Integer,Integer,Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Pair::getT));
        for(int i=0;i <map.length; i++){
            for(int j=0;j <map[i].length;j++){
                if(map[i][j]!=0  && visited[i][j]!=1){
                    visited[i][j]=1;
                    queue.add(new Pair<>(i,j,map[i][j]));
                }
            }
        }
        int[] nRow = {1,0,-1,0};
        int[] nCol = {0,1,0,-1};

        while(!queue.isEmpty()){
            Pair<Integer,Integer,Integer> cur = queue.poll();
            for(int i=0; i<nRow.length; i++){
                int transRow = cur.getX()+nRow[i];
                int transCol = cur.getY()+nCol[i];
                if(transRow>=0 && transRow<map.length && transCol>=0 && transCol<map.length && map[transRow][transCol]==0){
                    map[transRow][transCol]=map[cur.getX()][cur.getY()];
                }
            }
        }
        return visited;
    }

}
