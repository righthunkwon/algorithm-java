package algorithm;

import java.io.*;
import java.util.*;

// 깊이우선탐색
// 스택 혹은 재귀함수를 이용하여 구현 (보통은 재귀함수로 구현)
// 한 노드에서 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색

public class _06_깊이우선탐색 {

	// 필요 변수
	private static int n, m, ans;
	private static char[][] map;
	private static boolean[][] visited;

	// 상하좌우
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 가로
		m = Integer.parseInt(st.nextToken()); // 세로
		ans = 0; // 정답

		map = new char[n][m]; // 지도 배열
		visited = new boolean[n][m]; // 방문 처리 배열

		// 배열 요소 입력
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		// 풀이 로직 (찾는 대상은 값이 #인 좌표)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 방문하지 않았고 찾는 대상이 있다면
				if (visited[i][j] == false && map[i][j] == '#') {
					ans++; // 정답을 하나 증가시키고
					dfs(i, j); // 깊이 우선 탐색
				}
			}
		}
		System.out.println(ans);
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true; // 방문처리

		// 상하좌우 순으로 계속해서 깊이우선 탐색하여
		// 연결된 양무리를 방문하고 방문처리함으로써 다시 중복 제거
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			// 범위에서 벗어나지 않고, 방문하지 않았으며, 찾는 대상일 경우
			if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == false && map[nx][ny] == '#') {
				// 해당 좌표를 탐색
				dfs(nx, ny);
			}
		}
		return; // 종료
	}
}
