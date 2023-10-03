package level_99_bitmask;

import java.util.Scanner;

// 막대기
public class P_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stick = 64; // 64cm
		int x = sc.nextInt(); // xcm
		int ans = 0; // 풀로 붙이는 횟수
		
		while (x > 0) {
			// 남은 나무 막대의 길이가 목표하는 길이보다 길 경우
			// 해당 막대는 사용되지 않으므로 절반으로 자르고 넘긴다.
			if (stick > x) {
				stick /= 2;
			} 
			
			// 남은 나무 막대의 길이가 목표하는 길이보다 짧을 경우
			// 해당 막대를 풀로 붙여서 목표하는 막대의 길이를 줄인다.
			else {
				x -= stick;
				ans++; // 풀로 붙이는 횟수 증가
			}
		}
		// 정답 출력
		System.out.println(ans);
	}
}