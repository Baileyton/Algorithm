package 백준.실버.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:110452kb 시간:672ms

*/
public class Q9465_스티커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int t= 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][N];
            for (int n = 0; n < 2; n++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    stickers[n][j] = Integer.parseInt(st.nextToken());
                }
            }

            if (N == 1) {
                System.out.println(Math.max(stickers[0][0], stickers[1][0]));
                continue;
            }

            int[][] dp = new int[2][N];
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
            dp[0][1] = stickers[0][1] + dp[1][0];
            dp[1][1] = stickers[1][1] + dp[0][0];

            for (int i = 2; i < N; i++) {
                dp[0][i] = stickers[0][i] + Math.max(dp[1][i-1], dp[1][i-2]);
                dp[1][i] = stickers[1][i] + Math.max(dp[0][i-1], dp[0][i-2]);
            }

            System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));
        }
    }
}