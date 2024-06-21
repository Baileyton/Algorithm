package 백준.실버.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
    메모리:14672kb 시간:144ms
    단어 목록, 후보 단어 목록 배열을 저장 후
    후보 단어 중 유효한 것 찾기
*/
public class Q28432_끝말잇기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int index = -1;
        String[] words = new String[n];
        for(int i = 0; i < n; i++) {
            words[i] = br.readLine();
            if(words[i].equals("?")) index=i;
        }

        int a = Integer.parseInt(br.readLine());
        String[] cands = new String[a];
        for(int i = 0; i < a; i++) {
            cands[i] = br.readLine();
        }

        // 후보 단어들을 '?'에 넣어보면서 유효성을 검사
        for (String cand : cands) {
            if(isValid(words, cand, index)) {
                System.out.println(cand);
                break;
            }
        }
    }

    // 끝말잇기의 유효성 검사
    public static boolean isValid(String[] words, String cand, int index) {
        HashSet<String> usedWords = new HashSet<>();
        // '?' 위치에 후보 단어를 넣습니다.
        words[index] = cand;
        // 첫 단어의 시작을 검사
        usedWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String nextWord = words[i];

            // 중복 검사
            if (usedWords.contains(nextWord)) return false;

            // 끝말잇기 규칙 검사
            if (prevWord.charAt(prevWord.length()-1) != nextWord.charAt(0)) return false;

            usedWords.add(nextWord);
        }
        return true;
    }
}