import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
    문자열 input을 받아 서로 다른 부분 문자열의 개수를 구하기

*/
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < input.length(); i++) {
            for(int j = i+1; j <= input.length(); j++) {
                set.add(input.substring(i,j)+" ");
            }
        }
        System.out.println(set.size());
    }
}