package level_00_basic;

import java.util.Scanner;

// 초6 수학
public class P_2702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a, b;
		for (int tc = 1; tc <= T; tc++) {
			a = sc.nextInt();
			b = sc.nextInt();
			int GCD = 0, LCM = 0;
			;

			// 최대공약수
			for (int i = 1000; i >= 1; i--) {
				if (a % i == 0 && b % i == 0) {
					GCD = i;
					break;
				}
			}
			// 최소공배수
			for (int i = 1; i <= a * b; i++) {
				if (i % a == 0 && i % b == 0) {
					LCM = i;
					break;
				}
			}
			System.out.println(LCM + " " + GCD);
		}
		sc.close();
	}
}
