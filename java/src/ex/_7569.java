package ex;

import java.util.*;

public class _7569 {
    public static class Pair<X,Y>{
        X x;
        Y y;
        public Pair(X x, Y y){
            this.x = x;
            this.y = y;
        }

        public X getX(){
            return x;
        }

        public Y getY(){
            return y;
        }
    }

    public static int solution(int row, int col, int[][] box){
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(box[i][j]==1){
                    queue.add(new Pair<>(i,j));
                }
            }
        }

        while(!queue.isEmpty()){
            Pair<Integer,Integer> current = queue.poll();
            if(current.getX()-1 >= 0 && box[current.getX()-1][current.getY()] == 0){
                box[current.getX()-1][current.getY()] = box[current.getX()][current.getY()] + 1;
                queue.add(new Pair<>(current.getX()-1, current.getY()));
            }
            if(current.getX()+1<row && box[current.getX()+1][current.getY()] == 0){
                box[current.getX()+1][current.getY()] = box[current.getX()][current.getY()] + 1;
                queue.add(new Pair<>(current.getX()+1, current.getY()));
            }
            if(current.getY()-1>=0 && box[current.getX()][current.getY()-1] == 0){
                box[current.getX()][current.getY()-1] = box[current.getX()][current.getY()] + 1;
                queue.add(new Pair<>(current.getX(), current.getY()-1));
            }
            if(current.getY()+1<col && box[current.getX()][current.getY()+1] == 0){
                box[current.getX()][current.getY()+1] = box[current.getX()][current.getY()] + 1;
                queue.add(new Pair<>(current.getX(), current.getY()+1));
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(box[i][j]==0){
                    return -1;
                }
                pq.add(box[i][j]);
            }
        }
        return pq.poll()-1;
    }

    public static void main(String[] args) {
        int col, row, count;
        Scanner sc = new Scanner(System.in);
        col = sc.nextInt();
        row = sc.nextInt();
        int[][] box = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                box[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(row, col, box));
    }
}
