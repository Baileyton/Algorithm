package 백준.실버.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    메모리:14128kb 시간:96ms
    참외밭의 변 길이와 방향을 통해 큰 사각형의 최대 너비와 높이를 구하고, 작은 사각형의 너비와 높이를 구한 뒤
    큰 사각형의 면적에서 작은 사각형의 면적을 빼서 참외밭의 실제 면적 구하고 참외의 개수 K를 곱하여 값을 출력
*/
public class Q2477_참외밭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int[] directions = new int[6];
        int[] lengths = new int[6];

        StringTokenizer st;
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            directions[i] = Integer.parseInt(st.nextToken());
            lengths[i] = Integer.parseInt(st.nextToken());
        }

        int maxWidth = 0;
        int maxHeight = 0;
        int minWidth = 0;
        int minHeight = 0;

        for (int i = 0; i < 6; i++) {
            if(directions[i] == 1 || directions[i] == 2) {
                if (maxWidth < lengths[i]) {
                    maxWidth = lengths[i];
                }
            } else if (directions[i] == 3 || directions[i] == 4) {
                if (maxHeight < lengths[i]) {
                    maxHeight = lengths[i];
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            if ((directions[i] == 1 || directions[i] == 2) && lengths[i] == maxWidth) {
                minHeight = Math.abs(lengths[(i + 5) % 6] - lengths[(i + 1) % 6]);
            } else if ((directions[i] == 3 || directions[i] == 4) && lengths[i] == maxHeight) {
                minWidth = Math.abs(lengths[(i + 5) % 6] - lengths[(i + 1) % 6]);
            }
        }

        int result = ((maxWidth * maxHeight) - (minWidth * minHeight)) * K;

        System.out.println(result);
    }
}