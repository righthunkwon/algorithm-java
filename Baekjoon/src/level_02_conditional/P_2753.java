package level_02_conditional;

import java.util.Scanner;

public class P_2753 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		// 윤년 : 4의 배수 (단, 100의 배수가 아니며 400의 배수일 때는 허용)
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
