package level_00_basic;

import java.util.Scanner;

// 시험 점수
public class P_5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minkuk = 0;
		int mansae = 0;

		for (int i = 0; i < 4; i++) {
			minkuk += sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			mansae += sc.nextInt();
		}
		
		System.out.println(Math.max(minkuk, mansae));
	}
}
