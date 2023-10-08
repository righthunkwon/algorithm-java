package level_00_basic;

import java.util.Scanner;

// 방학숙제
public class P_5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); // 방학 일수
		int a = sc.nextInt(); // 풀어야 하는 국어 총 페이지
		int b = sc.nextInt(); // 풀어야 하는 수학 총 페이지
		int c = sc.nextInt(); // 하루에 국어 풀 수 있는 페이지 수
		int d = sc.nextInt(); // 하루에 수학 풀 수 있는 페이지 수

		int korean = 0;
		while(true) {
			a -= c;
			korean++;
			if (a <= 0) break;
		}		

		int math = 0;
		while (true) {
			b -= d;
			math++;
			if (b <= 0) break;
		}
		int ans = l - Math.max(korean, math);
		System.out.println(ans > 0 ? ans : 0);
	}
}
