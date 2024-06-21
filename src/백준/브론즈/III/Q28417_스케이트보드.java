package 백준.브론즈.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
    메모리:70200kb 시간:668ms
    두 번의 런과 다섯 번의 트릭 점수를 받고, 높은 런 점수와 상위 두 개의 트릭 점수를 합산하여 계산
    최대 점수를 최종적으로 가장 높은 점수를 출력
 */
public class Q28417_스케이트보드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] runs = new int[2];
        int[] tricks = new int[5];
        int maxScore = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int a = 0; a < 2; a++) {
                runs[a] = Integer.parseInt(st.nextToken());
            }
            for (int b = 0; b < 5; b++) {
                tricks[b] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(runs);
            Arrays.sort(tricks);
            int score = runs[1] + tricks[3] + tricks[4];
            if(score > maxScore) maxScore = score;
        }
        System.out.println(maxScore);
    }
}