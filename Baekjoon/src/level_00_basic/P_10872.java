package level_00_basic;

import java.util.Scanner;

// 팩토리얼
public class P_10872 {
	private static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(factorial(1));
	}
	
	private static int factorial(int num) {
		// 예외처리(n=0일 때)
		if (n == 0) {
			return 1;
		}
		
		// 기저부분(종료조건)
		if (num == n) {
			return num;
		}
		
		// 재귀부분(반복수행)
		return num * factorial(num + 1);
	}
}
