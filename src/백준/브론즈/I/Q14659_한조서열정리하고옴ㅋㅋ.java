package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:19324kb 시간:404ms
    오른쪽 방향으로 자신보다 낮은 높이의 산을 카운트 하고,
    각 산에서의 최대 카운트를 구하여 출력
 */
public class Q14659_한조서열정리하고옴ㅋㅋ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] height = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int maxCnt = 0;

        for (int i = 0; i < N - 1; i++) {
            int cnt = 0;
            for (int j = i + 1; j < N; j++) {
                if(height[i] > height[j]) cnt++;
                else break;
            }
            if (cnt > maxCnt) maxCnt = cnt;
        }
        System.out.println(maxCnt);
    }
}