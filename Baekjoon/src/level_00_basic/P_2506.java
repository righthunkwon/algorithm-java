package level_00_basic;

import java.util.Scanner;

// 점수계산
public class P_2506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int score = 1;
		for (int i = 0; i < n; i++) {
			int OX = sc.nextInt();
			if (OX == 1) ans += score++;
			else score = 1; 
		}
		System.out.println(ans);
	}
}
