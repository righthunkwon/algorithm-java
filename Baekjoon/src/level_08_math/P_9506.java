package level_08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수들의 합
// 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면 그 수는 완전수

// 완전수임을 판단하여 
// 완전수이면 n이 아닌 약수들의 합으로 출력
// 완전수가 아니라면아니라면 n is NOT perfect. 출력

public class P_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1) break; // -1일 경우 종료

			int[] arr = new int[n]; // 출력을 위한 배열
			int sum = 0; // 완전수임을 판단하기 위한 합 변수
			
			// 약수일 경우 배열에 넣어주고 합 변수에 더함
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					arr[i] = i;
					sum += i;
				}
			}
			
			// 완전수가 아닐 경우
			if (sum != n) {
				sb.append(n + " is NOT perfect. \n");
				continue; // 이번 회차 종료
			}
			
			// 완전수일 경우
			// 1은 모든 수의 약수이므로 우선 더해주고,
			sb.append(n + " = 1"); 
			
			// 나머지 수도 더하여 출력
			for (int i = 1; i < n; i++) {
				if (arr[i] != 0 && arr[i] != 1) {
					sb.append(" + " + arr[i]);
				}
			}
            sb.append("\n");
		}
        br.close();
        System.out.println(sb);
	}
}
