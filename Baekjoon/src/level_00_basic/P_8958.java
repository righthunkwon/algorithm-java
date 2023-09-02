package level_00_basic;

import java.util.Scanner;

public class P_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			int ans = 0; // 정답
			int cnt = 1; // 변화하는 점수
			for (int i = 0; i < ch.length; i++) {
				if(ch[i] == 'O') {
					ans += cnt;
					if (i < ch.length - 1 && ch[i+1] == 'O') {
						cnt++;
					}
				} else {
					cnt = 1;
				}
			}
			System.out.println(ans);
		}
	}
}
