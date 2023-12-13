package level_19_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기
// 조합(mCn, m개 중에서 n개를 뽑는 경우의 수)
// 조합의 그림(역피라미드 형태, nCr = n-1Cr-1 + n-1Cr) 생각
// 메모이제이션 활용, m의 값이 최대 30이므로 배열의 최대 크기는 30
public class P_1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int[][] dp = new int[30][30];

		// 초기값 대입(nCn 과 nC0은 1이다)
		for (int i = 1; i < 30; i++) {
			dp[i][i] = 1;
			dp[i][0] = 1;
		}

		// dp 수행
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // N = r
			int m = Integer.parseInt(st.nextToken()); // M = n
			sb.append(dp[m][n]).append('\n');
		}
		System.out.println(sb);
	}

}
