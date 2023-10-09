package level_10_geometry_rect_tri;

import java.util.Scanner;

// 네 번째 점
// 요소를 카운팅하는 배열 생성
public class P_3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[1001];
		int[] y = new int[1001];
		int ansX = 0, ansY = 0;
		for (int i = 0; i < 3; i++) {
			x[sc.nextInt()]++;
			y[sc.nextInt()]++;
		}
		for (int i = 1; i < 1001; i++) {
			if (x[i] == 1) ansX = i;
			if (y[i] == 1) ansY = i;
		}
		System.out.println(ansX + " " + ansY);
	}
}

