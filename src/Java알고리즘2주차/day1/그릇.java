package Java알고리즘2주차.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    메모리:14200kb 시간:128ms
    시작이 ( 일때, ( 같은 방향이면 +5, ) 반대 방향이면 +10
 */
public class 그릇 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        solve(str);
    }
    public static void solve(String str) {
        int height = 10;
        char[] dishes = str.toCharArray();

        for(int i = 1; i <dishes.length; i++) {
            if(dishes[i] == dishes[i - 1]) height +=5;
            else height += 10;
        }
        System.out.println(height);
    }

}