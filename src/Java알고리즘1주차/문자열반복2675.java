package Java알고리즘1주차;

import java.util.Scanner;

/*
    T 테스트 케이스의 개수를 입력 받고,
    각 테스트 케이스 마다 반복할 횟수 num, 반복할 문자열 str 입력 받아
    for 문에서 문자열의 각 문자를 num번 반복하여 출력합니다.
 */
public class 문자열반복2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int num = sc.nextInt();
            String str = sc.next();
            for(int j = 0; j<str.length(); j++) {
                for( int k = 0; k < num; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
