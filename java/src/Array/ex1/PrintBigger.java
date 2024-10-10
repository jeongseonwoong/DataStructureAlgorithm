package Array.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintBigger {
    public static void solution(int times,String nums){
        List<Integer> stringList = new ArrayList<Integer>();
        for (String string : nums.split(" ")) {
            stringList.add(Integer.valueOf(string));
        }
        int pre=0;
        for(int i : stringList){
            if(i>pre)
                System.out.print(i+" ");
            pre=i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        solution(i,nums);
    }
}
