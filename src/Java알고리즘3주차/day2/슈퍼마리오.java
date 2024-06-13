package Java알고리즘3주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14144kb 시간:104ms
    10개의 점수를 리스트에 저장, 순서대로 더하면서 누적 점수를 계산
    누적 점수와 100의 차이를 비교하여 100에 가장 가까운 점수를 저장
 */
public class 슈퍼마리오 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] scores = new int[10];
        for (int i = 0; i < 10; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            sum += scores[i];
            if(Math.abs(100-sum) <= Math.abs(100-answer)) {
                answer = sum;
            }
        }
        System.out.println(answer);
    }
}