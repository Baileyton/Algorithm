package Java알고리즘1주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    StringTokenizer으로 입력한 문자열을 공백(" ")을 기준으로 나눈다.
    countTokens() 메서드는 StringTokenizer에 의해 분리된 토큰의 개수를 반환합니다.
*/
public class 단어의갯수1152 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 공백(" ")을 기준으로 문자열을 분리하여 StringTokenizer에 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.print(st.countTokens());
    }
}