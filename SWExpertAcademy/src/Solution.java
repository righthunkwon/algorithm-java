import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// test case
		int tc = 10;
		for (int t = 1; t <= tc; t++) {
			int len = sc.nextInt(); // 회문 길이
			char[][] map = new char[8][8]; // 글자판

			// 글자판 배열(map) 채우기
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					map[i][j] = str.charAt(j);
				}
			}

			// 행과 열로 나누어 탐색
			boolean flag = false; // 판단 기준
			int cnt = 0; // 회문의 개수

			// 행 기준 탐색
			// (1) 탐색 : 배열 길이 - 회문 길이 + 1 (범위 전체를 다 탐색할 필요는 없다)
			// (2) 판단 : 회문길이 / 2 (문자열을 반 접어서 비교한다고 생각하자)
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - len + 1; j++) {
					flag = true;
					for (int k = 0; k < len / 2; k++)
						if (map[i][j + k] != map[i][j - k + len - 1]) {
							flag = false;
						}
					if (flag) {
						cnt++;
					}
				}
			}

			// 열 기준 탐색
			// (1) 탐색 : 배열 길이 - 회문 길이 + 1 (범위 전체를 다 탐색할 필요는 없다)
			// (2) 판단 : 회문길이 / 2 (문자열을 반 접어서 비교한다고 생각하자)
			for (int i = 0; i < 8 - len + 1; i++) {
				for (int j = 0; j < 8; j++) {
					flag = true;
					for (int k = 0; k < len / 2; k++)
						if (map[i + k][j] != map[i - k + len - 1][j]) {
							flag = false;
						}
					if (flag) {
						cnt++;
					}
				}
			}
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}