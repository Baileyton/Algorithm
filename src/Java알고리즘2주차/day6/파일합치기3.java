package Java알고리즘2주차.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:268248kb 시간:3172ms
    각 파일을 합치는 데 드는 최소 비용을 계산해야 한다. 가장 작은 두 파일을 합치는 것 -> 우선순위 큐를 사용
    우선순위 큐에 파일 크기를 추가한 후, 가장 작은 두 파일을 합쳐 큐에 다시 넣는 과정을 반복하여 최소 비용을 계산합니다. 각 테스트 케이스마다 이 과정을 수행하고 결과를 출력
 */
public class 파일합치기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Long> pq = new PriorityQueue<>();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long answer = 0;
            pq.clear();
            int K = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < K; j++) {
                pq.add(Long.parseLong(st.nextToken()));
            }

            while (!pq.isEmpty()) {
                if(pq.size() == 1) {
                    break;
                }

                long sum = pq.poll() + pq.poll();
                answer += sum;
                pq.add(sum);
            }
            System.out.println(answer);
        }
    }
}