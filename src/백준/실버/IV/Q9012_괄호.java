package 백준.실버.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    메모리:14388kb 시간:116ms
    테스트 케이스마다 주어진 괄호 문자열이 올바르게 짝을 이루는지 스택을 사용하여 확인,
    스택에 추가하고 닫는 괄호는 스택에서 제거하여 모든 문자를 처리한 후 스택이 비어 있으면 "YES", 그렇지 않으면 "NO"를 출력
 */
public class Q9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.println(solve(str) ? "YES" : "NO");
        }
    }

    public static boolean solve(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}