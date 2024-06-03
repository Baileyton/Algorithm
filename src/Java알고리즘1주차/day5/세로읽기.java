package Java알고리즘1주차.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14324kb 시간:128ms
    5줄의 입력을 받고 str 배열에 저장, 가장 긴 문자열의 길이를 maxLength에 저장
    maxLength 길이만큼 반복하면서 if문 조건으로 문자 여부를 확인
*/
public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[5];
        int maxLength = 0;

        for(int i = 0; i < 5; i++) {
            str[i] = br.readLine();
            if (str[i].length() > maxLength) {
                maxLength = str[i].length();
            }
        }

        for(int i = 0; i < maxLength; i++) {
            for(int j = 0; j < 5; j++){
                if(i < str[j].length()) {
                    System.out.print(str[j].charAt(i));
                }
            }
        }
    }
}