package level_21_recursion;

import java.util.Scanner;

// 팰린드롬인지 확인하기
public class P_10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(palindrome(s));
	}

	private static int palindrome(String s) {
		int st = 0;
		int ed = s.length() - 1;
		while (st <= ed) {
			if (s.charAt(st) != s.charAt(ed)) {
				return 0;
			}
			st++;
			ed--;
		}
		return 1;
	}
}