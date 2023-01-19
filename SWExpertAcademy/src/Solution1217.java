import java.util.Scanner;

public class Solution1217 {

	static int powerRecursive(int n1, int n2) {
		// 재귀함수 종료(1로 리턴할 경우 곱하더라도 동일한 결과)
		if(n2==0) {
			return 1;
		}
		// powerRecursive : 재귀호출
		return n1 * powerRecursive(n1, n2-1); // 밑은 그대로 유지, 지수는 1 감소
	} 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			int textCase = scan.nextInt();		
			int base = scan.nextInt();
			int power = scan.nextInt();
			System.out.println("#"+i+" "+powerRecursive(base, power));
		}
	}

}
