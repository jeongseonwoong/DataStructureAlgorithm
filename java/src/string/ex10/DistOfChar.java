package string.ex10;

import java.util.Scanner;

public class DistOfChar {


    public static void solution(String str, Character c){
        int[] dist = new int[str.length()];
        int i=0;
        for(char ch : str.toCharArray()){
            if(ch == c){
                dist[i]=-1;
                for(int j=0;j<str.length();j++){
                    if((dist[j]==0 && j!=i)||(dist[j]>Math.abs(i-j))){
                        dist[j]= Math.abs(i-j);
                    }
                }
            }
            i++;
        }

        for (int k : dist) {
            if(k==-1){
                k=0;
            }
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next(),sc.next().charAt(0));
    }
}
