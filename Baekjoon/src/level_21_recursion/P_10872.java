package level_21_recursion;

import java.util.Scanner;

// 팩토리얼
public class P_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			ans *= i;
		}
		System.out.println(ans);
	}
}
