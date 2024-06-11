package Java알고리즘2주차.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:23148kb 시간:176ms
    최소 이동 횟수를 구하는 문제로 BFS를 사용
    BFS를 통해 시작 위치에서 목표 위치까지 최단 경로를 탐색합니다. 큐를 사용하여 현재 위치와 이동 횟수를 관리하고, 각 위치를 방문 처리하며 탐색한다.
 */
public class 숨바꼭질 {
    static boolean[] visited = new boolean[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N, K));
    }
    public static int bfs(int start, int goal) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int steps = current[1];

            if (value == goal) {
                return steps;
            }

            int[] nextPositions = new int[]{value - 1, value + 1, value * 2};

            for (int next : nextPositions) {
                if (next >= 0 && next < visited.length && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, steps + 1});
                }
            }
        }
        return 0;
    }
}