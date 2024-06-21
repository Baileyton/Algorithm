package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    "."을 기준으로 파일명, 확장자로 나누어 확장자를 저장하고, 빈도를 저장한다.
    TreeMap을 사용하여 Key 값을 정렬
*/
public class Q20291_파일정리 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split("\\.");
            String extension = str[1];
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }
        // TreeMap을 사용하여 key 값을 사전순으로 정렬
        TreeMap<String, Integer> sort = new TreeMap<>(map);

        // 정렬된 TreeMap 값을 출력
        for(Map.Entry<String, Integer> entry : sort.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}