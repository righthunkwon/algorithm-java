package level_00_basic;

import java.util.Scanner;

// 10부제
public class P_10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int ans = 0;
		for (int i=0; i<5; i++) {
			if (date == sc.nextInt()) ans++; 
		}
		System.out.println(ans);
	}
}
