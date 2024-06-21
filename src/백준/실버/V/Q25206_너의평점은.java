package 백준.실버.V;

import java.util.Scanner;

/**
 * 입력 문자열을 공백으로 분리하여
 * str_arr[0] 이수 과목, str_arr[1] 이수 학점, str_arr[2] 학점 등급
 * 등급이 P인 과목은 계산에서 제외해야 함
 */
public class Q25206_너의평점은 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double average = 0;
        double credit_sum = 0;
        char c;

        for(int i = 0; i < 20; i++) {
            double credit = 0;
            double grade = 0;

            String str_arr[] = sc.nextLine().split(" ");
            credit += Double.parseDouble(str_arr[1]);
            c = str_arr[2].charAt(0);

            switch (c) {
                case 'A':
                    grade += (str_arr[2].charAt(1) == '+') ? 4.5 : 4.0;
                    break;
                case 'B':
                    grade += (str_arr[2].charAt(1) == '+') ? 3.5 : 3.0;
                    break;
                case 'C':
                    grade += (str_arr[2].charAt(1) == '+') ? 2.5 : 2.0;
                    break;
                case 'D':
                    grade += (str_arr[2].charAt(1) == '+') ? 1.5 : 1.0;
                    break;
                case 'F':
                    grade += 0;
                    break;
                case 'P':
                    grade += 0;
                    credit = 0;
                    break;
            }
            credit_sum += credit;
            average += credit * grade;
        }
        System.out.println(average/credit_sum);
    }
}