package level_00_basic;

import java.util.Scanner;

// 캥거루 세마리	
public class P_2965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(Math.max((b-a-1),(c-b-1)));
		sc.close();
	}
}

