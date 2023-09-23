package level_08_math;

import java.util.Scanner;

// 윷놀이
public class P_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			int[] arr = new int[3];
			for (int j = 0; j < 4; j++) {
				arr[i] = sc.nextInt();
				if (arr[i] == 0) {
					cnt++;
				}
			}
			switch(cnt) {
			case 0:
				System.out.println("E");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			}
		}
	}
}
