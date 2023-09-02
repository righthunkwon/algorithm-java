package level_12_bruteforce;

import java.util.Scanner;

// 분해합
// 브루트포스
public class P_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받는 자연수
		int ans = 0; // 만약 만족하는 생성자가 없다면 0 출력

		// 특정 수의 생성자는 해당 수보다 작으므로 해당 수까지 반복하며 정답 탐색
		for (int i = 0; i < n; i++) {
			
			// 생성자는 어떤 수와 그 수의 자리수의 합이므로,
			// 반복문을 순회하며 우선 어떤 수를 임시 변수에 담는다.
			int tmp = i; // 임시변수는 생성자의 연산 결과이다.
			
			// 이후 어떤 수의 자리수를 더해주기 위해 
			// 어떤 수를 문자열에 담은 뒤, 이를 분리하여 문자를 숫자로 바꿔 정수 배열에 담는다.
			String digit = String.valueOf(i);
			int[] digits = new int[digit.length()];
			
			for (int j = 0; j < digits.length; j++) {
				// 문자 - '0'을 통해 문자를 숫자로 바꾼다.
				digits[j] = digit.charAt(j) - '0';
				
				// 어떤 수 i에 어떤 수의 자리수(digits)를 더해나간다.
				tmp += digits[j];
			}
			
			// 만약 생성자(i)의 연산 결과(tmp)가 어떤 수(n)와 같다면
			// 정답 변수(ans)에 생성자(i)를 담는다.

			if (tmp == n) {
				ans = i;
				break;
				
				// 이때 어떤 수의 생성자는 여러 숫자가 올 수 있는데,
				// 정답은 가장 작은 생성자를 도출해야 하므로
				// 반복문을 작은 수부터 돌리면서 처음 정답이 나오면
				// break를 통해 반복문을 종료한다.
			}
		}

		// 정답 출력
		System.out.println(ans);
	}
}
