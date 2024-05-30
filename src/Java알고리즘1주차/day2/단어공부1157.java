package Java알고리즘1주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    HashMap<String, Integer>으로 알파벳, 빈도 수를 저장
    message 입력시 {A=1, S=2, E=2, G=1, M=1}
    Character.isLetter(c) 알파벳인 경우만 처리
*/
public class 단어공부1157 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();

        char maxChar = '?';
        int maxCount = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                int count = map.getOrDefault(c, 0) +1;
                map.put(c, count);
                if(count>maxCount) {
                    maxChar = c;
                    maxCount = count;
                } else if (count == maxCount) {
                    maxChar = '?';
                }
            }
        }

        System.out.println(maxChar);
    }
}