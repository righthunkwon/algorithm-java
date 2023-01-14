import java.util.Scanner;

public class CodeUp1035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int num = Integer.parseInt(input, 16);
		System.out.println(Integer.toOctalString(num));
		
	}

}
