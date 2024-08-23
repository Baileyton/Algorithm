package 백준.실버.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
    메모리:14484kb 시간:112ms
*/
public class Q2304_창고다각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Column[] columns = new Column[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            columns[i] = new Column(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(columns); // 기둥 배열을 위치 오름차순으로 정렬

        int area = 0; // 창고 면적을 누적
        int pivot = 0;

        // 가장 높은 기둥을 pivot으로 설정
        for (int i = 0 ; i < n; i++) {
            if (columns[pivot].height < columns[i].height) pivot = i;
        }

        // 가장 왼쪽 기둥부터 pivot까지 면적 계산
        int highestIndex = 0;
        for (int i = 0; i <= pivot; i++) {
            if (columns[highestIndex].height <= columns[i].height) {
                area += (columns[i].location - columns[highestIndex].location) * columns[highestIndex].height;
                highestIndex = i;
            }
        }

        // 가장 오른쪽 기둥부터 pivot까지 면적 계산
        highestIndex = n - 1;
        for (int i = n - 1; i >= pivot; i--) {
            if (columns[highestIndex].height <= columns[i].height) {
                area += (columns[highestIndex].location - columns[i].location) * columns[highestIndex].height;
                highestIndex = i;
            }
        }

        // pivot 기둥의 넓이 추가
        area += columns[pivot].height;

        System.out.println(area);
    }

    // 기둥 클래스, x 좌표와 높이로 구성
    public static class Column implements Comparable<Column> {
        public int location;
        public int height;

        public Column(int location, int height) {
            this.location = location;
            this.height = height;
        }

        // 위치 오름차순을 위해 함수 오버라이딩
        @Override
        public int compareTo(Column c) {
            return this.location - c.location;
        }
    }
}