package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14276kb 시간:128ms
*/
public class Q1072_게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int totalGames = Integer.parseInt(st.nextToken()); // 총 게임 수
        int wonGames = Integer.parseInt(st.nextToken());   // 이긴 게임 수
        int currentWinRate = (int) ((long) wonGames * 100 / totalGames); // 현재 승률
        int answer = -1; // 정답 초기화
        int left = 0;
        int right = (int) 1e9;

        while (left <= right) {
            int mid = (left + right) / 2;
            int newWinRate = (int) ((long) (wonGames + mid) * 100 / (totalGames + mid)); // 새로운 승률 계산

            if (newWinRate > currentWinRate) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }
}