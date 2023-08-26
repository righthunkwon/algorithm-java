package level_00_not_classified;

import java.util.Scanner;

public class P_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a * b * c;
		String str = Integer.toString(num);
		
		// 카운팅 배열(0~9)
		int[] cnt = new int[10];
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-'0']++;
		}
		
		// 출력
		for (int i = 0 ; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}

