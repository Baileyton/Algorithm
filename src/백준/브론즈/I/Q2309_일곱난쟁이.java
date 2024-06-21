package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
    메모리:14228kb 시간:120ms
    입력된 숫자를 배열에 저장하고 오름차순으로 정렬,
    7개의 숫자를 선택하여 합이 100이 되는 경우를 찾아 출력
 */
public class Q2309_일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int[] result = new int[7];
        if (find(arr, result, 0, 0, 0)) {
            for(int num : result) {
                System.out.println(num);
            }
        }
    }
    public static boolean find(int[] arr, int[] result, int start, int index, int sum){
        if (index == 7) return sum == 100;
        if (start == arr.length) {
            return false;
        }

        for(int i = start; i < arr.length; i++){
            result[index] = arr[i];
            if(find(arr, result, i + 1, index + 1, sum + arr[i])) {
                return true;
            }
        }
        return false;
    }
}