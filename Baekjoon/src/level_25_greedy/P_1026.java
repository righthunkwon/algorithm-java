package level_25_greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 보물
public class P_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		Integer[] arrB = new Integer[n]; // Comparator를 사용하기 위해 Wrapper 클래스로 정의
		for (int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrB[i] = sc.nextInt();
		}
		Arrays.sort(arrA); // 오름차순 정렬 
		Arrays.sort(arrB, Comparator.reverseOrder()); // 내림차순 정렬
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += arrA[i] * arrB[i];
		}
		System.out.println(ans);
	}
}
