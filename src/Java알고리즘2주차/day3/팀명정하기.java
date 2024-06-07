package Java알고리즘2주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:14328kb 시간:128ms
    팀 이름을 짓는 규칙이 2가지로 입학 연도를 가지고 하는 경우 -> year 배열 생성 후 정렬 및 100으로 나눈 나머지를 출력
    문제를 많이 해결한 학생 부터 첫 글자를 나열한 문자열 -> HashMap 으로 저장 후 문제 수를 내림차순으로 변환
 */
public class 팀명정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] year = new int[3];
        HashMap<Integer, String> students = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int solved = Integer.parseInt(st.nextToken());
            year[i] = Integer.parseInt(st.nextToken());
            String student = st.nextToken();

            students.put(solved, student);
        }
        Arrays.sort(year);
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(students.entrySet());
        entryList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        StringBuilder yearTeamName = new StringBuilder();
        StringBuilder firstTeamName = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            yearTeamName.append(year[i]%100);
            firstTeamName.append(entryList.get(i).getValue().charAt(0));
        }
        System.out.println(yearTeamName);
        System.out.println(firstTeamName);
    }
}