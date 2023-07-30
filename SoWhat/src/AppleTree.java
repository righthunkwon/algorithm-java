import java.util.Scanner;

public class AppleTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] field = new int[N][N];

		// 땅에 영양분 입력
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = sc.nextInt();
			}
		}

		// 영양분 합의 최대값 계산
		int maxNutrient = 0;
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				int nutrient = 0;

				// 영양분 계산(경계 고려)
				nutrient += field[i][j];
				if (i - 1 >= 0) {
					nutrient += field[i - 1][j];
				}
				if (i + 1 < N) {
					nutrient += field[i + 1][j];
				}
				if (j - 1 >= 0) {
					nutrient += field[i][j - 1];
				}
				if (j + 1 < N) {
					nutrient += field[i][j + 1];
				}
				
				// 최대값 저장
				if (nutrient > maxNutrient) {
					maxNutrient = nutrient;
				}
			}
		}
		System.out.println(maxNutrient);
	}
}
