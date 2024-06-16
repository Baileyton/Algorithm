package Java알고리즘3주차.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14308kb 시간:124ms
    피보나치 수열 1,2 항은 1이고, 그 뒤의 항은 앞 두항의 합인 수열 1, 1, 2, 3, 5, 8, ...
    피보나치 수열의 n번째 항을 계산하고 출력
*/
public class 피보나치수2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) ;
        long result = fibonacci(n);
        System.out.println(result);
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i= 2; i <=n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}