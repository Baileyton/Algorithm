package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    StringTokenizer 을 생성과 동시에 BufferedReader.readLine() 으로 한 줄을 입력받으면서 공백(" ")으로 구분
    과목 수, 과목 점수를 입력 배열에 저장
    과목 점수 중 최댓값을 찾고, 각 점수를 최댓값으로 나눈 후 100을 곱해 새로운 평균을 계산
*/
public class Q1546_평균 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Double[] arr = new Double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());


        double max = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        double sum = 0;
        for (double score : arr) {
            sum += (score / max) * 100;
        }
        System.out.println(sum/n);
    }
}