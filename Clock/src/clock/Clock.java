package clock;

public class Clock {
	int a;
	int b;
	int c;

	public Clock(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	Display hour = new Display(24, a);
	Display minute = new Display(60, b);
	Display second = new Display(60, c);

	public void tick() {
		second.increase();
	}

	public String toString() {
		while (true) {

			second.increase();
			if (second.getvalue() == 0) {
				minute.increase();
				if (minute.getvalue() == 0) {
					hour.increase();
				}

			}
			System.out.printf("%02d:%02d:%02d\n", hour.getvalue(), minute.getvalue(), second.getvalue());
		}
	}

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
//		clock.toString();
		in.close();
	}

}
