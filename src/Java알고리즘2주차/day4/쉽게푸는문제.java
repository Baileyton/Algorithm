package Java알고리즘2주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14584kb 시간:136ms
    범위 A부터 B까지의 수를 포함하는 숫자열을 생성하여 각 숫자를 해당 숫자의 값만큼 반복하여 배열한 뒤
    범위 A부터 B까지의 숫자 합을 구하여 결과를 출력
 */
public class 쉽게푸는문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;
        for(int i = 1; i <= B; i++) {
            for (int j = 1; j <= i; j++) {
                count++;

                if(A<=count && count<=B) result += i;
            }
        }
        System.out.println(result);
    }
}