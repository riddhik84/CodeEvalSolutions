package com.easy.challenges;

import java.io.*;

public class EvenNumbers {
	
	public static void main(String args[])
	{
		EvenNumbers en = new EvenNumbers();

		File file = new File("C:\\workspace\\CodeEval\\CodeEval\\CodeEval\\src\\InputFiles\\EvenOddNumbers.txt");
		//File file = new File(args[0]);
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine())!= null) {
				//System.out.println(line);
				en.printEvenOddNum(line);
			}
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void printEvenOddNum(String line)
	{
		int number = Integer.parseInt(line);
		
		if(number%2 == 0)
		{
			System.out.println("1");
		} else
		{
			System.out.println("0");

		}
	}

}
