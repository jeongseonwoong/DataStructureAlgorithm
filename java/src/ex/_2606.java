package ex;

import java.util.*;

public class _2606 {
    public static class Computer{
        int number;
        Queue<Computer> linkedComputers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerNum = sc.nextInt();
        Computer[] computers = new Computer[computerNum+1];
        for(int i=1; i<=computerNum; i++){
            computers[i].number = i;
        }
        int networks = sc.nextInt();

        for(int i=0; i<networks; i++){
            int linkedComputer1 = sc.nextInt();
            int linkedComputer2 = sc.nextInt();
            computers[linkedComputer1].linkedComputers.add(computers[linkedComputer2]);
        }
        solution(computers);
    }

    public static void solution(Computer[] computers){
        Set<Integer> linkedComputer = new HashSet<>();
        Computer search = computers[1];
        while(!search.linkedComputers.isEmpty()){
            linkedComputer.add(search.number);
            if(search.linkedComputers.isEmpty())
                break;
            else
                search.linkedComputers.poll();
        }

    }
}
