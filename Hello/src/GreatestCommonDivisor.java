import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

//		boolean a = true;
//		double sum=0;
//		int n = in.nextInt();
//		for (int i = 1; i <= n; i++) {
//			sum += (double)( 1.0 / i);
//		}
//		System.out.printf("%.2f",sum);

		int a;
		int b;
		int min;
		int num = 0;
		boolean m = false;
		a = in.nextInt();
		b = in.nextInt();
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		for (int i = min; i >= 2; i--) {

			if (a % i == 0 && b % i == 0) {
				num = i;
				m = true;
				break;
			}

		}
		if (m) {
			System.out.println("最大公约数为：" + num);
		} else {
			System.out.println("最大公约数为：1，很小" );
		}
	}
}