package Java알고리즘2주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


/*
    메모리:14264kb 시간:112ms
 */
public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for(int j = 0; j < n; j++) {
                String[] str = br.readLine().split(" ");
                map.put(str[1], map.getOrDefault(str[1], 0) + 1);
            }

            int count = 1;
            for(int caseNum : map.values()) {
                count *= (caseNum + 1);
            }

            System.out.println(count-1);
        }
    }
}