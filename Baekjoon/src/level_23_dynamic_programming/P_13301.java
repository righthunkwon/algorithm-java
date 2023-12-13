package level_23_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 타일 장식물
// 피보나치 형태
// 2*dp[n] + 2*(dp[n] + dp[n-1])

// 다이나믹 프로그래밍의 메모이제이션을 활용하여
// 모든 값을 구한 뒤 이미 구한 값을 저장된 값에서 꺼내서 정답 출력
public class P_13301 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// dp 배열 선언
		long[] dp = new long[81];
		
		// 초기값 세팅
		dp[1] = 1;
		dp[2] = 1;
		
		// 다이나믹 프로그래밍
		// 메모이제이션 기법 활용(값을 미리 저장)
		for (int i = 3; i <= 80; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		// 정답 출력
		System.out.println(2 * dp[n] + 2 *(dp[n] + dp[n-1]));
	}
}
