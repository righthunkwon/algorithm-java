package level_10_geometry_rect_tri;

import java.util.Arrays;
import java.util.Scanner;

// 세 막대
public class P_14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int[] tri = {a,b,c};
		Arrays.sort(tri);
		int max = tri[0] + tri[1];
		if (tri[2] >= max) {
			System.out.println(tri[0] + tri[1] + max - 1);
		} else {
			System.out.println(tri[0] + tri[1] + tri[2]);
		}
	}
}
