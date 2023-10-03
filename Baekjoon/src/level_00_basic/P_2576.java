package level_00_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 홀수
public class P_2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			int tmp = sc.nextInt();
			if (tmp % 2 == 1) {
				list.add(tmp);
			}
		}
		
		// 홀수가 없을 때
		if (list.isEmpty()) {
			System.out.println(-1);
		} 
		
		// 홀수가 존재할 때
		else {
			int min = Integer.MAX_VALUE;
			int sum = 0;
			for (int num : list) {
				min = Math.min(min, num);
				sum += num;
			}
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
