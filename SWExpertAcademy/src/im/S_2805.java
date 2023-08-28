package im;

import java.util.Scanner;

// 농작물 수확하기
// 마름모는 영역을 반으로 나누어 더해주자.
public class S_2805 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // test case
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
 
            // 배열 입력
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }
 
            // 합
            int sum = 0;
 
            // 상단 삼각형
            for (int i = 0; i < n / 2; i++) { // 행
                for (int j = n / 2 - i; j <= (n / 2 + i); j++) { // 열 (좌우 대칭만큼 늘어난다, -i ~ +i)
                    sum += arr[i][j];
                }
            }
 
            // 하단 삼각형
            for (int i = n / 2; i >= 0; i--) { // 행
                for (int j = n / 2 - i; j <= n / 2 + i; j++) { // 열 (좌우 대칭만큼 줄어든다, -i ~ +i)
                    sum += arr[n - i - 1][j];
                }
            }
            System.out.printf("#%d %d\n", t, sum);
        }
    }
}
