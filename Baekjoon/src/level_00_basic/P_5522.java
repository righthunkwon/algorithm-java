package level_00_basic;

import java.util.Scanner;

// 카드 게임
public class P_5522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		for (int i = 0; i < 5; i++) { 
			ans += sc.nextInt();
		}
		System.out.println(ans);
	}
}
