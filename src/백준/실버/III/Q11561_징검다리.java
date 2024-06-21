package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:17436kb 시간:344ms

 */
public class Q11561_징검다리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            long target = Long.parseLong(br.readLine());
            long left = 1;
            long right = (long) Math.sqrt(2 * target);
            long answer = 0;

            while (left <= right) {
                long mid = (left + right) / 2;
                if (mid * (mid + 1) / 2 <= target) {
                    answer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println(answer);
        }
    }
}