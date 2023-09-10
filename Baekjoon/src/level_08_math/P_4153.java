package level_08_math;

import java.util.Scanner;

// 직각삼각형
public class P_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			// 종료 조건
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			
			// a가 가장 긴 변(빗변 후보)일 떄
			if (a > b && a > c) {
				if (a*a == b*b + c*c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} 
			
			// b가 가장 긴 변(빗변 후보)일 떄
			else if (b > a && b > c) {
				if (b*b == a*a + c*c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} 
			
			// c가 가장 긴 변(빗변 후보)일 떄
			else {
				if (c*c == a*a + b*b) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
		}
	}
}
