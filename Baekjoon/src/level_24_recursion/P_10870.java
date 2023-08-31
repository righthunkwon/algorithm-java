package level_24_recursion;

import java.util.Scanner;

// 피보나치 수 5
public class P_10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibonacci(num));
	}
	
	private static int fibonacci(int num) {
		if (num == 0) return 0;
		if (num == 1) return 1;
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
}