package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
    메모리:14236kb 시간:128ms
    각 알파벳이 1부터 26까지의 값을 갖도록 하고, 31의 거듭제곱 값을 곱하여 해시 값을 계산
    long형의 범위로는 31의 49제곱을 담을 수가 없기에 31의 제곱을 구할때 마다 1234567891을 나눠준다.
 */
public class Q15829_Hashing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        final int MOD = 1234567891;
        long hash = 0;
        long pow = 1;

        for(int i = 0; i < L; i++) {
            char ch = str.charAt(i);
            hash += (ch - 96) * pow;
            pow = pow * 31 % MOD;
        }
        System.out.println(hash%MOD);
    }
}