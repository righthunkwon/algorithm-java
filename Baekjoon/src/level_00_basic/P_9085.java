package level_00_basic;

import java.util.*;

// 더하기
public class P_9085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int ans = 0;
			for (int i = 0; i < n; i++) ans += sc.nextInt();
			System.out.println(ans);
		}
	}
}
