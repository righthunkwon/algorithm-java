package level_08_math;

import java.util.Scanner;

// 소인수분해
// 정수 N이 주어졌을 때 소인수분해하는 프로그램을 작성하시오
public class P_11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 어떤 n을 두 수 이상의 곱으로 나타낼 수 있을 때
		// 인수 중 하나 이상은 반드시 n의 제곱근보다 작거나 같다
		for (int i = 2; i <= Math.sqrt(n); i++) { 
			while (n % i == 0) {
				System.out.println(i);
				n /= i;
			}
		}
		
		// n이 1이 아니라면
		// 해당 수는 소수인 인수이므로 출력
		if (n != 1) {
			System.out.println(n);
		}
	}
}
