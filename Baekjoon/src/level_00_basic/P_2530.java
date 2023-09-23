package level_00_basic;

import java.util.Scanner;

// 인공지능 시계
public class P_2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		int d = sc.nextInt();
		
		// 일단 초를 더해
		second += d;
		
		// 초 60 넘어가면 분에 넘어가는 초 더하고 초 60으로 나눈 나머지 저장
		minute += second/60;
		second %= 60;
		
		// 분 60 넘어가면 시간에 넘어가는 분 더하고 분 60으로 나눈 나머지 저장
		hour += minute/60;
		minute %= 60;
		
		// 시간 24 넘어가면 시간에 24로 나눈 나머지 저장
		hour %= 24;
		
		System.out.printf("%d %d %d", hour, minute, second);
	}
}
