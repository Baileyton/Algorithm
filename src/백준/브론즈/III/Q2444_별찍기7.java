package 백준.브론즈.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14320kb 시간:104ms
*/
public class Q2444_별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 위쪽 절반
        for (int i = 0; i < N; i++) {
            // 공백
            sb.append(" ".repeat(N - i - 1));
            // 별
            sb.append("*".repeat(Math.max(0, 2 * i + 1)));
            sb.append("\n");
        }

        // 아래쪽 절반
        for (int i = N - 2; i >= 0; i--) {
            // 공백
            sb.append(" ".repeat(Math.max(0, N - i - 1)));
            // 별
            sb.append("*".repeat(Math.max(0, 2 * i + 1)));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
