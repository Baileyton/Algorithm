package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:15824kb 시간:152ms
    주어진 다섯 숫자 중 적어도 세 개로 나누어지는 가장 작은 수를 찾는 문제
    1부터 시작하여 각 숫자로 나누어지는 횟수를 세고, 그 횟수가 세 번 이상일 때 해당 숫자를 출력
*/
public class Q1145_적어도대부분의배수 {
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