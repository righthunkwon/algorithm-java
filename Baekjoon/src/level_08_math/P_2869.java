package level_08_math;

import java.util.Scanner;

// 달팽이는 올라가고 싶다
// 시간초과 문제를 해결하기 위해 최적화 필요
public class P_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 낮에 올라가는 거리
		int b = sc.nextInt(); // 밤에 미끄러지는 거리
		int v = sc.nextInt(); // 나무 막대의 길이

		// 올라갔다 내려가는 날들을 구함
		int day = (v - a) / (a - b);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((v - a) % (a - b) != 0) {
			day++;
		}
		
		// 올라가기만 하는 마지막 날을 더해준다.
		day++;
		System.out.println(day);
	}
}
