package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14144kb 시간:136ms
    입력된 시간을 시간, 분, 초로 분리하여 각각 순회하며 모든 조합을 검사
    조합된 시간이 유효한지를 판단하고, 방법(카운트)를 증가
 */
public class Q1440_타임머신 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] timeParts = input.split(":");

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(timeParts[i]);
        }

        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) continue; // 같은 인덱스는 사용하지 않고
                for (int k = 0; k < 3; k++) {
                    if (k == i || k == j) continue;

                    int hour = numbers[i];
                    int minute = numbers[j];
                    int second = numbers[k];

                    if (isValidTime(hour, minute, second)) {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }
    public static boolean isValidTime(int h, int m, int s) {
        return (h >= 1 && h <= 12) && (m >= 0 && m <=59) && (s >= 0 && s <= 59);
    }
}