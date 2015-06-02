package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NmodN {

	public static void main(String args[])
	{
		NmodN nm = new NmodN();
		String line;
		String[] stringValues;
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\nmodn.txt");
		File file = new File(args[0]);
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null)
			{
				//System.out.println(line);
				stringValues = line.split(",");
				double N = Double.parseDouble(stringValues[0]);
				double M = Double.parseDouble(stringValues[1]);
				
				nm.calculateNmodN(N, M);
			}

		} catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void calculateNmodN(double N, double M)
	{
		double modOriginal = 0d;
		
		modOriginal = N%M;
		//System.out.println("mod original : " + modOriginal);
		
		double div = 0d;
		double sub = 0d;
		double mod = 0d;
		
		div = N/M;
		//System.out.println("div " + div);
		
		sub = div - (long) div;
		//System.out.println("sub " + sub);		

		mod = sub * M;
		//System.out.println("mod " + mod);		

		//System.out.println("Generated : " + Math.round(mod));		
		System.out.println(Math.round(mod));		

	}
}
