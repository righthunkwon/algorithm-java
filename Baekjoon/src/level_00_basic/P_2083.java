package level_00_basic;

import java.util.Scanner;

// 럭비 클럽
public class P_2083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
			String name = sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();

			if (name.equals("#") && age == 0 && weight == 0) {
				break;
			} else if (age > 17 || weight >= 80) {
				sb.append(name).append(" Senior").append("\n");
			} else {
				sb.append(name).append(" Junior").append("\n");
			}
		}
		System.out.println(sb);
	}
}