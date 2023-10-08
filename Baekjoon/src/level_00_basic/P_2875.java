package level_00_basic;

import java.util.Scanner;

// 대회 or 인턴
// 남1 여2가 한 팀
// 일단 최대 팀 수를 구하고, 나머지 인원들로 인턴쉽 참여시킨 뒤에
// 인원이 부족하다면 부족한 인원의 두 배만큼 팀의 수를 줄여나가면서 최대 팀수를 갱신한다.
public class P_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 여학생 수
		int m = sc.nextInt(); // 남학생 수
		int k = sc.nextInt(); // 인턴쉽 참여 인원 수
		int tot = n + m; // 총 인원 수
		int ans = 0; // 최대 팀 수

		// (1) 최대 팀 수
		// 여학생이 남학생의 두배보다 많을 때는 남학생의 수가 곧 최대 팀수
		if (n >= 2 * m) {
			ans = m;
		}
		// 여학생이 남학생의 두배보다 적을 때는 여학생 / 2가 곧 최대 팀 수
		else {
			ans = n / 2;
		}
		
		// (2) 인턴쉽 확인
		// 전체 인원 수에서 일단 팀으로 만든 인원 수를 뺀 게 k보다 크거나 같을 경우
		// 문제가 없으므로 그냥 ans 출력
		if (tot - 3*ans >= k) {
			System.out.println(ans);
		} 
		// 전체 인원 수에서 일단 팀으로 만든 인원 수를 뺀 게 k보다 작을 경우 
		// 팀 수를 줄여야 하므로 팀 수를 적당히 줄여서 ans 출력
		else {
			int cnt = 0; // 줄인 팀 수
			while (tot - 3*ans < k) {
				k -= 3;
				cnt++;
			}
			ans -= cnt;
			System.out.println(ans);
		}
	}
}
