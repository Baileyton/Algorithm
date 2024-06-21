package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14200kb 시간:124ms
*/
public class Q1213_팰린드롬만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int sLength = s.length();
        int[] charCount = new int[26]; // 알파벳 소문자의 빈도를 저장할 배열

        // 각 문자의 빈도를 카운트
        for (char c : s.toCharArray()) {
            charCount[c - 'A']++;
        }

        // 팰린드롬을 만들 수 있는지 체크
        int oddCount = 0;
        char oddChar = 0;
        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 == 1) {
                oddCount++;
                oddChar = (char) (i + 'A');
            }
        }

        if (oddCount > 1) {
            System.out.print("I'm Sorry Hansoo");
        } else {
            char[] result = new char[sLength];
            int left = 0;
            int right = sLength - 1;

            // 팰린드롬 문자열 구성
            for (int i = 0; i < 26; i++) {
                while (charCount[i] >= 2) {
                    result[left++] = (char) (i + 'A');
                    result[right--] = (char) (i + 'A');
                    charCount[i] -= 2;
                }
            }

            // 문자열의 길이가 홀수인 경우, 중간에 홀수 빈도의 문자를 배치
            if (oddCount == 1) {
                result[sLength / 2] = oddChar;
            }

            System.out.print(result);
        }
    }
}