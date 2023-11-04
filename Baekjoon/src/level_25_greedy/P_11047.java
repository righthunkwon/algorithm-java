package level_25_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
public class P_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 동전 개수
		int k = Integer.parseInt(st.nextToken()); // 동전의 총 가치
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int ans = 0; // 동전의 최소 개수
		for (int i = n-1; i >= 0; i--) {
			if (k == 0) break;
			while (k >= arr[i]) {
				k -= arr[i];
				ans++;
			}
		}
		System.out.println(ans);
	}
}
