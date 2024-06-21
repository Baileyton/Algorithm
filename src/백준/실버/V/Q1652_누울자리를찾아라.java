package 백준.실버.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:16484kb 시간:164ms
    N*N 크기의 문자열 배열에서 각 행과 각 열을 순회하며 연속된 '.'의 개수를 세고,
    가로와 세로의 연속된 '.'의 개수를 count하여 2개 이상일 경우 row와 column에 누적하여 저장
*/
public class Q1652_누울자리를찾아라 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] str = new String[N][N];
        int row = 0;
        int column = 0;

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < N; j++) {
                str[i][j] = String.valueOf(line.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (str[i][j].equals(".")) {
                    count++;
                } else {
                    if (count >= 2) {
                        row++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                row++;
            }
        }

        for (int j = 0; j < N; j++) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (str[i][j].equals(".")) {
                    count++;
                } else {
                    if (count >= 2) {
                        column++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                column++;
            }
        }

        System.out.println(row + " " + column);
    }
}