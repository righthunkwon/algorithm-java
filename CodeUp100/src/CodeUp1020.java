import java.util.Scanner;

public class CodeUp1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String idNum = scan.next();
		
		idNum = idNum.replace("-", "");
		
		System.out.println(idNum);
	}

}

	/*
		문자열 치환하기 : replace
		
			replace(기존문자, 바꿀문자) 
			replaceAll(기존문자, 바꿀문자) (전부 바꿔줌)
			replaceAll(기존문자, 바꿀문자) (처음 문자열만 치환)

	*/
	 