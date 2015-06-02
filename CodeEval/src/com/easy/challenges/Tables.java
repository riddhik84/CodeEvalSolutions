package com.easy.challenges;

public class Tables {

	public static void main (String[] args)
	{
		try{
			int count = 0;
			
			for(int i = 1; i <= 12; i ++)
			{
				for (int j = 1; j <=12; j++)
				{
					count = i * j;
					System.out.printf("%4s" , count);	
					
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
