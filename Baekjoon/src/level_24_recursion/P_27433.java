package level_24_recursion;

import java.util.Scanner;

// 팩토리얼 2
public class P_27433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}

	private static long factorial(int num) {
		// 기저파트
		if (num == 0) {
			return 1;
		}
		// 재귀파트
		return num * factorial(num - 1);
	}
}