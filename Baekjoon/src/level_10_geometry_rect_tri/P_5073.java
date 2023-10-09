package level_10_geometry_rect_tri;

import java.util.Arrays;
import java.util.Scanner;

// 삼각형과 세 변
public class P_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0 && b == 0 && c == 0) break;

			int[] tmp = {a,b,c};
			Arrays.sort(tmp);
			
			if (tmp[2] >= tmp[1] + tmp[0]) System.out.println("Invalid");
			else if (a == b && b == c) System.out.println("Equilateral");
			else if (a == b || b == c || c == a) System.out.println("Isosceles");
			else System.out.println("Scalene");
		}
	}
}
