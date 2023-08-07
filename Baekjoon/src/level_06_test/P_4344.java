package level_06_test;

import java.util.Scanner;

public class P_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 테스트케이스
		int testCase = scan.nextInt();
		
		// 학생들의 점수 배열
		int[] arr;
		
		// 반복문 : testCase만큼 반복 실행
		for(int i=0; i<testCase; i++) {
			int n = scan.nextInt();
			arr = new int[n];
			
			// 성적 누적 합
			double sum = 0;
			
			// 중첩반복문 : 학생 수(n)만큼 성적 입력
			for(int j=0; j<n; j++) {
				int score = scan.nextInt();
				arr[j] = score;
				sum += score; // 성적의 총합
			}

			// 평균 : 총합/학생수
			double mean = sum/n;
			
			// 평균을 넘는 학생 수
			double count = 0;
			
			// 중첩반복문 : 평균 넘는 학생 비율 계산
			for(int k=0; k<n; k++) {
				if(arr[k] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/n)*100);
		}
		
	}

}
