package Java알고리즘2주차.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    메모리:25228kb 시간:296ms
    스택을 사용하여 보이는 막대기의 수를 세는 방식으로, 주어진 막대기의 높이를 스택에 추가하고,
    이전 막대기보다 높은 막대기만 스택에 남겨서 보이는 막대기의 수를 1씩 증가한다.
 */
public class 막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine());
            stack.push(h);
        }
        solve(stack);
    }
    public static void solve(Stack<Integer> stack) {
        int max = 0;
        int count = 0;

        while (!stack.isEmpty()) {
            int height = stack.pop();
            if (height > max) {
                max = height;
                count++;
            }
        }
        System.out.println(count);
    }
}