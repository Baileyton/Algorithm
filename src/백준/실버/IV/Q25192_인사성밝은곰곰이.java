package 백준.실버.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    메모리:28520kb 시간:288ms
    채팅방 기록 수 n을 입력, 입장을 나타내는 ENTER 후에 닉네임을 입력받는다.
    새로운 ENTER가 나오면 채팅기록자였어도 새로 들어온 닉네임으로 처리
    같은 ENTER 안에 있는 동일 닉네임은 카운트 1번만
*/
public class Q25192_인사성밝은곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int count = 0; // 곰곰티콘 사용된 횟수를 저장
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String nick = br.readLine();

            if(nick.equals("ENTER")) {
                count += set.size();
                set = new HashSet<>(); // ENTER 초기화
            }
            else set.add(nick);
        }
        count += set.size();

        System.out.println(count);
    }
}