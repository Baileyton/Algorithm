package Java알고리즘3주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14072kb 시간:124ms
    1 = {1}로 한 개, 2 = {1+1, 2}로 2개, 3 = {1+1+1, 1+2, 2+1, 3}으로 4개
    4를 만들어 보려 한다면 4= 1+3 / 2+2 / 3+1이 된다. 1, 2, 3의 각 경우의 수에 +1, +2, +3을 해주면 4를 만들 수 있다.
    dp [n] = dp [n-1] + dp [n-2] + dp [n-3]이라는 식이 도출 된다.
*/
public class 문제123더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] testCases = new int[T];
        int maxN = 0;

        // 입력받은 값을 배열에 저장하고 최대 값을 찾음
        for (int i = 0; i < T; i++) {
            testCases[i] = Integer.parseInt(br.readLine());
            if (testCases[i] > maxN) {
                maxN = testCases[i];
            }
        }

        // DP 배열 초기화
        int[] dp = new int[maxN + 1];

        // 초기 조건 설정
        dp[0] = 1;
        if (maxN >= 1) dp[1] = 1;
        if (maxN >= 2) dp[2] = 2;
        if (maxN >= 3) dp[3] = 4;

        // DP 배열 채우기
        for (int i = 4; i <= maxN; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // 각 테스트 케이스에 대해 결과 출력
        for (int i = 0; i < T; i++) {
            System.out.println(dp[testCases[i]]);
        }
    }
}