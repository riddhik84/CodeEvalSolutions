package com.easy.challenges;

import java.io.*;

public class PenultimateWord {

	public static void main(String args[])
	{
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\PenultimateWord.txt");
		File file = new File(args[0]);
		String line;
		String[] lineValues;
		int lineLen;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null)
			{
				//System.out.println(line);
				lineValues = line.split(" ");
				lineLen = lineValues.length;
				
				if(lineLen == 1) 
				{
					System.out.println(lineValues[0]);
				} else
				{
					System.out.println(lineValues[lineLen - 2]);
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
}
