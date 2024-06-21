package 백준.실버.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:88968kb 시간:1028ms
    너비 우선 탐색(BFS)을 수행하여 시작 노드로부터 각 노드까지의 최단 거리를 계산
    방문한 노드는 큐에 추가하고, 해당 노드의 인접 노드를 방문할 때마다 순서를 기록, 인접 노드를 오름차순으로 방문하기 위해 인접 리스트를 정렬한다.
 */
public class Q24444_너비우선탐색1 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] order;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        order = new int[N + 1];
        count = 1;

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            graph[i].sort(null);
        }

        bfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(order[i]).append('\n');
        }
        System.out.println(sb);
    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        order[start] = count++;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int nextNode : graph[node]) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.add(nextNode);
                    order[nextNode] = count++;
                }
            }
        }
    }
}