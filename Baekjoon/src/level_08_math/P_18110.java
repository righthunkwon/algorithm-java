package level_08_math;

import java.io.*;
import java.util.*;

// solved.ac
public class P_18110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int exclude = (int) Math.round((double) n * 0.15);
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int sum = 0;
		for (int i = exclude; i < n - exclude; i++) {
			sum += arr[i];
		}
		System.out.println(Math.round((double) sum / (n - 2 * exclude)));
	}
}
