package Component;

import java.util.Scanner;

public class newdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Obj =  new Scanner(System.in);
		int[][] salesRecords = new int[3][4];
		for(int i = 0; i < salesRecords.length; ++i)
		{
			for(int j = 0; j < salesRecords[i].length; ++j)
			{
				salesRecords[i][j] = Obj.nextInt();
			}
		}
		int[] Ans = new int[3];
		for(int i = 0; i < salesRecords.length; ++i)
		{
			int a = 0;
			for(int j = 0; j < salesRecords[i].length; ++j)
			{
				if(j == 0)
				{
					a = salesRecords[i][j];
				}
				else if(a < salesRecords[i][j])
				{
					a = salesRecords[i][j];
				}	
			}
			Ans[i] = a;
		}
		for(int i = 0; i < Ans.length; ++i)
		{
			System.out.println(Ans[i]);
		}

	}

}
