package Java알고리즘2주차.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:73188kb 시간:288ms
    최소 이동 횟수를 구해야 하므로 -> BFS 사용
    시작 위치에서부터 모든 이동 가능한 경우를 탐색하고, 목표 위치에 도달하면 최소 이동 횟수를 반환
    방문한 위치는 큐에 추가되고 중복 방문을 방지하기 위해 방문 여부를 체크한다.
 */
public class 나이트의이동 {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            int l = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            System.out.println(bfs(l, startX, startY, endX, endY));
        }
    }
    public static int bfs(int l, int startX, int startY, int endX, int endY) {
        visited = new boolean[l][l];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];

            if (x == endX && y == endY) {
                return count;
            }

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny, count + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return 0;
    }
}