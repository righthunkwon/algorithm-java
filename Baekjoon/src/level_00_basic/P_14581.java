package level_00_basic;

import java.util.Scanner;

// 팬들에게 둘러싸인 홍준
public class P_14581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(":fan::fan::fan:\n" + 
				":fan::" + s + "::fan:\n" + 
				":fan::fan::fan:");
	}
}
