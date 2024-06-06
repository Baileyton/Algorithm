package Java알고리즘2주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


/*
    메모리:16036kb 시간:124ms
    입력 받은 단어를 HashSet에 저장하고, 역순 문자열이 HashSet에 있는지 확인
 */
public class 민균이의비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            set.add(str);

            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();

            if (set.contains(reverse)) {
                System.out.println(reverse.length() + " " + reverse.charAt(reverse.length()/2));
                break;
            }
        }
    }
}