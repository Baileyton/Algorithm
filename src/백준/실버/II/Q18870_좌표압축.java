package 백준.실버.II;

import java.io.*;
import java.util.*;

/*
    메모리:265104kb 시간:1796ms
*/
public class Q18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 좌표의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] notSortArr = new int[N]; // 정렬하기 전에 저장할 배열
        for (int i = 0; i < N; i++) {
            notSortArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int[] sortArr = notSortArr.clone(); // 기존 배열의 값을 복사해서 넣음
        Arrays.sort(sortArr); // 정렬

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // 값과 요소의 순서(출력해야하는 값)을 쌍으로 저장

        int index = 0;
        for (int i : sortArr) { // sortArr 정렬된 배열 반복문을 돎
            if (!map.containsKey(i)) { // map에 중복된 키가 없을 경우
                map.put(i, index++); // 해당 값과 해당 요소의 순서를 map에 쌍으로 저장
            }
        }

        for (int i : notSortArr) { // 실질적인 출력값을 버퍼에 저장하기
            bw.write(map.get(i) + " "); // 키로 값(압축된 좌표, map에 저장된 index)을 넣어준다
        }

        bw.flush();
        bw.close();
    }
}