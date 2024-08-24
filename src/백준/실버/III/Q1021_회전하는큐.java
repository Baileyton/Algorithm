package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
    메모리:14312kb 시간:100ms
*/
public class Q1021_회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // Deque를 사용하여 큐를 구현
        Deque<Integer> deque = new LinkedList<>();

        // 1부터 N까지의 숫자를 덱에 삽입
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int[] target = new int[M];
        // 뽑아낼 수들의 위치를 배열에 저장
        st = new StringTokenizer(br.readLine()); // 새로운 입력을 받음
        for (int i = 0; i < M; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0; // 최소 회전 횟수

        for (int i = 0; i < M; i++) {
            int targetIndex = 0;
            // 덱에서 target[i]의 위치를 찾음
            for (int num : deque) {
                if (num == target[i]) {
                    break;
                }
                targetIndex++;
            }

            int leftRotation = targetIndex; // 왼쪽으로 회전할 때의 횟수
            int rightRotation = deque.size() - targetIndex; // 오른쪽으로 회전할 때의 횟수

            // 더 적은 회전수를 선택하여 회전
            if (leftRotation <= rightRotation) {
                // 왼쪽으로 회전
                for (int j = 0; j < leftRotation; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            } else {
                // 오른쪽으로 회전
                for (int j = 0; j < rightRotation; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }

            // 숫자를 덱에서 제거
            deque.pollFirst();
        }

        System.out.println(count);
    }
}