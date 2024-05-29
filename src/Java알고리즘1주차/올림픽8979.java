package Java알고리즘1주차;

import java.util.Scanner;

public class 올림픽8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 국가의 수
        int k = sc.nextInt(); // 알고 싶은 국가 번호

        int[][] countries =new int[n][4];

        for (int i = 0; i < n; i++) {
            countries[i][0] = sc.nextInt(); // 국가 번호
            countries[i][1] = sc.nextInt(); // 금메달
            countries[i][2] = sc.nextInt(); // 은메달
            countries[i][3] = sc.nextInt(); // 동메달
        }

        int targetGold = 0;
        int targetSilver = 0;
        int targetBronze = 0;

        // 배열을 순회하여 순위를 알고자 하는 국가의 메달 수를 찾는다
        for (int i = 0; i < n; i++) {
            if (countries[i][0] == k) { // 국가 번호가 k와 같은 경우
                targetGold = countries[i][1]; // 해당 국가의 금메달 수
                targetSilver = countries[i][2]; // 해당 국가의 은메달 수
                targetBronze = countries[i][3]; // 해당 국가의 동메달 수
                break; // 필요한 정보를 찾았으므로 루프 종료
            }
        }

        int rank = 1; // 순위를 저장할 변수, 초기값은 1

        // 다시 배열을 순회하여 다른 국가들과 비교
        for (int i = 0; i < n; i++) {
            if (countries[i][0] != k) { // 자신과 비교하지 않기 위해
                // 메달 수 비교
                if (countries[i][1] > targetGold || // 금메달 수가 더 많거나
                        (countries[i][1] == targetGold && countries[i][2] > targetSilver) || // 금메달 수가 같고 은메달 수가 더 많거나
                        (countries[i][1] == targetGold && countries[i][2] == targetSilver && countries[i][3] > targetBronze)) { // 금, 은메달 수가 같고 동메달 수가 더 많은 경우
                    rank++; // 순위를 증가
                }
            }
        }

        System.out.println(rank);
    }
}
