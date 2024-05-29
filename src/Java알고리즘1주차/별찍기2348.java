package Java알고리즘1주차;

import java.util.Scanner;

/*
    별찍기 문제
    사용자가 입력한 숫자 N에 따라 N개의 줄에 *을 출력
    첫 번째 줄에는 *, 두 번째 줄에는 **, N 번째 줄에는 * N개를 출력
    첫 번째 for 문은 row 줄을 제어, 두 번째 for 문은 * 개수 출력을 제어
*/
public class 별찍기2348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int row = 0; row<N; row++) {
            for(int colunm = 0; colunm<=row; colunm++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

