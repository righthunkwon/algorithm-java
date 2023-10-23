package level_00_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수 2진수
// 8진수의 각 자리수는 2진수의 세 자리를 차지한다.
public class P_1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		String[] sarr = { "000", "001", "010", "011", "100", "101", "110", "111" };
		
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			sb.append(sarr[n]);
		}

		// 예외처리
		if (s.equals("0")) {
			System.out.println(s);
		} 
		
		// 정답 출력
		else {
			// 맨 앞 0 제거
			while (sb.charAt(0) == '0') {
				sb = new StringBuilder(sb.substring(1));
			}
			System.out.println(sb);
		}
	}
}
