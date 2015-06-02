package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fibonacci {

	public static void main (String[] args)
	{
		try{
			String line = null;

			File file = new File ("C:\\fibonacci.txt");
			FileReader reader = new FileReader (file);

			//File file = new File (args[0]);
			//BufferedReader in = new BufferedReader(new FileReader(file));

			BufferedReader in = new BufferedReader(reader);

			while ((line = in.readLine()) != null)
			{
				int fiboLimit = 0;
				int fibo0 = 0;
				int fibo1 = 1;
				int fiboSum = 0;
				int buffer = 0;

				fiboLimit = Integer.parseInt(line);

				if(fiboLimit > 1)
				{
					for (int i =0; i < fiboLimit - 1; i ++)
					{
						fiboSum = fibo0 + fibo1;
						fibo0 = fibo1;
						fibo1 = fiboSum;
					}
				}
				else if (fiboLimit == 0)
				{
					fiboSum = 0;
				}
				else if (fiboLimit == 1)
				{
					fiboSum = 1;
				}
				System.out.println("Sum " + fiboSum);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}