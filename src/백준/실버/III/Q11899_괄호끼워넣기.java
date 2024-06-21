package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    메모리:14232kb 시간:128ms
    '('와 ')'가 짝을 이루도록 필요한 최소한의 괄호 개수를 구하는 문제
    스택을 사용하여 '('를 추적하고, 짝이 맞지 않는 ')'를 카운트,
    스택에 남은 '('의 개수와 짝이 맞지 않는 ')'의 개수를 합산하여 필요한 괄호 개수를 계산
 */
public class Q11899_괄호끼워넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(solve(str));
    }

    public static int solve(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    count++;
                } else{
                    stack.pop();
                }
            }
        }
        count += stack.size();

        return count;
    }
}