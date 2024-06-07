package Java알고리즘2주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:14432kb 시간:140ms
    입력 받은 정수 배열의 각 원소를 오름차순으로 정렬한 후,
    누적 합을 계산, 각 원소를 누적하여 더한 값의 총합을 출력 한다.
 */
public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] min = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            min[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(min);

        int sum = 0;
        int prev = 0;
        for (int i = 0; i < N; i++) {
            prev += min[i];
            sum += prev;
        }
        System.out.println(sum);
    }
}