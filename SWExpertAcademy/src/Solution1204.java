import java.util.Map;
import java.util.Scanner;

public class Solution1204 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();

		for (int i=1; i<=test; i++) {
			int testCase = scan.nextInt();
			int maxScore = 0;
			int scores[] = new int[1000]; // 점수의 개수
			int count[] = new int[101]; // 점수의 범위 0~100의 카운트 횟수

			for (int j=0; j<1000; j++) {
				scores[j] = scan.nextInt(); // 점수입력
				count[scores[j]]++; // 해당 점수 cnt ++
			}

			for (int k=0; k<count.length-1; k++) {
				if (count[maxScore] <= count[k]) {
					maxScore = k;
				}
			}
			System.out.println("#" + testCase + " " + maxScore);
		}
	}
}
