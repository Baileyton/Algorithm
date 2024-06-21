package 백준.실버.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
    문자열 input을 받아 서로 다른 부분 문자열의 개수를 구하기
    중복을 허용하지 않는 HashSet에 저장하여 HashSet의 크기를 출력
*/
public class Q11478_서로다른부분문자열의개수 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 중복을 허용하지 않는 HashSet 사용
        HashSet<String> set = new HashSet<>();

        // 가능한 모든 부분 문자열을 생성하기 위해 중첩된 반복문을 사용
        for(int i = 0; i < input.length(); i++) {
            for(int j = i+1; j <= input.length(); j++) {
                set.add(input.substring(i,j)+" ");
            }
        }
        System.out.println(set.size());
    }
}
