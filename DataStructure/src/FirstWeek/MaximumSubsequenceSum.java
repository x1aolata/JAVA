package FirstWeek;

import java.util.Scanner;

public class MaximumSubsequenceSum {
	
	static int MaximumSubsequenceSum4(int num[],int n)
	{
		int Thissum = 0;
		int Maxsum = 0;
		for (int i = 0; i < n; i++) {
			Thissum += num[i];
			if (Thissum > Maxsum) {
				Maxsum = Thissum;
			} else if (Thissum < 0) {
				Thissum = 0;
			}
		}
		return Maxsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int[] num=new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = in.nextInt();
		}
		
			System.out.println( MaximumSubsequenceSum4( num, n));
		}
	

}
