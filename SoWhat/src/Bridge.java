import java.util.Scanner;

public class Bridge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 영역 생성 
		int[][] space = new int[N][N];
		for (int i = 0; i < space.length; i++) {
			for (int j = 0; j < space[i].length; j++) {
				space[i][j] = sc.nextInt();
			}
		}

		// 최대값
		int maxLength = 0;
		
		// 방향 지정
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		for (int i = 0; i < space.length; i++) {
			for (int j = 0; j < space[i].length; j++) {
				if (space[i][j] == 1) {
					boolean[][] visited = new boolean[N][N];
					int[][] queue = new int[N * N][3];
					int front = 0;
					int rear = 0;

					queue[rear][0] = i;
					queue[rear][1] = j;
					queue[rear][2] = 0;
					rear++;

					visited[i][j] = true;

					while (front < rear) {
						int r = queue[front][0];
						int c = queue[front][1];
						int distance = queue[front][2];
						front++;

						for (int[] direction : directions) {
							int nr = r + direction[0];
							int nc = c + direction[1];

							if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc]) {
								if (space[nr][nc] == 1) {
									if (distance > maxLength) {
										maxLength = distance;
									}
								} else if (space[nr][nc] == 0) {
									visited[nr][nc] = true;
									queue[rear][0] = nr;
									queue[rear][1] = nc;
									queue[rear][2] = distance + 1;
									rear++;
								}
							}
						}
					}
				}
			}
		}

		System.out.println(maxLength);
	}
}
