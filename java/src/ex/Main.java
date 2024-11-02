package ex;

import java.util.Scanner;

public class Main {

    public static int solution(int L, int R, int s){
        int LeftFirstLevel;
        int RightFirstLevel;
        if(s!=0){
            LeftFirstLevel = 2*Math.abs(L-s)+1;
            RightFirstLevel = 2*(R-s);
        }
        else{
            LeftFirstLevel = 2*Math.abs(L)+1;
            RightFirstLevel = 2*(R);
        }
        if(LeftFirstLevel<RightFirstLevel){
            return LeftFirstLevel;
        }
        return RightFirstLevel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] prints = new int[times];
        for(int i=0; i<times; i++){
            int[] inputs = new int[3];
            for(int j=0; j<3; j++)
                inputs[j] = sc.nextInt();
            prints[i] = solution(inputs[0], inputs[1], inputs[2]);
        }

        for (int print : prints) {
            System.out.println(print);
        }
    }
}
