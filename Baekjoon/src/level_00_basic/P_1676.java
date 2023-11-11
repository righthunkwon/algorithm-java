package level_00_basic;

import java.util.Scanner;

// 팩토리얼 0의 개수
// 충분히 고민해보고 규칙 찾아보기
// 뒷자리가 0이 나오는 경우는 바로 2와 5가 곱해져 있을 때
// 2의 개수는 5의 개수보다 많으므로 5의 거듭제곱을 곱할 때 해당 수의 지수만큼 0의 개수가 증가

// 1!	1
// 2!	2
// 3!	6
// 4!	24
// 5!	120
// 6!	720
// 7!	5040
// 8!	40320
// 9!	362880
// 10!	3628800
// 11! 	39916800
// . . .
// 15!	1307674368000
public class P_1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n!
		int ans = 0; // 0의 개수
		while (n >= 5) {
			ans += n / 5;
			n /= 5;
		}
		System.out.println(ans);
	}
}
