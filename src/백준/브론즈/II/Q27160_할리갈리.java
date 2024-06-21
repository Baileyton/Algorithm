package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    HashMap<String, Integer>를 사용하여 과일, 과일 수를 저장
    이미 존재하는 과일인 경우 개수를 증가시키고, 그렇지 않은 경우 새로운 항목으로 추가
    마지막으로 HashMap 값이 5가 존재 하는지 확인
*/
public class Q27160_할리갈리 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] str_arr = br.readLine().split(" ");
            String fruit = str_arr[0];
            int fruitCount = Integer.parseInt(str_arr[1]);

            map.put(fruit, map.getOrDefault(fruit, 0) + fruitCount);
        }

        if(map.containsValue(5)) System.out.println("YES");
        else System.out.println("NO");
    }
}