package level_31_dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 유기농 배추
// 2차원 너비 우선 탐색(bfs)
public class P_1012 {

	// 필요 변수
	private static int m, n, k, ans;
	private static int[][] cabbage;
	private static boolean[][] visited;

	// 상하좌우
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int tc = Integer.parseInt(br.readLine()); // test case
		for (int t = 1; t <= tc; t++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken()); // 가로
			n = Integer.parseInt(st.nextToken()); // 세로
			k = Integer.parseInt(st.nextToken()); // 배추 개수
			cabbage = new int[m][n]; // 배추밭
			visited = new boolean[m][n]; // 방문확인배열
			ans = 0; // 필요한 배추흰지렁이의 수

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				cabbage[x][y] = 1;
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					// 배추가 있고 방문하지 않았다면 너비 우선 탐색
					if (cabbage[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}

	private static void bfs(int x, int y) {
		visited[x][y] = true; // 방문처리

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y });

		while (!q.isEmpty()) {
			x = q.peek()[0];
			y = q.peek()[1];
			q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 범위에서 벗어나지 않는데,
				if (nx >= 0 && nx < m && ny >= 0 && ny < n) {

					// 아직 방문하지 않았고 배추가 있으면
					if (!visited[nx][ny] && cabbage[x][y] == 1) {
						q.add(new int[] { nx, ny });
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
}
