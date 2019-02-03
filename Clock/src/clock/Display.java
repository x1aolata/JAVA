package clock;

public class Display {
	private int value;
	private int limit;

	Display(int limit,int value) {
		this.limit = limit;
		this.value = value;
	}

	public int getvalue()
	{
		return value;
	}

	void increase() {
		value++;
		if (value == limit) {

			value = 0;
		}
	}
}
