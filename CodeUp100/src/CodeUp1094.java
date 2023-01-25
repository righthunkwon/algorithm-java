import java.util.Scanner;

public class CodeUp1094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 출석을 부른 횟수
		int cnt = scan.nextInt();
		
		// 배열 선언 (배열의 공간 = cnt)
		int[] arr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=cnt-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
