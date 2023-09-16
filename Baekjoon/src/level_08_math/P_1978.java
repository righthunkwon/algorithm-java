package level_08_math;

import java.util.Scanner;

// 소수 찾기
// 1과 자기 자신만을 원소로 갖는 수
// 2이상의 수로 나눴을 때 나머지가 0이면 소수가 아니다(단, 2는 소수이다). 
public class P_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int ans = n;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) ans --;
			
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] == 2) break;
				
				if (arr[i] % j == 0) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}