package level_09_divisor_multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 약수들의 합
public class P_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		StringBuilder sb;
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1) break;
		
			for (int i = 1; i < n; i++) {
				if (n % i == 0) list.add(i);
			}
			
			int tmp = 0;
			for (int num : list) {
				tmp += num;
			}
			
			boolean flag;
			if (n == tmp) flag = true;
			else flag = false;
			
			sb = new StringBuilder();
			if (flag) {
				System.out.print(n + " = ");
				for (int i = 0; i < list.size() - 1; i++) {
					System.out.print(list.get(i) + " + ");
				}
				System.out.println(list.get(list.size()-1));
			}
			else { 
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}
