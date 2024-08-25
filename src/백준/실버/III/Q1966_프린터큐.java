package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
    메모리:15072kb 시간:124ms
*/
public class Q1966_프린터큐 {

    static LinkedList<int[]> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
            queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < N; i++){
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            sb.append(solution(M)).append("\n");
        }

        System.out.println(sb);
    }

    static int solution(int M) {
        int findIt = 0;

        while (!queue.isEmpty()) {

            int[] first = queue.poll();
            boolean isMax = true;

            for (int i = 0; i < queue.size(); i++) {

                if (first[1] < queue.get(i)[1]) {

                    queue.offer(first);

                    for (int j = 0; j < i; j++) {
                        queue.offer(queue.poll());
                    }

                    isMax = false;
                    break;
                }
            }

            if (!isMax) {
                continue;
            }

            findIt++;

            if (first[0] == M) {
                break;
            }
        }

        return findIt;
    }
}