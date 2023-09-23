package level_08_math;

import java.util.Scanner;

// 최대공약수와 최소공배수
public class P_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// 최대공약수
		for (int i = 10000; i >= 1; i--) {
			if (x % i == 0 && y % i == 0) {
				System.out.println(i);
				break;
			}
		}
		
		// 최소공배수
		for (int i = 1; i <= x*y; i++) {
			if (i % x == 0 && i % y == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
