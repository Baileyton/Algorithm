package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14176kb 시간:120ms
    ★출력 결과를 복사하여 붙여넣자....(시간을 버리다니...)
    입력된 문자열을 순회하면서 각 문자의 알파벳 순서를 구하여 합을 구한 뒤, 그 합이 소수인지 판별
    a~z 1~26, A~Z 27~52
 */
public class Q2153_소수단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;
        boolean isPrime = true;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <='z') {
                sum += (int) ch - 96;
            } else if ('A' <= ch && ch <='Z') {
                sum += (int) ch - 38;
            }
        }

        for(int i = 2; i < sum; i++){
            if(sum % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "It is a prime word." : "It is not a prime word.");
    }
}