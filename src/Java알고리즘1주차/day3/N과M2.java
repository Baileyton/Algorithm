package Java알고리즘1주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:14180kb 시간:128ms
    주어진 문제의 답을 구하기 위해 현재 상태에서 가능한 모든 후보군을 탐색하는 알고리즘
    DFS 기반이며 보통 재귀함수 사용
*/
public class N과M2 {
    static int N, M;
    static int[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new int[M];

        // 백트래킹 탐색을 시작
        dfs(1, 0);

        System.out.println(sb.toString());
    }

    public static void dfs(int start, int depth) {
        // depth가 M과 같아지면 현재까지 선택된 숫자를 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(visited[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        // start부터 N까지 반복하며 수를 선택
        for (int i = start; i <= N; i++) {
            visited[depth] = i;
            dfs(i + 1, depth + 1); // 선택된 수의 다음 수를 위해 start를 i + 1로 설정
        }
    }
}