package 백준.실버.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
    메모리:17332kb 시간:196ms
    
*/
public class Q1251_단어나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        ArrayList<String> wordList = new ArrayList<>();

        for(int i = 1; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                String word1 = new StringBuilder(input.substring(0, i)).reverse().toString();
                String word2 = new StringBuilder(input.substring(i, j)).reverse().toString();
                String word3 = new StringBuilder(input.substring(j)).reverse().toString();

                String combined = word1 + word2 + word3;

                wordList.add(combined);
            }
        }

        Collections.sort(wordList);

        System.out.println(wordList.get(0));
    }
}