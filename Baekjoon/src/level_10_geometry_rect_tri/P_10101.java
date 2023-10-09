package level_10_geometry_rect_tri;

import java.util.Scanner;

// 삼각형 외우기
public class P_10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == 60 && b == 60 && c == 60) System.out.println("Equilateral");
		else if (a+b+c == 180 && ((a==b) || (b==c) || (c==a))) System.out.println("Isosceles");
		else if (a+b+c == 180) System.out.println("Scalene");
		else System.out.println("Error");
	}
}