package Java알고리즘1주차.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    HashMap enter 상태일 때만 이름을 저장하고, leave 상태일 때는 해당 이름을 제거한다.
    저장된 이름들을 역순으로 정렬하여 출력합니다.
*/
public class 회사에있는사람7785 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용 하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            String name = str[0];
            String state = str[1];

            if(state.equals("enter")) map.put(name, state);
            else map.remove(name);
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet);
        Collections.reverse(keySet);

        for (String name : keySet) {
            System.out.println(name);
        }
    }
}