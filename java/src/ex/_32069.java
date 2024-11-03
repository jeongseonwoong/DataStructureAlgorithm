package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class _32069 {
    public static void solution(long L,int N, int K, ArrayList<Long> road){
        int [] arr = new int[(int)L+1];
        int p=10000000;
        for(int i=0; i<L+1; i++){
            if(road.get(i)==0) {
                p = 0;
                arr[i] = p++;
            }else{
                arr[i]=p++;
            }

        }

        int ps=10000000;
        for(long i=L; i>=0; i--){
            if(road.get((int)i)==0) {
                ps = 0;
                arr[(int)i] = ps++;
            }else{
                if(arr[(int)i]>ps)
                    arr[(int)i]=ps++;
            }
        }

        int[] arr2 = Arrays.stream(arr).sorted().toArray();
        for(int i=0; i<K; i++){
            System.out.println(arr2[i]);
        }
    }
    public static void main(String[] args) {
        long L;
        int N,K;
        int lightIndex;
        Scanner sc = new Scanner(System.in);
        L = sc.nextLong();
        N = sc.nextInt();
        K = sc.nextInt();
        int capacity= (int) (L+1);
        ArrayList<Long> road = new ArrayList<Long>(capacity);
        for(int i=0; i<=L; i++){
            road.add(1L);
        }
        for(int i=0;i<N;i++){
            lightIndex = sc.nextInt();
            road.add(lightIndex,0L);
        }
        solution(L,N,K,road);
    }
}
