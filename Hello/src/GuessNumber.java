import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int i;
		int num = (int) (Math.random() * 100 + 1);// 0,1
		int sum = 0;
		System.out.println("请输入要猜的数:");
		i = in.nextInt();
		while (i != num) {

			sum++;

			if (i > num) {
				System.out.println("大了");
			}

			if (i < num) {
				System.out.println("小了");
			}
			System.out.println("请输入要猜的数:");
			i = in.nextInt();

		}
		System.out.println("恭喜你猜中了,数字是：" + num+"。");
		System.out.println("你猜了" + (sum+1)+"次。");
	}
}