package level_00_basic;

import java.util.Scanner;

// 공
public class P_1547 {

	private static int m, ans;
	private static int[] arr;
	private static boolean flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); // 컵을 바꾼 횟수
		arr = new int[4]; // 1,2,3번 컵 (인덱스 0은 버림)
		arr[1] = 1; // 1번 컵에 공을 넣고 시작
		
		for (int i = 0; i < m; i++) {
			int cup1 = sc.nextInt();
			int cup2 = sc.nextInt();
			swap(cup1, cup2);
		}
		
		flag = false;
		for (int i = 1; i < 4; i++) {
			if (arr[i] == 1) {
				ans = i;
				flag = true;
			}
		}
		
		if (flag) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
	}
	
	private static void swap(int cup1, int cup2) {
		int tmp = arr[cup1];
		arr[cup1] = arr[cup2];
		arr[cup2] = tmp;
	}
}
