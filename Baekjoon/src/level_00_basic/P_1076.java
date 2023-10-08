package level_00_basic;

import java.util.Scanner;

// 저항
public class P_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 저항의 색 입력
		String[] s = new String[3];
		for (int i = 0; i < 3; i++) {
			s[i] = sc.next();
		}

		// 저항 값
		String resistance = "";
		for (int i = 0; i < 2; i++) {
			switch (s[i]) {
			case "black":
				resistance += "0";
				break;
			case "brown":
				resistance += "1";
				break;
			case "red":
				resistance += "2";
				break;
			case "orange":
				resistance += "3";
				break;
			case "yellow":
				resistance += "4";
				break;
			case "green":
				resistance += "5";
				break;
			case "blue":
				resistance += "6";
				break;
			case "violet":
				resistance += "7";
				break;
			case "grey":
				resistance += "8";
				break;
			case "white":
				resistance += "9";
				break;
			}
		}

		long ans;
		if (resistance.equals("00")) {
			ans = 0;
		} else {
			ans = Integer.parseInt(resistance);
		}

		// 저항값(곱)
		switch (s[2]) {
		case "black":
			ans *= 1;
			break;
		case "brown":
			ans *= 10;
			break;
		case "red":
			ans *= 100;
			break;
		case "orange":
			ans *= 1000;
			break;
		case "yellow":
			ans *= 10000;
			break;
		case "green":
			ans *= 100000;
			break;
		case "blue":
			ans *= 1000000;
			break;
		case "violet":
			ans *= 10000000;
			break;
		case "grey":
			ans *= 100000000;
			break;
		case "white":
			ans *= 1000000000;
			break;
		}
		System.out.println(ans);
	}
}
