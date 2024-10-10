package Array.ex2;

import java.util.Scanner;

public class TallerStudent {
    public static void solution(int nums, String students){
        String[] s = students.split(" ");
        int pre=0;
        int count = 0;
        for(int i = 0; i < s.length; i++){
            if(Integer.parseInt(s[i])>pre) {
                count++;
                pre = Integer.parseInt(s[i]);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        sc.nextLine();
        String students = sc.nextLine();
        solution(nums,students);
    }
}
