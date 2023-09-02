package level_00_basic;

import java.util.Scanner;

public class P_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			int h = sc.nextInt(); // 높이
			int w = sc.nextInt(); // 높이별 호수
			int n = sc.nextInt(); // 손님의 순서

			int height = n % h; // 높이
			int roomnumber = n / h + 1; // 방번호
			
			// 손님의 순서와 높이가 동일할 경우(n = h)
			if (height == 0) {
				height = h;
				roomnumber = n / h;
			}
			
			// 출력
			// String.format("%02d", number)
			// %: 명령의 시작, 0: 채워질 문자, 2: 총 자리수, d: 십진정수
			System.out.println(height + String.format("%02d", roomnumber));
		}
	}
}
