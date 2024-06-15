package Java알고리즘3주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14276kb 시간:128ms
    각 층의 각 호수에 거주하는 사람 수를 계산하고,  0층의 n호에는 n명이 살고, k층의 n호에는 k-1층의 1호부터 n호까지의 사람 수를 합한 만큼 사람이 산다.
    원하는 층과 호수에 거주하는 사람 수를 계산하여 출력
*/
public class 부녀회장이될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] dp = new int[k + 1][n + 1];

            for (int j = 1; j <= n; j++) {
                dp[0][j] = j;
            }

            for (int x = 1; x <= k; x++) {
                for (int y = 1; y <= n; y++) {
                    dp[x][y] = dp[x][y - 1] + dp[x - 1][y];
                }
            }

            System.out.println(dp[k][n]);
        }
    }
}