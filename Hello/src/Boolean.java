import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i;
		boolean a = false;
		OUT:
		for (i = 0; i < 12; i++) 
		{

			System.out.println("��ѭ��");
			hahha:
			for (int j = 0; j < 13; j++) 
			{
				if (a) 
				{
					System.out.println("��ѭ��");
					break OUT;
					
				}
				else 
				{
					System.out.println("else");
					break hahha;
				}

			}
		}
	}
}