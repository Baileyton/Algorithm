package 백준.브론즈.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14188kb 시간:124ms
    N개 꼭짓점 중 5개의 꼭짓점으로 별을 만드는 것이므로,
    NC5로 조합 수를 계산하면 된다.
 */
public class Q30821_별자리가될수있다면 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long nume = 1;
        for (int i = N; i > N - 5; i--) {
            nume *= i;
        }
        long deno = 120; // 5! 이므로 120

        long result = nume / deno;

        System.out.println(result);
    }
}