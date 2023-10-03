package level_00_basic;

import java.util.Scanner;

// 지능형 기차
public class P_2455 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int cnt = 0; // 사람 수
		 int max = 0; // 사람 수의 최대값
		 while (true) {
			 int out = sc.nextInt(); // 내린 사람
			 int in = sc.nextInt(); // 탄 사람
			 
			 // 탄 사람이 없을 경우 마지막 정류장이므로 반복문 종료
			 if (in == 0) {
				 break;
			 }
			 cnt -= out;
			 cnt += in;
			 max = Math.max(max, cnt);
		 }
		 System.out.println(max);
	}
}
