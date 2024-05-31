package Java알고리즘1주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14252kb 시간:120ms
    이중 for 문을 사용하여 O(N^2)의 시간 복잡도를 가짐
    실행 횟수는 n * (n - 1) / 2, 최고 차수는 2
*/
public class 알고리즘의수행시간4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()) ;
        System.out.println(n*(n-1)/2);
        System.out.println(2);
    }
}