package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:14120kb 시간:124ms
    입력 받은 HashMap에 저장한 후 술 소비량을 기준으로 내림차순으로 정렬
    정렬된 리스트의 첫 번째 요소(가장 많은 술을 소비한 대학)를 출력
 */
public class Q11557_YangjojangofTheYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> universityMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String university = st.nextToken();
                int alcohol = Integer.parseInt(st.nextToken());
                universityMap.put(university, alcohol);
            }

            // HashMap의 엔트리들을 ArrayList로 변환
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(universityMap.entrySet());
            // Comparator를 사용하여 술 소비량을 기준으로 내림차순(큰 값이 먼저 오도록)으로 정렬
            entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            System.out.println(entryList.get(0).getKey());
        }
    }
}