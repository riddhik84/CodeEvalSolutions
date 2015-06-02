package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RollerCoaster {

	public static void main(String args[])
	{
		RollerCoaster rc = new RollerCoaster();
		try
		{
			File file = new File(args[0]);
			//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\rollercoaster.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			while((line = br.readLine()) != null)
			{
				//System.out.println("Original: " + line);
				if(line.length() > 0)
				{
					rc.makeRollerCoaster(line);
				}
				System.out.println("");
			}
		} catch (FileNotFoundException fe)
		{
			fe.printStackTrace();
		} catch (IOException ie)
		{
			ie.printStackTrace();
		}

	}
	
	public void makeRollerCoaster(String line)
	{
		char[] charArray = line.toCharArray();
		int lineLength = 0;
		char tempChar;
				
		lineLength = line.length();
		
		tempChar = Character.toUpperCase(charArray[0]);
		System.out.print(tempChar);	

		for(int i = 1; i < lineLength; i++)
		{
			if (Character.isLetter(charArray[i]))
			{
				if(Character.isUpperCase(tempChar))
				{
					tempChar = Character.toLowerCase(charArray[i]);
					System.out.print(tempChar);	
					
				}else
				{
					tempChar = Character.toUpperCase(charArray[i]);
					System.out.print(tempChar);	
				}
			}  else
			{
				System.out.print(charArray[i]);	

			}
		}
	}

}
