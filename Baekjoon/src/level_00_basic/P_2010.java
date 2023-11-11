package level_00_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 플러그
public class P_2010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int ans = 0;
		for (int num : list) {
			ans += num;
		}
		System.out.println(ans - list.size() + 1);
	}
}
