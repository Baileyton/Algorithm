package 백준.브론즈.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14180kb 시간:100ms
 */
public class Q3003_킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 체스의 각 말의 기본 개수
        int[] requiredPieces = {1, 1, 2, 2, 2, 8};

        // 입력된 체스 말의 개수
        String[] input = br.readLine().split(" "); // 입력을 공백 기준으로 나눔
        int[] inputPieces = new int[6];

        for (int i = 0; i < 6; i++) {
            inputPieces[i] = Integer.parseInt(input[i]); // 각 입력을 정수로 변환하여 배열에 저장
        }

        // 필요한 개수 계산 및 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(requiredPieces[i] - inputPieces[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}