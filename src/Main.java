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
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();


    }
}