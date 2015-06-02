package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class BeautifulStrings {

	public static void main(String args[])
	{
		BeautifulStrings bf = new BeautifulStrings();
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\BeautifulStrings.txt");
		File file = new File(args[0]);
		String line;

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file) );
			while((line = br.readLine()) != null)
			{
				//System.out.println("Input line: " + line);
				bf.calcBeautifulStrings(line);
			}
		} catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void calcBeautifulStrings(String line)
	{
		line = line.toLowerCase();
		//System.out.println("Lower case line: " + line);

		char[] lineArray = line.toCharArray();
		int lineLen = lineArray.length;
		int searchCharLen = lineLen;
		char tempChar = 0;
		char currentChar = 0;
		int tempCharCount = 0;
		int maxValue = 0;
		
		int beautyCount = 0;
		int beautyCounter = 26;

		Hashtable<Character, Integer> charValues = new Hashtable<Character, Integer>();
		ArrayList<Integer> iterationValues = new ArrayList<Integer>();
				
		for(int i = 0; i < lineLen; i ++)
		{
			currentChar = lineArray[i];
			if(!charValues.containsKey(currentChar))
			{
				if((Character.isLetter(lineArray[i])) == true)
				{
					tempChar = lineArray[i];
					for(int j = 0; j < searchCharLen; j++)
					{
						if(lineArray[j] == tempChar)
						{
							tempCharCount++;
						}

						if(tempCharCount > maxValue)
						{
							maxValue = tempCharCount;
						}
					}
					//System.out.println("Character " + tempChar + " is " + tempCharCount +" times");
					charValues.put(tempChar, tempCharCount);
					tempCharCount = 0;
					//System.out.println("Max Value " +maxValue);
					iterationValues.add(maxValue);
					maxValue = 0;
				}
			}
		}
		
		//System.out.println("charValues size " +charValues.size());
		//System.out.println("iterationValues size " +iterationValues.size());
		Collections.sort(iterationValues);
		
		for(int k = iterationValues.size() - 1; k >= 0 ; k--)
		{
			//System.out.println(iterationValues.get(k));
			beautyCount = beautyCount + (iterationValues.get(k) * beautyCounter);
			
			beautyCounter--;
		}
		//System.out.println("BeautyCount " +beautyCount);
		System.out.println(beautyCount);

	}	
}
