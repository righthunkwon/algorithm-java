package im;

import java.util.Scanner;

// 원재의 메모리 복구하기
// 이전 입력값과 다르면 이전 입력값을 이번에 입력된 값으로 바꾼 뒤 바뀐 횟수를 1만큼 증가시킨다
public class S_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			String memory = sc.next(); // 전체 메모리
			char before = '0'; // 이전이 0이면 계속 0, 이전이 1이면 계속 1
			int ans = 0; // 바뀐 최소 횟수
			for (int i = 0; i < memory.length(); i++) {
				// 이전이 입력값과 다르다면 한 번 바뀌어야 하므로 바뀐 횟수를 1회 늘리고, 입력값에 이를 저장한다.
				if (before != memory.charAt(i)) {
					before = memory.charAt(i);
					ans++;
				}
			}
			System.out.printf("#%d %d\n", t, ans);
		}

	}
}
