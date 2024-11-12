package array.ex7;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static int solution(int[] isCorrect){
        int[]scores = new int[isCorrect.length];
        Arrays.fill(scores,0);
        int num = 0;
        int sum = 0;
        for(int i=0; i<isCorrect.length; i++){

            if(isCorrect[i] == 1){
                scores[i]= ++num;
                sum += scores[i];
            } else {
                num = 0;
                scores[i] = num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        int[] isCorrect = new int[times];
        for(int i = 0; i < times; i++){
            isCorrect[i] = sc.nextInt();
        }
        System.out.println(solution(isCorrect));
    }
}
