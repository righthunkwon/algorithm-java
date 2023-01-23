import java.util.Scanner;

public class CodeUp1075 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i=0; i<input; input--) {
			if(input!=-1) {
				System.out.println(input-1);
			} else if (input==1) {
				break;
			}
			
		}
	}
	
}
