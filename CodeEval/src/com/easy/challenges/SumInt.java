package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SumInt {
	
	public static void main (String[] args)
	{
		try{
			String line = null;
			int sum = 0;

			File file = new File ("C:\\sumint.txt");
			FileReader reader = new FileReader (file);

			//File file = new File (args[0]);
			//BufferedReader in = new BufferedReader(new FileReader(file));

			BufferedReader in = new BufferedReader(reader);

			while ((line = in.readLine()) != null)
			{
				sum = sum + Integer.parseInt(line);
			}
			System.out.println(sum);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
