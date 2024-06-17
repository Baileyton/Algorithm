package Java알고리즘3주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14356kb 시간:128ms
*/
public class 돌게임 {

    static boolean[] dp = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (dp(N)) System.out.println("SK");
        else System.out.println("CY");
    }

    public static boolean dp(int n) {
        dp[1] = true;
        dp[2] = false;
        dp[3] = true;

        for ( int i = 4; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3];
        }

        return dp[n];
    }
}