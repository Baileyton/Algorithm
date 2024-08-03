package 백준.브론즈.V;

import java.io.IOException;

/*
    메모리:13904kb 시간:100ms
*/
public class Q25083_새싹 {
    public static void main(String[] args) throws IOException {
        String str = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
                "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
                " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
                "   `~\\/\n" + 			// \\, \n 이 제어문자다.
                "      |\n" + 			// \n 이 제어문자다.
                "      |";
        System.out.println(str);
    }
}