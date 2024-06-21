package 백준.골드.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
    메모리:17648kb 시간:212ms
*/
public class Q2212_센서 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] sensors = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensors);

        Integer[] distSensor = new Integer[N-1];
        for (int i = 0; i < N - 1; i++) {
            distSensor[i] = sensors[i+1] - sensors[i];
        }

        Arrays.sort(distSensor, Collections.reverseOrder());

        int result = 0;
        for (int i = K - 1 ; i < N - 1; i++) {
            result += distSensor[i];
        }
        System.out.println(result);
    }
}