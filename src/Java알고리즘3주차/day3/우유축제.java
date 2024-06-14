package Java알고리즘3주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14348kb 시간:108ms
    0 -> 1 -> 2 -> 0 .. 순서로 우유를 마심.
    각 우유의 종류를 순차적으로 비교하면서 우유를 마시면 카운트
 */
public class 우유축제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] milk = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            milk[i] = Integer.parseInt(st.nextToken());
        }

        int milkNum = 0;
        int cnt = 0;
        for (int j : milk) {
            if (milkNum == j) {
                cnt++;
                milkNum++;
                if(milkNum == 3) milkNum = 0;
            }
        }

        System.out.println(cnt);
    }
}