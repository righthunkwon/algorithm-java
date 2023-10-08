package level_00_basic;

import java.util.Scanner;

// 입실 관리
public class P_5524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			System.out.println(s.toLowerCase());
		}
	}
}
