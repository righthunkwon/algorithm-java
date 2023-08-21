import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution5099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // 화덕 크기
			int m = sc.nextInt(); // 피자 개수
			
			// 피자에 따른 치즈 입력
			Queue<Integer> cheese = new LinkedList<>();
			for (int i = 0; i < m; i++) {
				cheese.add(sc.nextInt());
			}
		}
	}
}
