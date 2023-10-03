package level_19_combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

// 조합
// nCm을 출력하라.
// n!/m!(n-m)!
public class P_2407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		BigInteger numerator = BigInteger.ONE;
		BigInteger denominator = BigInteger.ONE;
		
		for (int i = 0; i < m; i++) {
			numerator = numerator.multiply(new BigInteger(String.valueOf(n - i)));
			denominator = denominator.multiply(new BigInteger(String.valueOf(i + 1)));
		}
		
		BigInteger ans = numerator.divide(denominator);
		System.out.println(ans);
	}
	
}
