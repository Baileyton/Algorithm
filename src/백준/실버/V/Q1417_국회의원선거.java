package 백준.실버.V;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/*
    메모리:14372kb 시간:104ms
*/
public class Q1417_국회의원선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 및 pq 삽입
        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N - 1; i++) { // 다솜이를 제외한 N-1명 입력
            pq.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            dasom++;
            pq.add(pq.poll() - 1);  // 가장 큰 표를 얻은 후보의 표를 하나 빼서 다시 큐에 넣음
            count++;
        }

        System.out.println(count);
    }
}