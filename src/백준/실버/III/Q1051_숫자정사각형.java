package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14232kb 시간:128ms
    주어진 N*M 크기의 행렬에서 네 꼭지점이 같은 숫자로 이루어진 가장 큰 정사각형을 찾습니다.
    각 행과 각 열을 순회하면서 가능한 모든 크기의 정사각형을 검사하여 최대 크기를 갱신
*/
public class Q1051_숫자정사각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }

        int max = 1;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                for(int size = 1; i + size < N && j + size < M; size++) {
                    if (matrix[i][j] == matrix[i + size][j] &&
                            matrix[i][j] == matrix[i][j + size] &&
                            matrix[i][j] == matrix[i + size][j + size]) {
                        max = Math.max(max, size + 1);
                    }
                }
            }
        }

        System.out.println(max*max);
    }
}