package com.easy.challenges;

import java.io.*;
import static java.lang.System.out;

public class CapitalizeWords {

	public static void main(String args[])
	{
		CapitalizeWords cw = new CapitalizeWords();
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\CapitalizeWord.txt");
		File file = new File(args[0]);
		String line;
		int fileLen = 0;

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				fileLen++;
			}
			//out.println("lineLen :" +fileLen);

			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//out.println(line);
				cw.printCapitalizedWord(line);
				if(fileLen > 1)
				{
					System.out.println();
					fileLen --;
				}
			}

		} catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void printCapitalizedWord(String line)
	{
		String[] wordArray = line.split(" ");
		//out.println("wordArrayLen :" +wordArray.length);
		
		for(int i = 0; i < wordArray.length; i ++)
		{
			//out.println("Original Word: " +wordArray[i]);
			char[] tempStringChars = wordArray[i].toCharArray();
			tempStringChars[0] = Character.toUpperCase(tempStringChars[0]);
			
			for(int k = 0; k < tempStringChars.length; k++)
			{
				out.print(tempStringChars[k]);
			}
			if( i != wordArray.length - 1)
			{
				System.out.print(" ");
			}

		}
	}
}
