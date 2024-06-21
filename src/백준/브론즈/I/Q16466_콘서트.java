package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:117756kb 시간:552ms
    list 저장한 후 오름차순으로 정렬, list index 값을 비교 해당하는 값을 출력,
    count 변수로 표 번호가 연속적일 경우 ticketing + 1을 출력
 */
public class Q16466_콘서트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ticketing = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < ticketing; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) != j + 1) {
                System.out.println(j + 1);
                count++;
                break;
            }
        }
        if (count == 0) System.out.println(ticketing + 1);
    }
}