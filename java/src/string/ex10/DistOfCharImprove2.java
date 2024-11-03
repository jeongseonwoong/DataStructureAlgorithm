package string.ex10;

import java.util.*;


public class DistOfCharImprove2 {
    public static void solution(String str, char c, ArrayList<Integer> list){
        Queue<Integer > queue = new LinkedList<Integer>();
        for(int i=0; i<list.size();i++){
            if(list.get(i)==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int current = queue.poll();
            int currentDistance = list.get(current);

            if(current -1 >=0 && list.get(current-1)>currentDistance+1){
                list.set(current-1,currentDistance+1);
                queue.add(current-1);
            }
            if(current +1 < list.size() && list.get(current+1)>currentDistance+1){
                list.set(current+1,currentDistance+1);
                queue.add(current+1);
            }
        }

        for (Integer i : list) {
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(s.length(),Integer.MAX_VALUE));
        for(int i=0;i < list.size(); i++){
            if(s.charAt(i) == c){
                list.set(i,0);
            }
        }
        solution(s,c,list);
    }
}
