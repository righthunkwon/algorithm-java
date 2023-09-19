package bfs_dfs;

import java.util.Scanner;

// 미로 1 
public class S_1226 {
	private static int ans; // 정답(1: 도달가능, 0:도달 불가능)
	private static int[][] map; // 지도 배열
	private static boolean[][] visited; // 방문 확인 배열
	private static int[] dx = { -1, 0, 1, 0 }; // 상하좌우
	private static int[] dy = { 0, 1, 0, -1 }; // 상하좌우

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			sc.nextInt(); // 버리는 입력값
			map = new int[16][16]; // test case 마다 초기화
			visited = new boolean[16][16]; // test case 마다 초기화
			int x = 0; // 출발점의 x좌표
			int y = 0; // 출발점의 y좌표
			ans = 0; // 정답일 경우 1로 바꾼다.
			
			// 지도 배열 요소 입력
			for (int i = 0; i < 16; i++) {
				String str = sc.next();
				for (int j = 0; j < 16; j++) {
					map[i][j] = str.charAt(j) - '0';
					
					// 출발점의 좌표 지정
					if (map[i][j] == 2) {
						x = i;
						y = j;
					}
				}
			}
			dfs(x, y);
			System.out.printf("#%d %d\n", t, ans);
		}
	}

	private static void dfs(int x, int y) {
		// (1) 기저부분(종료조건)
		// 정답이면 종료
		if (ans == 1) {
			return;
		}
		// 도착점에 도달하면 정답을 1로 바꾸고 종료
		if (map[x][y] == 3) {
			ans = 1;
			return;
		}
		
		// (2) 재귀부분(반복수행)
		visited[x][y] = true; // 방문처리
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			// 범위에서 벗어나지 않고,
			if (nx >= 0 && nx < 16 && ny >= 0 && ny < 16) {
				// 방문하지 않았으며 벽이 아니라면,
				if (!visited[nx][ny] && map[nx][ny] != 1) {
					dfs(nx, ny); // 깊이 우선 탐색
				}
			}
		}
		visited[x][y] = false;
	}
}
