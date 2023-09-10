
public class onetassafy {

	public static double getAngle(double x1, double y1, double x2, double y2) {
		// x1, y1은 치는 공의 좌표
		// x2, y2은 목적구의 좌표
		double x = x2 - x1;
		double y = y2 - y1;

		// 치는 공을 0,0에 있다고 생각하고 상대 좌표 구하여 atan2 메소드 호출
		double radian = Math.atan2(x2 - x1, y2 - y1);
		double degree = Math.toDegrees(radian);
		/*
		 * 0도
		 * 
		 * | 4사분면 | 1사분면 -90도------------- 90도 | 3사분면 | 2사분면
		 * 
		 * -180도(180도)
		 */

		// 일타싸피는 북쪽부터 0도로 시작해서 시계방향으로 360도까지 증가하므로 atan2 결과를 추가 계산해줘야함
		if (x >= 0 && y >= 0) {
			// 1사분면
			return degree;
		} else if (x >= 0 && y < 0) {
			// 2사분면
			return degree;
		} else if (x < 0 && y < 0) {
			// 3사분면
			return 360 + degree;
		} else if (x < 0 && y >= 0) {
			// 4사분면
			return 360 + degree;
		}
		return 0;
	}

	public static void main(String[] args) {

		double a = getAngle(0, 0, 1, 1);

		double b = getAngle(0, 0, 1, -1);

		double c = getAngle(0, 0, -1, 1);

		double d = getAngle(0, 0, -1, -1);

		System.out.println("1사분면" + a);
		System.out.println("2사분면" + b);
		System.out.println("4사분면" + c);
		System.out.println("3사분면" + d);
	}

}
