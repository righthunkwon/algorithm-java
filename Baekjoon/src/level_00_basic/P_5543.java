package level_00_basic;

import java.util.Scanner;

// 상근날드
public class P_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bg1 = sc.nextInt();
		int bg2 = sc.nextInt();
		int bg3 = sc.nextInt();
		int cola = sc.nextInt();
		int cider = sc.nextInt();
		System.out.println(Math.min(bg1, Math.min(bg2, bg3)) + Math.min(cola, cider) - 50);
	}
}
