package 백준.실버.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14140kb 시간:100ms
 */
public class Q1316_그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 단어의 개수 입력
        int count = 0; // 그룹 단어의 개수를 셀 변수

        for (int i = 0; i < n; i++) {
            String word = br.readLine(); // 단어 입력
            if (isGroupWord(word)) {
                count++; // 그룹 단어이면 count 증가
            }
        }

        System.out.println(count); // 결과 출력
    }

    // 그룹 단어인지 판별하는 메소드
    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26]; // 각 문자의 출현 여부를 기록할 배열
        char prev = '\0'; // 이전 문자를 저장할 변수 (초기값은 null character)

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i); // 현재 문자

            // 이전 문자와 현재 문자가 다르고, 현재 문자가 이미 나온 적이 있다면 그룹 단어가 아님
            if (current != prev) {
                if (seen[current - 'a']) {
                    return false;
                }
                seen[current - 'a'] = true; // 현재 문자 출현 기록
                prev = current; // 이전 문자를 갱신
            }
        }
        return true; // 모든 조건을 통과하면 그룹 단어
    }
}