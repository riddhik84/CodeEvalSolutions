package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SelfDescribingNumbers {

	public static void main(String args[])
	{
		SelfDescribingNumbers sf = new SelfDescribingNumbers();
		String line;
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\selfdescrnumbers.txt");
		File file = new File(args[0]);

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null)
			{
				//System.out.println(line);
				sf.findSelfDescribingNumbers(line.trim());
			}

		} catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void findSelfDescribingNumbers(String numberString)
	{
		char[] inputStringArray = numberString.toCharArray();
		int lineLen = inputStringArray.length;
		//System.out.println("lineLen : " + lineLen);
		
		int[] inputIntArray = new int[lineLen];
		int[] outputIntArray = new int[lineLen];
		int tempNum = 0;

		//Generate int array
		for(int i = 0; i < lineLen; i ++)
		{
			inputIntArray[i] = Integer.parseInt(Character.toString(inputStringArray[i]));
		}
		//System.out.println("intArray : " + inputIntArray.length);
		
		for (int k = 0; k < inputIntArray.length; k++)
		{
			//System.out.print(inputIntArray[k]);
		}
		//System.out.println("");
		
		for(int a=0; a < lineLen; a++)
		{
			for(int b=0; b< lineLen; b++)
			{
				if(inputIntArray[b] == a)
				{
					tempNum++;
					outputIntArray[a] = tempNum;
				}
				//System.out.println("a value " + a + " " + tempNum);
			}
			tempNum = 0;
		}

		for (int k = 0; k < outputIntArray.length; k++)
		{
			//System.out.print(outputIntArray[k]);
		}
		
		//System.out.println("");
		
		if(Arrays.equals(inputIntArray, outputIntArray))
		{
			System.out.println("1");
		} else
		{
			System.out.println("0");
		}
	}
}
