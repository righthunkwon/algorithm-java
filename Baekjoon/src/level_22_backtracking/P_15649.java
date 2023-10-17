package level_22_backtracking;

import java.util.Scanner;

// N과 M (1)
// 1부터 n까지의 자연수 중 중복 없이 m개를 고르기
public class P_15649 {
	private static int n, m;
	private static int[] arr;
	private static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		visited = new boolean[n];
		dfs(0);
	}
	
	private static void dfs(int depth) {
		// 기저부분(종료조건)
		if (depth == m) {
			for (int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
			return;
		}
		
		// 재귀부분(반복수행)
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
