package level_00_basic;

import java.util.Scanner;

// 운동
public class P_1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 운동한 시간
		int pulse = sc.nextInt(); // 맥박
		int min = pulse; // 최소 맥박
		int max = sc.nextInt(); // 최대 맥박
		int t = sc.nextInt(); // 운동할 때 높아지는 맥박
		int r = sc.nextInt(); // 휴식할 때 떨어지는 맥박
		
		int ans = 0; // 전체 시간(운동 + 휴식)
		int cnt = 0; // 운동 시간
		while (cnt < n) {
			
			// 종료 조건(예외처리)
			if (max - min < t) {
				ans = -1;
				break;
			}
			
			// 풀이 로직
			if (pulse + t <= max) {
				ans++;
				cnt++;
				pulse += t;
			} else if (pulse - r >= min) {
				ans++;
				pulse -= r;
			} else if (pulse - r < min) {
				ans++;
				pulse = min;
			}
		}
		System.out.println(ans);
	}
}
