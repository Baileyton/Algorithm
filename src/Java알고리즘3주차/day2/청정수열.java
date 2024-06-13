package Java알고리즘3주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14144kb 시간:104ms
    1 이상 N 이하의 수로 만들 수 있는 모든 순열의 개수와 동일하다.
    모든 순열의 개수는 N!로 간단하게 계산 할 수 있다.
 */
public class 청정수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long result = 1;
        for (int i = 1; i <=N; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}