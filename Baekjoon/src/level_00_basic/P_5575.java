package level_00_basic;

import java.util.Scanner;

// 타임 카드
// 시간은 초로 변환한 뒤에 계산하고 시/분/초로 나누는 게 편리하다.
public class P_5575 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int h1 = sc.nextInt(), m1 = sc.nextInt(), s1 = sc.nextInt();
			int h2 = sc.nextInt(), m2 = sc.nextInt(), s2 = sc.nextInt();
			int start = (h1*3600) + (m1*60) + s1;
			int end = (h2*3600) + (m2*60) + s2;
			int hour = (end-start)/3600;
			int minute = (end-start)%3600/60;
			int second = (end-start)%3600%60;
			System.out.printf("%d %d %d\n", hour, minute, second);
		}
	}
}
