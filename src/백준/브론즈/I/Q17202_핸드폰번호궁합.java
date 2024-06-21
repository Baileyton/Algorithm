package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14220kb 시간:132ms
    두 개의 핸드폰 번호를 번갈아 가며 조합한 후,
    인접한 숫자들을 더해 나온 합의 마지막 자리를 새로운 문자열로 만드는 과정을 반복하여
    두 자리 숫자가 나올 때까지 진행
*/
public class Q17202_핸드폰번호궁합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num1.length(); i++) {
            sb.append(num1.charAt(i));
            sb.append(num2.charAt(i));
        }

        while (sb.length() > 2) {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < sb.length() - 1; i++) {
                int sum = (sb.charAt(i) - '0') + (sb.charAt(i + 1) - '0');
                answer.append(sum % 10);
            }
            sb = answer;
        }

        System.out.println(sb);
    }
}