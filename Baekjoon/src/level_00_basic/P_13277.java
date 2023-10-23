package level_00_basic;

import java.math.BigInteger;
import java.util.Scanner;

// 큰 수 곱셈
public class P_13277 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger bi1 = sc.nextBigInteger();
		BigInteger bi2 = sc.nextBigInteger();
		System.out.println(bi1.multiply(bi2));
	}
}
