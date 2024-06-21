package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14184kb 시간:112ms
    4 -> 1 2 1 2, 5 -> 1 2 1 2 3, 6 -> 1 2 1 2 1 2, 7 -> 1 2 1 2 1 2 3
    N / 2 만큼 "1 2 "을 반복 하고, 홀수의 경우 뒤에 3이 붙는다.

    for (int i = 0; i < N/2; i++) {
       sb.append("1 2 ");
    }
    String.repeat 메서드로 간결하게 가독성 좋게 변환
    (Intellij 에서 개선 해줌)
*/
public class Q21313_문어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append("1 2 ".repeat(Math.max(0, N / 2)));
        if (N % 2 == 1) sb.append("3");
        System.out.println(sb);
    }
}