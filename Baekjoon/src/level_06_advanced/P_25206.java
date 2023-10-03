package level_06_advanced;

import java.util.Scanner;

// 너의 평점은
public class P_25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] credit = new double[20]; // 학점
		String[] grade = new String[20]; // 등급
		double[] score = new double[20]; // 점수(학점*등급)

		for (int i = 0; i < 20; i++) {
			sc.next(); // 과목명 버림
			credit[i] = sc.nextDouble();
			grade[i] = sc.next();
			if (grade[i].equals("A+")) {
				score[i] = credit[i] * 4.5;
			} else if (grade[i].equals("A0")) {
				score[i] = credit[i] * 4.0;
			} else if (grade[i].equals("B+")) {
				score[i] = credit[i] * 3.5;
			} else if (grade[i].equals("B0")) {
				score[i] = credit[i] * 3.0;
			} else if (grade[i].equals("C+")) {
				score[i] = credit[i] * 2.5;
			} else if (grade[i].equals("C0")) {
				score[i] = credit[i] * 2.0;
			} else if (grade[i].equals("D+")) {
				score[i] = credit[i] * 1.5;
			} else if (grade[i].equals("D0")) {
				score[i] = credit[i] * 1.0;
			} else if (grade[i].equals("F")) {
				score[i] = credit[i] * 0.0;
			} else if (grade[i].equals("P")) {
				score[i] = credit[i] * 0.0;
			}
		}
		
		double cnt = 0; // 학점 합
		double sum = 0; // 점수 합
		for (int i = 0; i < 20; i++) {
			
			// 과목 수 카운트
			if (!grade[i].equals("P")) {
				cnt += credit[i];
			}
			
			// 점수 합 누적
			sum += score[i];
		}
		
		// 정답 출력
		if (cnt == 0) {
			System.out.println(0.000000); // NaN 방지
		} else {
			System.out.println(sum/cnt);
		}
	}
}