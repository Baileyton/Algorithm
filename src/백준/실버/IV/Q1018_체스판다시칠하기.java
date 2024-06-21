package 백준.실버.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14232kb 시간:128ms
    8X8 크기의 체스판을 만드는 과정에서 solve 함수를 호출하여
    모든 시작점에 대해 반복하면서 최소 변경 횟수를 계산하여 값을 출력
*/
public class Q1018_체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] matrix = new boolean[N+50][M+50];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < M; j++) {
                matrix[i][j] = str.charAt(j) =='W';
            }
        }

        int chessRow = N -7;
        int chessColumn = M -7;

        int answer = 64;
        for(int i = 0; i < chessRow; i++) {
            for(int j = 0; j < chessColumn; j++) {
                answer = Math.min(answer,solve(matrix, i, j));
            }
        }

        System.out.println(answer);
    }
    public static int solve(boolean[][] matrix, int x, int y) {
        int chessX = x+8;
        int chessY = y+8;
        int count = 0;

        boolean cur = matrix[x][y];

        for (int i = x; i < chessX; i++) {
            for (int j = y; j < chessY; j++) {
                if (matrix[i][j] != cur) {
                    count++;
                }
                cur = (!cur);
            }
            cur = (!cur);
        }

        return Math.min(count, 64 - count);
    }
}