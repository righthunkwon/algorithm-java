package level_00_basic;

import java.math.BigInteger;
import java.util.Scanner;

// 엄청난 부자2
// 입력값의 범위가 최대 10^1000이라 long으로 입력받았지만,
// 이는 너무나도 큰 수가 long의 범위도 초과하여 inputMismatch 에러가 발생한다.

// BigInteger
// int의 범위는 -21억에서 +21억 정도이지만,
// BigInteger는 문자열로 이루어져 있어 범위의 제한이 없다.

// 하지만, BigInteger는 문자열로 이루어져 있기에
// 사칙연산이 되지 않으므로 클래스 내부의 함수를 이용해야 한다(add, subtract, multiply, divide, remainder)
public class P_1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
}
