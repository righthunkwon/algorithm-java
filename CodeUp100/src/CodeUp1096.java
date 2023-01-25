import java.util.Scanner;

public class CodeUp1096 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[20][20];
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr[x-1][y-1]=1;
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
