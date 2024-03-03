package algorithm;

import java.io.*;
import java.util.*;

// 너비우선탐색
// 큐를 이용하여 구현
// 루트 노드에서 탐색을 시작하여 같은 레벨에 있는 노드를 모두 탐색한 다음 
// 하위 레벨로 내려가 모두 탐색을 진행하다가 더 이상 탐색할 노드가 없을 때 탐색을 멈춤
public class _07_너비우선탐색 {

	// 필요 변수
	private static int n, m, k, ans;
	private static int[][] map;
	private static boolean[][] visited;

	// 상하좌우
	private static int[] dx = { 0, 0, -1, 1 };
	private static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 가로
		m = Integer.parseInt(st.nextToken()); // 세로
		k = Integer.parseInt(st.nextToken()); // 개수
		ans = 0; // 정답

		map = new int[m][n]; // 지도 배열
		visited = new boolean[m][n]; // 방문 처리 배열

		// 조건에 맞는 요소 입력(찾는 대상은 값이 1인 좌표)
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = 1;
		}

		// 풀이 로직
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// 찾는 대상이 있고 방문하지 않았다면
				if (map[i][j] == 1 && !visited[i][j]) {
					ans++; // 정답을 하나 증가시키고
					bfs(i, j); // 너비 우선 탐색
				}
			}
		}
		System.out.println(ans);
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

				// 범위에서 벗어나지 않고,
				if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
					// 아직 방문하지 않았는데 찾는 대상이 있으면
					if (!visited[nx][ny] && map[x][y] == 1) {
						q.add(new int[] { nx, ny });
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
}
