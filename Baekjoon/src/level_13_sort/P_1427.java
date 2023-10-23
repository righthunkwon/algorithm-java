package level_13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 소트인사이드
public class P_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] carr = s.toCharArray();
		List<Integer> narr = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			narr.add(carr[i] - '0');
		}
		Collections.sort(narr, Collections.reverseOrder());
		for (int n : narr) {
			System.out.print(n);
		}
	}
}
