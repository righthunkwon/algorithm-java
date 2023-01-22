import java.util.Scanner;

public class CodeUp1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] arr = {a, b, c};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
