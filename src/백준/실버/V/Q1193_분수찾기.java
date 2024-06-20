package 백준.실버.V;

import java.util.Scanner;

/*
    메모리:18396kb 시간:232ms
    지그재그식으로 순회하는데
    홀수 대각선 일때 ↗ 오른쪽 위 방향
    짝수 대각선 일때 ↙ 왼쪽 아래 방향
 */
public class Q1193_분수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int crossCount = 0; // 대각선 번호
        int square = 0; // 대각선 번호 까지 칸의 누적 합 1,3,6,10,15,...

        while(square < n) {
            crossCount++;
            square += crossCount;
        }

        if(crossCount%2==0){
            int numerator = crossCount - (square - n); // 분자
            int denominator = (square - n) + 1; // 분모
            System.out.println(numerator + "/" + denominator);
        }else {
            int numerator = (square - n) + 1; // 분자
            int denominator = crossCount - (square - n); // 분모
            System.out.println(numerator + "/" + denominator);
        }

    }
}