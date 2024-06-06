package Java알고리즘2주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
    메모리:33312kb 시간:1132ms
    0보다 큰 값을 minHeap에 저장, 0 입력시 minHeap 가장 작은 값 출력, 비어있다면 0 출력
 */
public class 최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x>0) {
                minHeap.add(x);
            } else {
                if (!minHeap.isEmpty()) {
                    System.out.println(minHeap.poll());
                }
                else {
                    System.out.println(0);
                }
            }
        }
    }
}