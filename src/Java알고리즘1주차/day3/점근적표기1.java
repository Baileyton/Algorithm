package Java알고리즘1주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:14268kb 시간:104ms
    입력을 받아서 a1, a0, c, n0를 초기화합니다.
    n0부터 100까지 반복하면서 조건 a1*n + a0 <= c*n 확인
*/
public class 점근적표기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean isTrue = true;
        for(int n = n0; n <= 100; n++) {
            if(a1 * n + a0 > c * n) {
                isTrue = false;
                break;
            }
        }
        System.out.println(isTrue ? "1" : "0");
    }
}