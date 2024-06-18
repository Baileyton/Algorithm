package Java알고리즘3주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14356kb 시간:128ms
    단순 (N % 4 != 0) 이 경우 돌의 갯수가 2일 경우 "SK"가 아닌 "CY"이 출력 되어야 하므로 틀렸었다.
    각 턴에서 1개 또는 3개의 돌을 가져가는 규칙에 따라, N개의 돌에 대한 승리 여부를 DP 배열을 통해 계산
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