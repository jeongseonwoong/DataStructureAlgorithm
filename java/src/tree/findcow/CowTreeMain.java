package tree.findcow;

import java.util.Scanner;

public class CowTreeMain {

    public static void solution(int myData,int cowData){
        CowTree tree = new CowTree(myData);
        tree.insert(cowData);
        Integer searchLevel = tree.search(cowData);
        System.out.println(searchLevel.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), sc.nextInt());
    }
}
