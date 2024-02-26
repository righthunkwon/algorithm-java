package level_25_greedy;

import java.io.*;
import java.util.*;

// 코딩은 예쁘게
public class P_2879 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int prev = 0;
		int ans = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) - arr[i];
		}
		if (N > 1) {
			prev = arr[0];
			for (int i = 1; i < N; i++) {
				if (prev * arr[i] < 0) {
					ans += Math.abs(prev);
				} else if (Math.abs(prev) >= Math.abs(arr[i])) {
					ans += Math.abs(prev) - Math.abs(arr[i]);
				}
				prev = arr[i];
			}
		} else {
			ans = arr[0];
		}
		ans += Math.abs(prev);
		System.out.println(ans);
	}
}
