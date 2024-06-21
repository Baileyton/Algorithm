package 백준.실버.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
    메모리:27764kb 시간:528ms
    우선 순위 큐를 활용하여 숫자를 관리하며, 절댓값을 기준으로 정렬한다.
    입력된 숫자가 0인 경우, 힙이 비어있는지 확인한 후에 출력하고, 그렇지 않은 경우 숫자를 우선 순위 큐에 추가한다.
 */
public class Q11286_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) {
                return o1 - o2;
            } else {
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                int answer = pq.isEmpty() ? 0 : pq.poll();
                System.out.println(answer);
            } else {
                pq.offer(x);
            }
        }

    }
}