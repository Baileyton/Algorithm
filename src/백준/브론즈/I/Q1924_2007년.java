package 백준.브론즈.I;

import java.time.LocalDate;
import java.util.Scanner;

/*
    날짜를 표현하기 위해 java.time.LocalDate 이 클래스를 사용하여, 날짜를 표현한 후 요일을 구할 수 있습니다.
    ex) LocalDate.of(2007, 1, 31).getDayOfWeek().getValue();를 통해 월요일이 1, 일요일이 7입니다.
*/
public class Q1924_2007년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String days = null;
        int m = sc.nextInt();
        int d = sc.nextInt();
        int dayOfweek = LocalDate.of(2007, m, d).getDayOfWeek().getValue();

        switch (dayOfweek){
            case 1:
                days = "MON";
                break;
            case 2:
                days = "TUE";
                break;
            case 3:
                days = "WED";
                break;
            case 4:
                days = "THU";
                break;
            case 5:
                days = "FRI";
                break;
            case 6:
                days = "SAT";
                break;
            case 7:
                days = "SUN";
                break;
        }
        System.out.println(days);
    }
}