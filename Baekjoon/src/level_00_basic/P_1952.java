package level_00_basic;

import java.util.Scanner;

// 달팽이2
public class P_1952 {
	// 우, 하, 좌, 상
	private static int[] dx = { 0, 1, 0, -1 };
	private static int[] dy = { 1, 0, -1, 0 };
	private static int dir;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		int x = 0;
		int y = 0;
		int cnt = 0;
		int changedir = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[x][y] = 1;
				
				// 종료조건 세팅
				cnt++; // 데이터가 m*n개일 경우 반복문 종료
				if (cnt == m*n) {
					break;
				}
				
				// 새로운 좌표와 범위 및 기존 입력여부 체크
				int nx = x + dx[dir];
				int ny = y + dy[dir];
				if (nx < 0 || nx >= m || ny < 0 || ny >= n || arr[nx][ny] != 0) {
					dir = (dir + 1) % 4; // 방향 전환
					changedir++; // 방향 전환 횟수 증가
				}
				
				// 새로운 좌표 반영
				x = x + dx[dir];
				y = y + dy[dir];
			}
		}
	
		System.out.println(changedir);
	}
}
