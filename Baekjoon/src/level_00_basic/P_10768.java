package level_00_basic;

import java.util.Scanner;

// 특별한 날
public class P_10768 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a==2 && b==18) System.out.println("Special");
		else if ((a<2) || (a==2 && b<18)) System.out.println("Before");
		else System.out.println("After");
	}
}

