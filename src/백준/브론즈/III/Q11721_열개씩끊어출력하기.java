package 백준.브론즈.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14248kb 시간:120ms
    substring으로 문자열 10개씩 끊어 출력하기
*/
public class Q11721_열개씩끊어출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        printInChunksOfTen(str);
    }

    public static void printInChunksOfTen(String str) {
        for(int i = 0; i < str.length(); i+=10) {
            if(i + 10 < str.length()) {
                System.out.println(str.substring(i, i + 10));
            } else {
                System.out.println(str.substring(i));
            }
        }
    }
}