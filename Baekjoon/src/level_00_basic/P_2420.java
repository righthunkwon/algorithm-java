package level_00_basic;

import java.util.Scanner;

// 사파리월드
public class P_2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = Math.abs(n-m);
		System.out.println(ans);
	}
}
