package Java알고리즘3주차.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
    메모리:208560kb 시간:540ms
    10^100 범위 이기에 BigInteger 사용 K를 L보다 작은 소수로 나누어 떨어지는지를 확인
    2부터 L-1까지의 수로 K를 나누어 떨어지는지 반복문을 통해 검사하고, 첫 번째로 나누어 떨어지는 소수를 찾아냅니다.
    만약 나누어 떨어지는 소수가 없다면 "GOOD"을 출력하고, 있으면 "BAD"와 해당 소수를 출력
 */
public class 좋은암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int n = 0;
        for (int i = 2; i < L; i++) {
            if(K.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                n = i;
                break;
            }
        }
        System.out.println(n > 0 ? ("BAD " + n) : "GOOD");
    }
}