import java.util.Scanner;

public class Solution2058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < N.length(); i++) {
			int eachDigitNum = N.charAt(i)-'0';
			sum += eachDigitNum;
		}
		System.out.println(sum);
		
	}

}
