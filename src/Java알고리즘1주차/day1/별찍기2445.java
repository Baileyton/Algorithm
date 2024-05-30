package Java알고리즘1주차.day1;

import java.util.Scanner;

/*
    입력 받은 값 N번째를 중심으로 대칭으로 모양
    별이 증가하는 상단 부분과 별이 감소하는 하단 부분을 나누어서 for 문 작성
 */
public class 별찍기2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int row = 0; row<N; row++) {
            for(int colunm = 0; colunm<=row; colunm++){
                System.out.print("*");
            }
            for (int column = 2 * (N - row - 1); column > 0; column--) {
                System.out.print(" ");
            }
            for(int colunm = 0; colunm <= row; colunm++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = N-1; row>0; row--) {
            for(int colunm = 0; row>colunm; colunm++){
                System.out.print("*");
            }
            for (int column = 2 * (N - row); column > 0; column--) {
                System.out.print(" ");
            }
            for(int colunm = 0; row>colunm; colunm++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}