package level_31_dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단지번호 붙이기
public class P_2667 {

	private static int n, complex;
	private static int[][] map;
	private static boolean[][] visited;
	private static int[] houseCnt;

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		complex = 0; // 총 단지 수
		map = new int[n][n]; // 단지
		visited = new boolean[n][n]; // 방문처리배열
		houseCnt = new int[25*25]; // 아파트 수

		// 배열 요소 입력
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		// 단지 전체를 순회하며 판단
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					complex++; // 단지 수 증가
					dfs(i, j); // 깊이 우선 탐색
				}
			}
		}

		// 정답 출력
		Arrays.sort(houseCnt);
		System.out.println(complex);
		for (int h : houseCnt) {
			if (h > 0) System.out.println(h);
		}
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true; // 방문처리
		houseCnt[complex]++; // 단지에 따른 집 수 증가

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// 범위 내에서 이동한 곳이 집이고 아직 방문하지 않으면 깊이우선탐색 
			if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1 && !visited[nx][ny]) {
				dfs(nx, ny);
			}
		}
	}
}
