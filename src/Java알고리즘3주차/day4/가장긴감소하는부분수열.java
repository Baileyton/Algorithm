package Java알고리즘3주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
    메모리:14636kb 시간:152ms
    각 요소에 대해 이전 요소들과 비교하며 감소하는 수열을 형성하고, 그 길이를 기록
    기록된 길이 중 가장 큰 값을 출력
*/
public class 가장긴감소하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] memo = new int[N];
        memo[0] = 1;

        for (int i = 1; i < N; i++) {
            memo[i] = 1;
            for (int j = 0; j < i; j++) {
                if ( A[i] < A[j]) {
                    memo[i] = Math.max(memo[i], memo[j] + 1);
                }
            }
        }

        int answer = Arrays.stream(memo).max().getAsInt();
        System.out.println(answer);
    }
}