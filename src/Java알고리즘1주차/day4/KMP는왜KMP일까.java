package Java알고리즘1주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14132kb 시간:124ms
    첫 글자와 "-"다음 첫 글자를 추출하여 새로운 문자열을 생성
*/
public class KMP는왜KMP일까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String result = KMP(str);
        System.out.println(result);
    }

    public static String KMP(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(i == 0) sb.append(str.substring(i, i+1));
            if(str.substring(i, i+1).equals("-")) sb.append(str.substring(i+1, i+2));
        }

        return sb.toString();
    }
}
