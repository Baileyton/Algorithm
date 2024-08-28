package 백준.브론즈.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14244kb 시간:100ms
 */
public class Q10988_팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 문자열이 팰린드롬인지 확인하기 위해 앞뒤로 비교
        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 팰린드롬이면 1, 아니면 0 출력
        System.out.println(isPalindrome ? 1 : 0);
    }
}