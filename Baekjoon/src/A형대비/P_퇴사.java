package A형대비;

import java.io.*;
import java.util.*;

// 백트래킹(깊이우선탐색)
public class P_퇴사 {
	static int n, ans;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine()); // 전체 일수
		ans = 0; // 최대 수익

		arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken()); // 상담일수
			arr[i][1] = Integer.parseInt(st.nextToken()); // 상담가격
		}
		dfs(0, 0);
		System.out.println(ans);
	}

	private static void dfs(int idx, int price) {
		// 종료조건
		if (idx >= n) {
			ans = Math.max(ans, price);
			return;
		}

		// 반복수행
		// 상담이 가능할 경우 가격을 더해 탐색
		if (idx + arr[idx][0] <= n) {
			dfs(idx + arr[idx][0], price + arr[idx][1]);
		}
		// 상담이 불가능할 경우 가격을 그대로하고 탐색
		else {
			dfs(idx + arr[idx][0], price);
		}

		dfs(idx + 1, price); // 새로운 일자에 상담
	}
}
