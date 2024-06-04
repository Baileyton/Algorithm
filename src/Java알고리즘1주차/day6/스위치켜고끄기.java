package Java알고리즘1주차.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스위치켜고끄기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j = number - 1; j < N; j += number) {
                    arr[j] = 1 - arr[j];
                }
            } else {
                int left = number -2;
                int right = number;
                arr[number - 1] = 1 - arr[number - 1];
                while (left >= 0 && right < N && arr[left] == arr[right]) {
                    arr[left] = 1 - arr[left];
                    arr[right] = 1 - arr[right];
                    left--;
                    right++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
            if((i+1) % 20 ==0){
                System.out.println();
            }
        }

    }
}