package Java알고리즘3주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
    메모리:16732kb 시간:176ms
    N개의 카드 중에서 K개의 카드 조합을 재귀함수로 모두 구하고,
    Set으로 중복된 카드 조합은 추가하지 않고, 크기를 출력하여 조합의 개수를 반환
 */
public class 카드놓기 {
    static int[] cards;
    static boolean[] visited;
    static Set<String> combinations;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        cards = new int[N];
        visited = new boolean[N];
        combinations = new HashSet<>();

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(br.readLine());
        }

        findCombinations(K, "");

        System.out.println(combinations.size());
    }
    public static void findCombinations(int k, String num) {
        if(k == 0) {
            combinations.add(num);
            return;
        }

        for (int i = 0; i < cards.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                findCombinations(k-1, num + cards[i]);
                visited[i] = false;
            }
        }
    }
}