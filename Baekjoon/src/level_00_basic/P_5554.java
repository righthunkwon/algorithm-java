package level_00_basic;

import java.util.Scanner;

// 심부름 가는 길
public class P_5554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int tot = n1+n2+n3+n4;
		int min = tot / 60;
		int sec = tot % 60;
		System.out.println(min);
		System.out.println(sec);
	}
}
