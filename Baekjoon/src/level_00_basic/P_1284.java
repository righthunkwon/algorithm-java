package level_00_basic;

import java.util.Scanner;

// 집 주소
public class P_1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int ans = 0;
			String s = sc.next();
			char[] ch = s.toCharArray();
			
			// 종료 조건
			if (s.equals("0")) {
				break;
			}
			
			// 풀이 로직
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '0') {
					ans += 4;
				} else if (ch[i] == '1') {
					ans += 2;
				} else {
					ans += 3;
				}
			}
			ans += ch.length + 1; // 여백 고려
			System.out.println(ans);
		}
	}
}
