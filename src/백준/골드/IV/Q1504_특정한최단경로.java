package 백준.골드.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:68880kb 시간:656ms
    주어진 그래프에서 두 개의 특정 정점(v1과 v2)을 반드시 거쳐야 하므로,
    1 -> v1 -> v2 -> N과 1 -> v2 -> v1 -> N의 두 가지 경로를 고려하여
    각각의 최단 거리를 다익스트라 알고리즘으로 계산, 각 경로의 총 거리를 비교하여 더 짧은 경로를 선택
 */
public class Q1504_특정한최단경로 {

    static List<Node>[] nodes;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            nodes[from].add(new Node(to, weight));
            nodes[to].add(new Node(from, weight));
        }

        st = new StringTokenizer(br.readLine(), " ");
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        long result1 = 0;
        long result2 = 0;

        // 1 -> v1 -> v2 -> N
        result1 += dijkstra(1, v1);
        result1 += dijkstra(v1, v2);
        result1 += dijkstra(v2, N);

        // 1 -> v2 -> v1 -> N
        result2 += dijkstra(1, v2);
        result2 += dijkstra(v2, v1);
        result2 += dijkstra(v1, N);

        long result = Math.min(result1, result2);

        if (result >= Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

    }
    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance = new int[nodes.length];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (distance[cur.to] < cur.weight) {
                continue;
            }

            for (Node node : nodes[cur.to]) {
                if (distance[cur.to] + node.weight < distance[node.to]) {
                    distance[node.to] = distance[cur.to] + node.weight;
                    pq.offer(new Node(node.to, distance[node.to]));
                }
            }
        }
        return distance[end];
    }
}
class Node implements Comparable<Node> {

    public int to;
    public int weight;

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }

    public Node(
            int end,
            int cost
    ) {
        this.to = end;
        this.weight = cost;
    }
}