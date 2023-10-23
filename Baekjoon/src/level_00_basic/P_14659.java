package level_00_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한조서열정리하고옴ㅋㅋ
public class P_14659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int standard = arr[0]; // 비교기준
		int max = 0; // 각 활잡이가 처치할 수 있는 적의 최대숫자(정답)
		int ans = 0; // 전체 활잡이가 처치할 수 있는 적의 최대숫자
		for (int i = 1; i < n; i++) {
			if (standard < arr[i]) {
				standard = arr[i];
				ans = Math.max(max, ans);
				max = 0;
			} else {
				max++;
				ans = Math.max(max, ans);
			}
		}
		System.out.println(ans);
	}
}
