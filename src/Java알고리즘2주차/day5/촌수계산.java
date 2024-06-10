package Java알고리즘2주차.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:14148kb 시간:124ms
    촌수를 계산하는 문제 DFS 경로 탐색 사용 시작 노드로부터 목표 노드까지의 촌수를 계산
    촌수 관계가 없는 두 지점일 경우 초기값을 -1로 설정하여 그대로 출력
 */
public class 촌수계산 {
    static ArrayList<Integer>[] graph;
    static boolean[] checked;
    static int res = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N + 1];
        checked = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(X,Y,0);
        System.out.println(res);
    }
    public static void dfs(int start, int end, int count) {
        if (start == end) {
            res = count;
            return;
        }
        checked[start] = true;
        for (int nextNode : graph[start]) {
            if (!checked[nextNode]) {
                dfs(nextNode, end, count + 1);
            }
        }
    }
}