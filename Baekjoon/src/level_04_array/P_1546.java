package level_04_array;

import java.util.Scanner;

public class P_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 시험본 과목의 개수
		
		double[] arr = new double[n];
		double max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			max = Math.max(max, arr[i]);
		}
		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i]/max * 100);
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		double ans = sum / n;
		System.out.println(ans);
	}
}
