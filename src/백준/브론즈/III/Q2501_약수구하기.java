package 백준.브론즈.III;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
    메모리:14264kb 시간:132ms
*/
public class Q2501_약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);
            }
        }

        Collections.sort(divisors);
        System.out.println(K <= divisors.size() ? divisors.get(K-1) : 0);
    }
}