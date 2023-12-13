package level_31_dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 섬의 개수
public class P_4963_bfs {

	// 문제 조건
	private static int w, h, ans;
	private static int[][] map;
	private static boolean[][] visited;

	// 상하좌우 대각선
	static int dx[] = { 0, 0, -1, 1, -1, 1, -1, 1 }; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
	static int dy[] = { -1, 1, 0, 0, 1, 1, -1, -1 }; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			w = Integer.parseInt(st.nextToken()); // 너비
			h = Integer.parseInt(st.nextToken()); // 높이
			if (w == 0 && h == 0) break; // 종료

			ans = 0;
			map = new int[w][h];
			visited = new boolean[w][h];

			// 지도 배열 요소 입력
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < w; j++) {
					map[j][i] = Integer.parseInt(st.nextToken());
				}
			}

			// 너비우선탐색
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if (!visited[i][j] && map[i][j] == 1) {
						ans++;
						bfs(i, j);
					}
				}
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { x, y });
		visited[x][y] = true;

		while(!q.isEmpty()) {
			int[] arr = q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = arr[0] + dx[i];
				int ny = arr[1] + dy[i];
				if (nx >= 0 && nx < w && ny >= 0 && ny < h && map[nx][ny] == 1 && !visited[nx][ny]) {
					q.offer(new int[] { nx, ny });
					visited[nx][ny] = true;
				}
			}
		}
	}
}
