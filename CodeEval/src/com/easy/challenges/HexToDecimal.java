package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HexToDecimal {

	public static void main(String args[])
	{
		HexToDecimal htd = new HexToDecimal();
		String line;
		Integer outputValue;
		
		File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\hextodecimal.txt");
		//File file = new File(args[0]);
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
		
			while ((line = br.readLine()) != null)
			{
				//System.out.println("Decimal Value :" + line);
				outputValue = Integer.parseInt(line, 16);
				//System.out.println("Decimal Value :" +outputValue);
				System.out.println(outputValue);

			}
		} catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

}