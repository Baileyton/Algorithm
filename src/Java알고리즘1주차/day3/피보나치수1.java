package Java알고리즘1주차.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:16140kb 시간:124ms
    피보나치 수열 1,2 항은 1이고, 그 뒤의 항은 앞 두항의 합인 수열 1, 1, 2, 3, 5, 8, ...
    피보나치 수열의 n번째 항을 계산하고 실행 횟수 n-2를 출력
*/
public class 피보나치수1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) ;
        int result = fibonacci(n);
        System.out.println(result + " " + (n-2));
    }

    public static int fibonacci(int n) {
        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;

        for(int i= 3; i <=n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}