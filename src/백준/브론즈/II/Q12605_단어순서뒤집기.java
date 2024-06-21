package 백준.브론즈.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    메모리:14052kb 시간:124ms
    주어진 문장을 " "기준으로 단어를 stack FILO을 활용해서 단어를 역순으로 꺼내어 출력.
 */
public class Q12605_단어순서뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            solve(str, i + 1);
        }
    }
    public static void solve(String str, int caseNum) {
        Stack<String> stack = new Stack<>();

        String[] words = str.split(" ");

        for(String word : words) {
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Case #").append(caseNum).append(":");

        while (!stack.isEmpty()) {
            sb.append(" ").append(stack.pop());
        }

        System.out.println(sb);
    }
}