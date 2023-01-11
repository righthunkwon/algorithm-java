import java.util.Scanner;

public class CodeUp1023 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		String a = Double.toString(input);
		String list[] = a.split("\\.");
		
		System.out.println(list[0]);
		System.out.println(list[1]);
		
		
		/*
			double로 입력값을 받았지만 split은 문자열을 자르게 해주는 것이므로
			Double.toString을 이용하여 이를 문자열로 바꾼 뒤, a를 split을
			이용하여 나눠주고 이를 list[] 배열에 담아 차례대로 출력하였다. 
		*/
	}

}
