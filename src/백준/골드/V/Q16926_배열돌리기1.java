package 백준.골드.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:31716kb 시간:684ms
*/
public class Q16926_배열돌리기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<R; i++) {
            // 가장 큰 사각형부터 안으로 한 번씩 돌리기
            for(int j=0; j< Math.min(N, M)/2; j++) {

                int temp = array[j][j];  //각 사각형의 왼쪽 위 값 저장

                // left
                for(int k=j; k<M-j-1; k++) {
                    array[j][k] = array[j][k+1];
                }
                // up
                for(int k=j; k<N-1-j; k++) {
                    array[k][M-j-1] = array[k+1][M-j-1];
                }
                // right
                for(int k=M-j-1; k>j; k--) {
                    array[N-1-j][k] = array[N-1-j][k-1];
                }
                // down
                for(int k=N-j-1; k>j; k--) {
                    array[k][j] = array[k-1][j];
                }
                array[j+1][j] = temp;
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}