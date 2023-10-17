package level_00_basic;

import java.util.Scanner;

// 아!
public class P_4999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if (s1.length() >= s2.length()) System.out.println("go");
		else System.out.println("no");
	}
}
