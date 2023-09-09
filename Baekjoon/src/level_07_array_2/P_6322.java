package level_07_array_2;

import java.util.Scanner;

// 직각 삼각형의 두 변
public class P_6322 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		int count = 0;
		
		while (true) {
			count++;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt(); // 빗변

			// finish loop
			if (a==0 && b==0 && c==0) {
				break;
			}
			
			// test case
			System.out.println("Triangle #" + count);

			// logic
			if (a == -1) {
				if (c <= b) {
					System.out.println("Impossible.");
				} else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.println("a = " + String.format("%.3f", a));
				}
			} else if (b == -1) {
				if (c <= a) {
					System.out.println("Impossible.");
				} else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.println("b = " + String.format("%.3f", b));
				}
			} else if (c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.println("c = " + String.format("%.3f", c));
			}
			
			// line-break
			System.out.println();
		}
	}
}