package 백준.브론즈.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
    메모리:20200kb 시간:380ms
    제목과 멜로디를 HashMap에 저장, 전주 저장
    입력 한 전주 3개의 음을 가지고 멜로디 시작 3개의 음을 일치 여부를 판단 한다.
 */
public class Q31562_전주듣고노래맞추기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> songs = new HashMap<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int length = Integer.parseInt(st.nextToken());
            String title = st.nextToken();
            StringBuilder melody = new StringBuilder();

            while (st.hasMoreTokens()) {
                melody.append(st.nextToken());
            }

            songs.put(title, melody.toString());
        }

        List<String> intros = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            StringBuilder intro = new StringBuilder();
            while (st.hasMoreTokens()) {
                intro.append(st.nextToken());
            }
            intros.add(intro.toString());
        }

        for(String intro : intros) {
            int matchCount = 0;
            String matchTitle = "";
            for (Map.Entry<String, String> entry : songs.entrySet()){
                String title = entry.getKey();
                String melody = entry.getValue();

                if (melody.startsWith(intro)) {
                    matchCount++;
                    matchTitle = title;
                    if(matchCount > 1) {
                        break;
                    }
                }
            }
            if (matchCount > 1) {
                System.out.println("?");
            } else if (matchCount == 1) {
                System.out.println(matchTitle);
            } else {
                System.out.println("!");
            }
        }
    }
}