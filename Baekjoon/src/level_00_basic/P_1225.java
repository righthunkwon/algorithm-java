package level_00_basic;

import java.util.Scanner;

// 이상한 곱셈
public class P_1225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int[] arr1 = new int[s1.length()];
		int[] arr2 = new int[s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			arr1[i] = s1.charAt(i) - 48;
		}
		for (int i = 0; i < s2.length(); i++) {
			arr2[i] = s2.charAt(i) - 48;
		}
		long ans = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				ans += arr1[i] * arr2[j];
			}
		}
		System.out.println(ans);
	}
}
