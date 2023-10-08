package level_00_basic;

import java.util.Scanner;

// 상근이의 친구들
public class P_5717 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int men = sc.nextInt();
			int women = sc.nextInt();
			if (men == 0 && women == 0) break;
			System.out.println(men + women);
		}
		
	}
}
