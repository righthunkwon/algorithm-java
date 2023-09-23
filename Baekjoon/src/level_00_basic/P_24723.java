package level_00_basic;

import java.util.Scanner;

// 녹색거탑
public class P_24723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= 2;
		}
		System.out.println(ans);
	}
}
