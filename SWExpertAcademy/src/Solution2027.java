
public class Solution2027 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];

		for (int r=0; r<5; r++) {
			for (int c=0; c < 5; c++) { // c<col -> ,c<arr[r].length로도 변경 가능하다(칸수 = 열수)
				if (r == c) {
					System.out.print("#");
				} else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}
