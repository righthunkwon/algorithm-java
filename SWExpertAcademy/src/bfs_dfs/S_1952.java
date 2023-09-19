package bfs_dfs;

import java.util.Scanner;

// 수영장
public class S_1952 {
	private static int oneday, onemon, threemon, oneyear; // 이용권에 따른 요금
	private static int[] plan = new int[13]; // 계획(1월~12월, index 0은 버린다)
	private static int ans; // 정답

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			oneday = sc.nextInt();
			onemon = sc.nextInt();
			threemon = sc.nextInt();
			oneyear = sc.nextInt();

			// 계획 배열 요소 입력
			for (int i = 1; i <= 12; i++) {
				plan[i] = sc.nextInt();
			}

			// 1년으로 등록하고 대소비교
			ans = oneyear;

			// 1월부터 시작
			dfs(1, 0);

			// 정답 출력
			System.out.printf("#%d %d\n", t, ans);
		}
	}

	private static void dfs(int month, int cost) {
		// 기저부분(종료조건)
		if (month > 12) {
			ans = Math.min(ans, cost); // 최소 비용 갱신
			return; // 종료
		}

		// 재귀부분(반복수행)
		// 이용할 경우
		// 하루, 한달, 세달 이용의 비용을 각각 누적합을 이용하여 계산
		if (plan[month] > 0) {
			dfs(month + 1, cost + oneday * plan[month]); // 하루
			dfs(month + 1, cost + onemon); // 한달
			dfs(month + 3, cost + threemon); // 세달
		}
		// 이용하지 않을 경우
		// 비용을 그대로 하고 다음 월로 이동하여 탐색
		else {
			dfs(month + 1, cost);
		}
	}
}