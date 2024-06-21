package 백준.실버.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


/*
    메모리:49376kb 시간:628ms
    HashSet에 요소를 저장, 요소를 입력 받으면서 해당 숫자가 HashSet에 존재하는지 확인하여 결과 출력
    StringBuilder 사용으로 메모리:60348kb 시간:1600ms -> 메모리:49376kb 시간:628ms
    HashMap으로 풀이 진행 했을때 시간초과함.
 */
public class Q1920_수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hash = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            hash.add(x);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            int search = Integer.parseInt(st.nextToken());
            if(hash.contains(search)) sb.append("1\n");
            else sb.append("0\n");
        }
        System.out.println(sb);
    }
}