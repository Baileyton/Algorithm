package Java알고리즘2주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:119348kb 시간:544ms
    입력 받은 나무 높이 배열을 저장한 후 가장 높은 나무 높이까지 이분 탐색을 통해 톱의 높이를 조정하여 필요한 나무 길이 M을 확보,
    이분 탐색을 수행하여 자른 나무 길이의 합이 M 이상이 되는 최적의 톱 높이를 찾아 출력
 */
public class 나무자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if(trees[i] > max) max = trees[i];
        }

        long start = 0;
        long end = max;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum >= M) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}