package Java알고리즘3주차.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
    메모리:14280kb 시간:136ms
    거스름돈 문제와 풀이 방식과 동일, 동전을 오름차순으로 입력 받으므로,
    동전의 가치가 내림차순으로 정렬을 해야하는 과정이 필요
*/
public class 동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] pay = new Integer[N];
        for (int i = 0; i < N; i++) {
            pay[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(pay, Collections.reverseOrder());

        int cnt = 0;
        for (int change : pay) {
            if ( K >= change) {
                cnt += K / change;
                K = K % change;
            }
        }

        System.out.println(cnt);
    }
}