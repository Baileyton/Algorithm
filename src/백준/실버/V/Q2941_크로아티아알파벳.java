package 백준.실버.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14408kb 시간:128ms
    입력에 크로아티아 알파벳이 포함이 되어있는지 확인
    포함되어있으면 해당 알파벳을 'c'로 치환 후 문자열 길이를 출력
*/
public class Q2941_크로아티아알파벳 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] CroatiaAlphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = (br.readLine());

        for(int i = 0; i < CroatiaAlphabet.length; i++) {
            if(str.contains(CroatiaAlphabet[i]))
                str = str.replaceAll(CroatiaAlphabet[i], "c");
        }
        System.out.println(str.length());
    }
}