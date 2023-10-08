package level_05_string;

import java.util.Scanner;

// 하얀 칸
// 행이 짝수인지 홀수인지에 따라 경우의 수 분리
public class P_1100 {
	private static char[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new char[8][8]; // 체스판
		
		// 체스판 배열 요소 입력
		for (int i = 0; i < 8; i++) {
			String s = sc.next();
			map[i] = s.toCharArray();
		}

		int ans = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				// 짝수행일 때는 흰색 칸부터 시작, 짝수열이 흰색 칸
				if (i % 2 == 0 && j % 2 == 0 && map[i][j] == 'F') {
					ans++;
				} 
				// 홀수행일 때는 검은색 칸부터 시작, 홀수열이 흰색 칸
				else if (i % 2 == 1 && j % 2 == 1 && map[i][j] == 'F'){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
