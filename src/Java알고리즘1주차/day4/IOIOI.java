package Java알고리즘1주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:24040kb 시간:292ms
*/
public class IOIOI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int count = 0; // 최종 IOI 패턴이 N번 이상 나타난 횟수
        int[] dp = new int[M];

        for (int i = 2; i < M; i++) {
            // 현재 위치에서 3글자짜리 부분 문자열을 추출
            if (s.charAt(i) == 'I' && s.charAt(i - 1) == 'O' && s.charAt(i - 2) == 'I') {
                // IOI 패턴이 발견되면 dp[i]는 두 칸 앞의 dp[i-2] 값에 1을 더한 값이 됨
                dp[i] = dp[i - 2] + 1;
                // 현재 dp[i]가 N 이상이면 카운트를 증가
                if (dp[i] >= N) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}