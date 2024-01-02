package level_00_basic;

import java.util.Arrays;
import java.util.Scanner;

// 약수
public class P_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if (n == 1) {
			System.out.println(arr[0] * arr[0]);
		} else {
			System.out.println(arr[0] * arr[n-1]);
		}
	}
}
