package level_00_basic;

import java.util.Scanner;

// 직사각형에서 탈출
public class P_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 현재 위치
		int y = sc.nextInt(); // 현재 위치
		int w = sc.nextInt(); // 경계 위치
		int h = sc.nextInt(); // 경계 위치
		
		int min1 = Math.min(x-0, y-0);
		int min2 = Math.min(w-x, h-y);
		
		System.out.println(Math.min(min1, min2));
	}
}
