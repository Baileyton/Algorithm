package 백준.실버.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2615_오목 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = new int[19][19];

        for (int i = 0; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 19; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dx = {1, 0, -1, 1};
        int[] dy = {1, 1, 1, 0};

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (matrix[i][j] != 0) {
                    int currentColor = matrix[i][j];

                    for (int d = 0; d < 4; d++) {
                        int count = 1;
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        while (nx >= 0 && nx < 19 && ny >= 0 && ny < 19 && matrix[nx][ny] == currentColor) {
                            count++;
                            nx += dx[d];
                            ny += dy[d];
                        }

                        if (count == 5) {
                            int prevX = i - dx[d];
                            int prevY = j - dy[d];
                            if (prevX >= 0 && prevX < 19 && prevY >= 0 && prevY < 19 && matrix[prevX][prevY] == currentColor) {
                                continue;
                            }
                            System.out.println(currentColor);
                            System.out.println((i + 1) + " " + (j + 1));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(0);
    }
}