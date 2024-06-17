package Java알고리즘3주차.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:15824kb 시간:152ms
*/
public class 적어도대부분의배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 1;

        while (true) {
            int cnt = 0;
            for (int number : numbers) {
                if (answer % number == 0) {
                    cnt++;
                }
            }
            if(cnt >= 3) {
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}