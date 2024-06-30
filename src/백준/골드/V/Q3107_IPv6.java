package 백준.골드.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

/*
    메모리:14208kb 시간:108ms
*/
public class Q3107_IPv6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if(input.contains("::")) {
            input = input.replace("::", ":zero:");
        }
        String[] ipArr = input.split(":");

        LinkedList<String> inputList = new LinkedList<>();
        LinkedList<String> resultList = new LinkedList<>();

        Collections.addAll(inputList, ipArr);

        for (String str : inputList) {
            if (str.isEmpty()) continue;

            while (str.length() < 4) {
                str = "0" + str;
            }
            resultList.add(str);
        }

        String[] ans = new String[8];

        int zeroLen = 8 - resultList.size() + 1;
        int idx = 0;
        for (String s : resultList) {
            if (s.equals("zero")) {
                while (zeroLen-- > 0) {
                    ans[idx] = "0000";
                    idx++;
                }
            } else {
                ans[idx] = s;
                idx++;
            }
        }
        StringBuilder outPut = new StringBuilder(ans[0]);
        for(int i=1; i<ans.length; i++) {
            outPut.append(":").append(ans[i]);
        }

        System.out.println(outPut);
    }
}