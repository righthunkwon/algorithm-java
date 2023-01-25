import java.util.Scanner;

public class CodeUp1095 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 출석을 부른 횟수
		int cnt = scan.nextInt();
		
		// 배열 선언 (배열의 공간 = cnt)
		int[] arr = new int[cnt];
		int min = 0;
		
		for(int i=0; i<cnt; i++) {
			arr[i] = scan.nextInt();
			min=arr[i];
		}
		
		for(int i=1; i<cnt; i++) {
			if(arr[i]<=min)
				min=arr[i];
		}
		System.out.println(min);
		
	}

}
