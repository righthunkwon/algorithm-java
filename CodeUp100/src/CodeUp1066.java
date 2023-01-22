import java.util.Scanner;

public class CodeUp1066 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] arr = {a, b, c};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("even");
			} else if (arr[i]%2==1) {
				System.out.println("odd");
			}
		}
	}

}
