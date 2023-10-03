package level_12_bruteforce;

import java.util.Scanner;

// 영화감독 숌
public class P_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 666;
		int cnt = 1;
		while (cnt != n) {
			num++;
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
	}
}
