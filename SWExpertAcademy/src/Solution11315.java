
import java.util.Scanner;

public class Solution11315 {
	// 북 북동 동 동남 남 남서 서 서북
	static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {

			// 문자열 배열 입력
			int n = sc.nextInt();
			String[] sarr = new String[n];
			for (int i = 0; i < n; i++) {
				sarr[i] = sc.next();
			}

			// 문자 배열 입력
			char[][] carr = new char[n][n];
			for (int i = 0; i < n; i++) {
				carr[i] = sarr[i].toCharArray();
			}

			// 탐색
			boolean find = false;

			// 배열 크기만큼 반복(n*n)
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 8 방향 만큼 반복
					for (int dir = 0; dir < 8; dir++) {
						if (carr[i][j] == 'o') {
							int cnt = 1;
							int r = i;
							int c = j;

							while (r + dr[dir] >= 0 && r + dr[dir] < n && c + dc[dir] >= 0 && c + dc[dir] < n
									&& carr[r + dr[dir]][c + dc[dir]] == 'o') {
								cnt++;
								if (cnt >= 5) {
									find = true;
									break;
								}
								c += dc[dir];
								r += dr[dir];
							}
						}
					}
				}
			}
			System.out.printf("#%d %s\n", t, find ? "YES" : "NO");
		}
	}

}