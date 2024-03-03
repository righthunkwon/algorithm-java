package A형대비;

import java.io.*;
import java.util.*;

// 깊이우선탐색 & 브루트포스
public class P_안전영역 {

	static int n, ans;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];

		int max = 0; // 최대 높이
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());

				// 최대 높이 갱신
				if (map[i][j] > max) {
					max = map[i][j];
				}
			}
		}

		ans = 0; // 안전영역 개수
		for (int h = 0; h < max; h++) { // 높이별 안전영역의 수 탐색

			// 방문 배열 및 안전영역 수는 높이마다 초기화
			visited = new boolean[n][n];
			int cnt = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 안전영역 탐지
					if (!visited[i][j] && map[i][j] > h) {
						cnt += dfs(i, j, h); // 안전영역의 수 증가
					}
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}

	private static int dfs(int x, int y, int h) {
		visited[x][y] = true; // 일단 방문처리

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// 범위 안 벗어나고 방문 안 했고 안전영역이면 계속 탐색
			if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && map[nx][ny] > h) {
				dfs(nx, ny, h);
			}
		}
		return 1;
	}
}
