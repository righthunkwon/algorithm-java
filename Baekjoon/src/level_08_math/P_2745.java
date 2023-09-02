package level_08_math;

import java.util.Scanner;

// 진법변환
public class P_2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next(); // n진법 수
		int n = num.length(); // 수의 길이
		int[] nums = new int[n]; // 자리수 분리
		
		// 각 숫자 혹은 문자를 배열에 순서대로 저장
		for (int i = 0; i < n; i++) {
			nums[i] = num.charAt(i) - '0';
			if (nums[i] >= 17) { // 'A' - '0' = 17
				nums[i] -= 7; // 문자일 경우 남는 유니코드값만큼 더 빼준다
			}
		}
		
		int scale = sc.nextInt(); // 진법
		int sum = 0; // 10진수
		int tmp = 1; // 자리수만큼 진법을 곱한 수

		// 자리수만큼 진법을 곱한 수에 해당 수를 곱한 값을 합에 계속해서 저장
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				tmp *= scale;
			}
			sum += tmp * nums[i];
			tmp = 1;
		}

		// 정답 출력
		System.out.println(sum);
	}
}
