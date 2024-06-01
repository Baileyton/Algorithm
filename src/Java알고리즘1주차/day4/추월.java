package Java알고리즘1주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    메모리:14268kb 시간:136ms
    진입 순서를 in에 저장, 출구에서 나온 차량의 진입 순서를 배열에 저장
    출구에서 나온 차량의 진입 순서가 이후에 나온 차량보다 클 경우 추월 차량, 카운트 증가
*/
public class 추월 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> in = new HashMap<>();
        for (int i = 0; i < n; i++) {
            in.put(br.readLine(), i);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.get(br.readLine());
        }

        int passCount = 0;
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    passCount++;
                    break;
                }
            }
        }
        System.out.println(passCount);
    }
}