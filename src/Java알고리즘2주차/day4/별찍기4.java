package Java알고리즘2주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:19900kb 시간:236ms
    주어진 수 N에 따라 각 행을 역순으로 출력,
    각 행은 처음에 공백을 포함하여 해당 행 번호에서 시작하여 N-1개의 공백을 추가
 */
public class 별찍기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int row = N; row>0; row--) {
            for(int colunm = row; colunm<N; colunm++){
                sb.append(" ");
            }
            for(int colunm = 0; row>colunm; colunm++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}