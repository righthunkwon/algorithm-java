import java.util.Scanner;

public class CodeUp1093 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		// 출석번호를 부른 횟수
		int[] cntArr = new int[cnt];
		
		// 번호(1~23)의 배열 선언
		int[] arr = new int[24];
		
		// 무작위로 부른 n개의 번호
		int num = 0;
		for(int i=0; i<cnt; i++) {
			cntArr[i] = scan.nextInt();
			num = cntArr[i];
			arr[num]++;
		}
		
		for(int i=1; i<=23; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
