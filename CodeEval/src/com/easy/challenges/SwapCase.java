package com.easy.challenges;

import java.io.*;
import static java.lang.System.out;

public class SwapCase {

	public static void main(String args[])
	{
		SwapCase sc = new SwapCase();
		//File file = new File(args[0]);
		File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\SwapCase.txt");
		String line;
		int fileLen = 0;

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				fileLen ++;
			}
			
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//out.println(line);
				sc.printSwapCase(line);
				
				if(fileLen > 1)
				{
					out.println();
					fileLen--;
				}
			}

		} catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void printSwapCase(String line)
	{
		String[] inputWordArray = line.split(" ");
		//out.println("inputWordArray length: " + inputWordArray.length);

		for(int i = 0; i < inputWordArray.length; i++)
		{
			//out.println(" In first for loop ");

			char[] charArray = inputWordArray[i].toCharArray();
			
			for(int k = 0; k < charArray.length; k++)
			{
				//out.println(" In second for loop ");

				if(Character.isLetter(charArray[k]))
				{
					//out.println(" In isLetter loop ");
					
					if(Character.isLowerCase(charArray[k]))
					{
						//out.println(" In isLowerCase loop ");
						charArray[k] = Character.toUpperCase(charArray[k]);
					} 
					else if (Character.isUpperCase(charArray[k]))
					{
						//out.println(" In isUpperCase loop ");
						charArray[k] = Character.toLowerCase(charArray[k]);
					}
				}
				out.print(charArray[k]);
			}

			if(i < inputWordArray.length - 1)
			{
				out.print(" ");
			}
		}
	}
}
