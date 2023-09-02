package level_00_basic;

import java.util.Scanner;

public class P_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] arr = new int[n];
		int[] squarearr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			squarearr[i] = arr[i] * arr[i];
			sum += squarearr[i];
		}
		System.out.println(sum % 10);
	}
}
