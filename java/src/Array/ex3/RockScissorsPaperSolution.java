package Array.ex3;

import java.util.Scanner;

public class RockScissorsPaperSolution {
    public static void solution(Integer times, int[] aInfos, int[] bInfos){
        Character[] results = new Character[times];
        for(int i = 0; i < times; i++){
            if(aInfos[i]==bInfos[i]){
                results[i]='D';
            }else if(aInfos[i]==1 && bInfos[i]==3){results[i]='A';}
            else if(aInfos[i]==2 && bInfos[i]==1){results[i]='A';}
            else if(aInfos[i]==3 && bInfos[i]==2){results[i]='A';}
            else results[i]='B';
        }
        for(int i = 0; i < times; i++){
            System.out.println(results[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] aInfos = new int[times];
        int[] bInfos = new int[times];
        for(int i = 0; i < times; i++){
            aInfos[i] = sc.nextInt();
        }
        for(int i = 0; i < times; i++){
            bInfos[i] = sc.nextInt();
        }
        solution(times,aInfos,bInfos);
    }
}
