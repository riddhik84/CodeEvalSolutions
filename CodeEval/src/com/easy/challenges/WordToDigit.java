package com.easy.challenges;

import java.io.*;
import static java.lang.System.out;

public class WordToDigit {

	public static void main(String args[])
	{
		WordToDigit wtd = new WordToDigit();

		//File file = new File(args[0]);
		File file = new File("C:\\Users\\rkakadia\\git\\CodeEval\\src\\com\\easy\\inputFiles\\WordToDigit.txt");
		String line;

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//out.println(line);
				wtd.printWordToDogit(line);
			}
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void printWordToDogit(String line)
	{
		String[] wordDigits = line.split(";");
		int convertedDigit = 0;

		for(int i = 0; i < wordDigits.length; i++)
		{
			convertedDigit = convertWordToDigit(wordDigits[i]);
			out.print(convertedDigit);
		}
		out.println();
	}

	public int convertWordToDigit(String word)
	{
		int digit = 0;

		switch(word) {
		case "zero": digit = 0;
		break;
		case "one": digit = 1;
		break;
		case "two": digit = 2;
		break;
		case "three": digit = 3;
		break;
		case "four": digit = 4;
		break;
		case "five": digit = 5;
		break;
		case "six": digit = 6;
		break;
		case "seven": digit = 7;
		break;
		case "eight": digit = 8;
		break;
		case "nine": digit = 9;
		break;		
		}

		return digit;
	}


}
