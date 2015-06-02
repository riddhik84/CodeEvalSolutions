package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Armstrong {

	public static void main(String args[])
	{
		Armstrong an = new Armstrong();
		String line;
		
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\ArmstrongNumber.txt");
		File file = new File(args[0]);
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//System.out.println("Original Number :" +line);
				an.calcArmstrongNum(line);
				
			}
		} catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void calcArmstrongNum(String line)
	{
		int originalNumber = Integer.parseInt(line);
		int inputNumber = originalNumber;
		int modVal = 0;
		int outputNumber = 0;
		int len = 0;
		
		while(inputNumber != 0)
		{
			len++;
			inputNumber = inputNumber/10;
		}
		int power = len;
		//System.out.println("power :" + power);

		inputNumber = originalNumber;
		//System.out.println("inputNumber :" + inputNumber);
		while(len != 0)
		{
			modVal = inputNumber%10;
			//System.out.println("movVal :" + modVal);
			outputNumber = outputNumber + (calcPower(modVal, power));
			inputNumber = inputNumber/10;
			
		  len--;
		}		
		//System.out.println("outputNumber :" + outputNumber);
		
		if(originalNumber == outputNumber)
		{
			System.out.println("True");
		} else
		{
			System.out.println("False");
		}
		 
	}
	
	public int calcPower(int number, int power)
	{
		int powerValue = 1;
		for(int i = 0; i < power; i ++)
		{
			powerValue = powerValue * number;
		}
		return powerValue;
	}
}
