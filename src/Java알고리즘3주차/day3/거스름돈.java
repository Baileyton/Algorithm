package Java알고리즘3주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14224kb 시간:120ms
    금액을 지불한 후 남은 거스름돈을 최소한의 동전 개수를 반환해야 하므로,
    큰 단위의 동전부터 순차적으로 나누고, 나머지를 다음 단위의 동전으로 처리
 */
public class 거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pay = Integer.parseInt(br.readLine());
        int change = 1000 - pay;
        int[] money = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        for (int j : money) {
            if (change >= j) {
                cnt += change / j;
                change = change % j;
            }
        }
        System.out.println(cnt);
    }
}