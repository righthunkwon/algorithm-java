package A형대비;

import java.io.*;
import java.util.*;

// 깊이우선탐색
public class P_단지번호붙이기 {

	static int n, cnt;
	static int[][] map;
	static boolean[][] visited;
	static List<Integer> result;

	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		cnt = 1; // 단지번호

		map = new int[n][n];
		visited = new boolean[n][n];
		result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j) - 48;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					dfs(i, j);
					result.add(cnt);
					cnt = 1; // 초기화
				}
			}
		}

		Collections.sort(result);
		System.out.println(result.size());
		for (int ans : result) System.out.println(ans);
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >=0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && map[nx][ny] == 1) {
				cnt++;
				dfs(nx, ny);
			}
		}
	}

}
