package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lowercase {
	
	public static void main (String[] args)
	{
		try
		{
			String line = null;
			String[] result = null;
			String lowerC = null;
			
			//File file = new File ("C:\\lowercase.txt");
			//FileReader reader = new FileReader(file);
			//BufferedReader in = new BufferedReader(reader);
			
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
						
			while ((line = in.readLine()) != null)
			{
				result = line.split(" ");
				for (String token:result){
					 //System.out.print(token + " ");
					 lowerC = token.toLowerCase();
					 System.out.print(lowerC + " ");
				}
				System.out.println("");
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
