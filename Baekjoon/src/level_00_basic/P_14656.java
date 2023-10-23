package level_00_basic;

import java.util.Scanner;

// 조교는 새디스트야!!
// 문제를 잘 읽고 이해하고 풀자.
public class P_14656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			if (i != arr[i]) ans++;
		}
		System.out.println(ans);
	}
}
