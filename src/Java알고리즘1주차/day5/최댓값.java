package Java알고리즘1주차.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:20316kb 시간:388ms
    행렬 입력 받고, if문으로 최대값과 행, 열 위치를 갱신
*/
public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int row = 1;
        int column = 1;

        for(int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > max) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}