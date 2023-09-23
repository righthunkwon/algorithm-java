package level_00_basic;

import java.util.Scanner;

// 이상한 기호
// 항상 long을 염두해두자.
public class P_15964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println((a+b)*(a-b));
	}
}
