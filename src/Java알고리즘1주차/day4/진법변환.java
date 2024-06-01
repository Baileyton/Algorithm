package Java알고리즘1주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14316kb 시간:128ms
*/
public class 진법변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String str = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        NFormToTen(str, B);
    }

    // B진법을 10진법으로 변환하는 메소드
    public static void NFormToTen(String str, int B) {
        char[] nums = str.toCharArray(); // 문자열을 문자 배열로 변환
        int res = 0;

        // 문자 배열을 순회하면서 각 문자를 10진수로 변환하여 합산
        for (char num : nums) {
            if (num >= 'A') // 문자인 경우
                res = res * B + (num - 'A' + 10);
            else // 숫자인 경우
                res = res * B + (num - '0');
        }
        System.out.println(res);
    }
}