package level_08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// int
// 4byte, -2147483648 ~ 2147483647

// long
// 8byte,  -9223372036854775808 ~ 9223372036854775807

// BigInteger 
// 큰 범위 정수
// 문자열로 생성( BigInteger bigInteger = new BigInteger("문자열"); )
// add(), substract(), multiply(), divide(), mod() 메서드 활용
// compareTo() 활용 가능 (같으면 0, 앞이 더 크면 1, 뒤가 더 크면 -1)

// BigDecimal
// 큰 범위 실수
// 문자열로 생성( BigInteger bigInteger = new BigInteger("문자열"); )
// 올림, 반올림, 버림, 소수점 관리 등 다양한 메서드 활용 가능

// 부호
// 다양한 자료형 활용 방법 익히기
public class P_1247 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// test case
		for (int t = 1; t <= 3; t++) {
			StringBuilder sb = new StringBuilder();
			BigInteger ans = new BigInteger("0");
			
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				BigInteger b = new BigInteger(br.readLine());
				
				// BigInteger는 계산 과정에서
				// 갱신이 반드시 필요함에 유의하자.
				ans = ans.add(b); 
			}
			
			// BigInteger는
			// compareTo 메소드를 활용하여
			// 양수, 음수, 0을 판별할 수 있다.
			if (ans.compareTo(BigInteger.ZERO) == 1) {
				System.out.println("+");
			} else if (ans.compareTo(BigInteger.ZERO) == 0) {
				System.out.println("0");
			} else if (ans.compareTo(BigInteger.ZERO) == -1) {
				System.out.println("-");
			}
		}
	}
}
