package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14208kb 시간:124ms
    MenOfPassion 알고리즘은 1 ~ n까지의 숫자 중 3개의 숫자 조합을 구하는 알고리즘
    삼중 for 문을 사용하여 O(N^3)의 시간 복잡도를 가짐
    실행 횟수는 n * (n - 1) * (n - 2) / (3 * 2 * 1), 최고 차수는 3
*/
public class Q24267_알고리즘의수행시간6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()) ;
        System.out.println(n * (n - 1) * (n - 2) / (3*2));
        System.out.println(3);
    }
}