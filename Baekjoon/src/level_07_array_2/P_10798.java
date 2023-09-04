package level_07_array_2;

import java.util.Scanner;

public class P_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		for (int i = 0; i < 5; i++) {
			str[i] = sc.next();
		}

		char[][] carr = new char[15][15];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				carr[i][j] = str[i].charAt(j);
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				// 문자의 초기값은 \u0000(null)이다.
				if (carr[j][i] == '\u0000') {
					continue;
				}
				System.out.print(carr[j][i]);	
			}
		}
	}
}