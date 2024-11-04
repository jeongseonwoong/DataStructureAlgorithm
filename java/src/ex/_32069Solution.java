package ex;

import java.util.*;
public class _32069Solution {

    public static void solution(long L, int N, int K, ArrayList<Long> road) {
        int[] arr = new int[(int) L + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <= L; i++) {
            if (road.get(i) == 0) {
                queue.add(i);
                arr[i] = 0;
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDistance = arr[current];

            if (current - 1 >= 0 && arr[current - 1] > currentDistance + 1) {
                arr[current - 1] = currentDistance + 1;
                queue.add(current - 1);
            }
            if (current + 1 <= L && arr[current + 1] > currentDistance + 1) {
                arr[current + 1] = currentDistance + 1;
                queue.add(current + 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int distance : arr) {
            pq.add(distance);
            if (pq.size() > K) {
                pq.poll();
            }
        }

        ArrayList<Integer> result = new ArrayList<>(pq);
        Collections.sort(result);
        for (int value : result) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Long> road = new ArrayList<>(Collections.nCopies((int) L + 1, 1L));
        for (int i = 0; i < N; i++) {
            int lightIndex = sc.nextInt();
            road.set(lightIndex, 0L);
        }
        solution(L, N, K, road);
    }

}
