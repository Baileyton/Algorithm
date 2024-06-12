package Java알고리즘3주차.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14028kb 시간:120ms
    지각시간 + (지각시간 * 지각시간) <= 수업시간(d)
    만족하는 가장 큰 값이 최대 지각 시간이 된다.
 */
public class 지각 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(br.readLine());

            for (int j = 0; j < d; j++) {
                if (j + (j * j) <= d) result = j;
            }

            System.out.println(result);
        }
    }
}