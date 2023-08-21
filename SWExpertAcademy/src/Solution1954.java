import java.util.Scanner;

public class Solution1954 {
	// 우하좌상
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];

			int dir = 0; // 방향
			int r = 0, c = 0; // 시작좌표

			// 1부터 n*n까지의 수를 배열에 넣기(등호 주의)
			for (int i = 1; i <= n * n; i++) {
				arr[r][c] = i;

				// 다음 입력에 배열을 벗어나거나 이미 숫자가 있을 경우 방향전환
				if (r + dr[dir] >= n || r + dr[dir] < 0 || c + dc[dir] >= n || c + dc[dir] < 0
						|| arr[r + dr[dir]][c + dc[dir]] != 0) {
					dir = (dir + 1) % 4; // 방향전환
				}
				// 좌표 변경
				r += dr[dir];
				c += dc[dir];
			}
			System.out.println("#" + t);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
