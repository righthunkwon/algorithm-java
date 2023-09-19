package level_00_basic;

import java.util.Scanner;

// 파티가 끝나고 난 뒤
public class P_2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();
		int space = sc.nextInt();
		for (int i = 0 ; i < 5; i++) {
			System.out.print(sc.nextInt() - (participants * space) + " ");
		}
	}
}