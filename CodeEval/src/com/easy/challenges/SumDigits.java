package com.easy.challenges;

import java.io.*;

public class SumDigits {

	public static void main (String[] args)
	{
		try{
			String line = null;
						
			File file = new File ("C:\\sumdigits.txt");
			FileReader reader = new FileReader (file);

			//File file = new File (args[0]);
			//BufferedReader in = new BufferedReader(new FileReader(file));

			BufferedReader in = new BufferedReader(reader);

			while ((line = in.readLine()) != null)
			{
				int sum = 0, num = 0, numLen  = 0;
				
				numLen = line.length();
				num = Integer.parseInt(line);

				for (int i =0; i < numLen; i ++)
				{
					int mod = num % 10;
					sum = sum + mod;
					num = num / 10;
				}
				System.out.println("Sum " + sum);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
