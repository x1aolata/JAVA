package One;

public class Fraction {
	private int x;
	 int y;

	Fraction() {

	}

	Fraction(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {

		if (x == y) {
			System.out.println("1");
		} else {
			System.out.println(x / gcd(x, y) + "/" + y / gcd(x, y));
		}

	}

	Fraction plus(Fraction r) {
		Fraction m = new Fraction();
		m.x = x * r.y + r.x * y;
		m.y = y * r.y;
		return m;
	}

	Fraction multiply(Fraction r) {
		Fraction m = new Fraction();
		m.x = x * r.x;
		m.y = y * r.y;

		return m;
	}

	int gcd(int a, int b) {

		int min;
		int num = 0;
		boolean m = false;

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
			return num;
		} else {
			return 1;
		}
	}

}