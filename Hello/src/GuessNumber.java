import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int i;
		int num = (int) (Math.random() * 100 + 1);// 0,1
		int sum = 0;
		System.out.println("������Ҫ�µ���:");
		i = in.nextInt();
		while (i != num) {

			sum++;

			if (i > num) {
				System.out.println("����");
			}

			if (i < num) {
				System.out.println("С��");
			}
			System.out.println("������Ҫ�µ���:");
			i = in.nextInt();

		}
		System.out.println("��ϲ�������,�����ǣ�" + num+"��");
		System.out.println("�����" + (sum+1)+"�Ρ�");
	}
}