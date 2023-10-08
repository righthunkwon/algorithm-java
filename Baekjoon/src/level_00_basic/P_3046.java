package level_00_basic;

import java.util.Scanner;

// R2
public class P_3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int s = sc.nextInt();
		int r2 = 2*s - r1;
		System.out.println(r2);
	}
}
