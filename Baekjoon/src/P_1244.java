import java.util.Scanner;

public class P_1244 {
	
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	
	// 남학생(switchNum: 부여받은 스위치 번호)
	static void man(int switchNum) {
		for(int i=switchNum; i<arr.length; i+=switchNum) {
			arr[i] = arr[i] ^ 1;
		}
	}
	
	// 여학생(switchNum: 부여받은 스위치 번호)
	static void woman(int switchNum) {
		int left = switchNum - 1;
		int right = switchNum + 1;
		
		while(true) {
			// break: left가 1보다 작거나 right가 배열의 크기보다 클 경우, left 위치의 값과 right 위치의 값이 다를 경우
			if(left<1 || right >= arr.length) {
				break;
			}
			if(arr[left] != arr[right]) {
				break;
			}
			left--;
			right++;
		}
		left++;
		right--;
		// 스위치 교환
		for(int i=left; i<=right; i++) {
			arr[i] = arr[i] ^ 1;
		}
	}
	
	// 출력
	static void switchPrint() {
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		// 스위치 갯수 입력
		int n = scan.nextInt() + 1;
		
		// 스위치 상태 입력
		arr = new int[n];
		
		for(int i=1; i<n; i++) {
			arr[i] = scan.nextInt();		}
		
		// 학생 수 입력
		int stu = scan.nextInt();
		
		for(int j=1; j<=stu; j++) {
			// 성별
			int gender = scan.nextInt();
			// 스위치 번호
			int switchNum = scan.nextInt();
			
			if(gender==1) {
				man(switchNum);
			} else if(gender==2) {
				woman(switchNum);
			}
		}
		switchPrint();
	}

}
