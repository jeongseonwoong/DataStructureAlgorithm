package string.ex10;

import java.util.Scanner;

public class DistOcCharImprove {
    public static void solution(String str, Character c) {
        int[] arr = new int[str.length()];
        int p= 100000;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == c){
                p=0;
                arr[i] =p++;
            }else{
                arr[i]=p++;
            }
        }
        int ps=100000;
        for(int i=str.length()-1;i>=0;i--) {
            if(str.charAt(i) == c){
                ps=0;
                arr[i] =ps++;
            }else{
                if(arr[i]>ps){
                    arr[i]=ps++;
                }
            }
        }

        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next(),sc.next().charAt(0));
    }
}
