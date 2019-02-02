import java.util.Scanner;

public class DecompositionPrimeFactor {
	public static boolean isprime(int a) {
		boolean p = true;
		if (a == 1) {
			p = false;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					p = false;
				}
			}

		}
		return p;
	}

	public static int prin(int a) {
		int b = 0;
		int i;
		for (i = 2; i <= a; i++) {
			if (a % i == 0) {
				System.out.print(i + "x");
				b = 1;
				break;

			}
		}
		if (b == 1) {
			return prin(a - i);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();

		System.out.print(a + "=");
		prin(a);

//		if (isprime(a)) {
//			System.out.println("ÊÇËØÊý");
//		}

	}

}
