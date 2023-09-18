package level_00_bitmask;

import java.util.Scanner;

// XORXORXOR
// xor을 xor한 연산의 결과는 연산을 하기 전과 그대로이다.

// 비트마스크
// 존재를 1로, 존재하지 않음을 0으로 표현
// 즉, 비트마스크는 이진수를 이용하여 두 가지 정보를 표현하는 것

// 비트마스크의 상태를 변경하기 위한 다양한 연산은
// 비트연산으로 효율적으로 구현 가능한데, 이것이 비트마스크를 사용하는 이유

// 기본
// & : and
// | : or
// ^ : xor
// ~ : not
// <<, >>, >>> : shift

// 응용
// 가장 우측의 비트를 1번째 비트라고 할 때,
// i번째 비트 조회는 n & (1 << (i - 1)) 

public class P_12833 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		// c가 짝수일 경우 xor의 연산은 그대로 
		if (c % 2 == 0) {
			System.out.println(a);
		} 
		
		// c가 홀수일 경우 xor의 연산 한 번
		else {
			System.out.println(a ^ b);
		}
	}
}
