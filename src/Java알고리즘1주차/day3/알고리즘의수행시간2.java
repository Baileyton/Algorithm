package Java알고리즘1주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14204kb 시간:120ms
    단일 for 문을 사용하여 1부터 n까지의 범위를 반복 O(N)의 시간 복잡도
    실행 횟수 n, 다항식 최고 차항은 1을 출력
*/
public class 알고리즘의수행시간2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        System.out.println(1);
    }
}
