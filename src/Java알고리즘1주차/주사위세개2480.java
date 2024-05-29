package Java알고리즘1주차;

import java.util.Scanner;

/*
    주사위 세개를 던졌을 때
    주사위 모든 눈이 같을 경우, 두 눈이 같을 경우(A-B,A-C,B-C), 세 눈이 모두 다를 경우
    Math.max 두 수를 비교 하여 더 큰 값을 반환, 중첩 사용 가능 하다.
 */
public class 주사위세개2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A==B&&A==C){
            result = A * 1000 + 10000;
        }else if(A==B||B==C||A==C){
            if(A==B||A==C){
                result = A * 100 + 1000;
            }else{
                result = B * 100 + 1000;
            }
        }else {
            result = Math.max(Math.max(A,B), C) * 100;
        }
        System.out.println(result);
    }
}