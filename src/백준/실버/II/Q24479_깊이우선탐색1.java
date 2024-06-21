package 백준.실버.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
    메모리:92276kb 시간:1036ms
        1    N은 노드의 수,
       / \   간선의 수 M에 따라
      2   3  (1,2), (1,3), (2,4), (2,5) 그래프를 구성
     / \     1을 시작으로 DFS 시작, 1을 방문하고 방문 순서를 기록, ...
    4   5    4를 방문하고 인접노드 탐색 시 없으므로 5로 이동
    N은 노드의 수, M은 간선의 수, R은 시작 노드 그래프를 표현하기 위해 ArrayList 배열 사용
    각 노드의 인접 노드를 오름차순으로 방문하기 위해 정렬한 후, DFS를 수행하여 방문 순서를 기록한다.
 */
public class Q24479_깊이우선탐색1 {
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
            Collections.sort(graph[i]);
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(order[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int node) {
        visited[node] = true;
        order[node] = count++;

        for (int newNode : graph[node]) {
            if (!visited[newNode]) {
                dfs(newNode);
            }
        }
    }
}